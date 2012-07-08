package com.pgu.books.server.rpc;

import static com.pgu.books.server.domain.document.BookDoc.AUTHOR;
import static com.pgu.books.server.domain.document.BookDoc.BOOK_ID;
import static com.pgu.books.server.domain.document.BookDoc.CATEGORY;
import static com.pgu.books.server.domain.document.BookDoc.COMMENT;
import static com.pgu.books.server.domain.document.BookDoc.EDITOR;
import static com.pgu.books.server.domain.document.BookDoc.TITLE;
import static com.pgu.books.server.domain.document.BookDoc.YEAR;

import java.util.ArrayList;
import java.util.TreeMap;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.search.QueryOptions;
import com.google.appengine.api.search.Results;
import com.google.appengine.api.search.ScoredDocument;
import com.google.appengine.api.search.SortExpression;
import com.google.appengine.api.search.SortOptions;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Query;
import com.pgu.books.client.rpc.BooksService;
import com.pgu.books.server.AppLog;
import com.pgu.books.server.DocUtils;
import com.pgu.books.server.Search;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.AuthorFilter;
import com.pgu.books.server.domain.AuthorLetterFilter;
import com.pgu.books.server.domain.BookWord;
import com.pgu.books.server.domain.Category2Books;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.CategoryLetterFilter;
import com.pgu.books.server.domain.Editor2Books;
import com.pgu.books.server.domain.EditorFilter;
import com.pgu.books.server.domain.EditorLetterFilter;
import com.pgu.books.server.domain.Entity2Books;
import com.pgu.books.server.domain.Filter;
import com.pgu.books.server.domain.LetterFilter;
import com.pgu.books.server.domain.Word;
import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.dto.BooksQueryParameters;
import com.pgu.books.shared.dto.BooksResult;

@SuppressWarnings("serial")
public class BooksServiceImpl extends RemoteServiceServlet implements BooksService {

    private final AppLog   log  = new AppLog();
    private final DAO      dao  = new DAO();
    private final Search   s    = new Search();
    private final DocUtils docU = new DocUtils();

    /**
     * http://code.google.com/p/google-app-engine-samples/source/browse/trunk/search/java/src/com/google/appengine/
     * demos/search/TextSearchServlet.java
     */
    @Override
    public BooksResult fetchBooks(final BooksQueryParameters queryParameters, final int start, final int length) {

        final int limit = length;

        final SortOptions sortOptions = SortOptions
                .newBuilder()
                .addSortExpression(
                        SortExpression
                                .newBuilder()
                                .setExpression(queryParameters.getSortField().toString().toUpperCase())
                                .setDirection(
                                        queryParameters.isAscending() ? SortExpression.SortDirection.DESCENDING
                                                : SortExpression.SortDirection.ASCENDING).setDefaultValue("")).build();

        final com.google.appengine.api.search.Query query = com.google.appengine.api.search.Query.newBuilder()
                .setOptions(QueryOptions.newBuilder() //
                        .setOffset(start) //
                        .setLimit(limit) //
                        .setSortOptions(sortOptions) //
                        .build()).build("");
        final Results<ScoredDocument> results = s.idx().search(query);

        final ArrayList<Book> books = new ArrayList<Book>(limit);
        for (final ScoredDocument doc : results) {
            final Book book = new Book() //
                    .id(docU.numLong(BOOK_ID, doc)) //
                    .author(docU.text(AUTHOR, doc)) //
                    .title(docU.text(TITLE, doc)) //
                    .editor(docU.text(EDITOR, doc)) //
                    .year(docU.numInt(YEAR, doc)) //
                    .comment(docU.text(COMMENT, doc)) //
                    .category(docU.text(CATEGORY, doc)) //
            ;
            books.add(book);
        }

        final BooksResult booksResult = new BooksResult();
        booksResult.setBooks(books);
        booksResult.setNbFound(results.getNumberFound());
        return booksResult;
    }

    private ArrayList<Book> fetchBooksWithObjectify(final BooksQueryParameters queryParameters, final int start,
            final int length) {
        final Query<Book> query = dao.ofy().query(Book.class);
        //
        // filters
        // TODO PGU update fetch books by search with the filters
        applyFilters(queryParameters, query);

        //
        // order
        final String sortDirection = queryParameters.isAscending() ? "" : "-";
        final String sortField = queryParameters.getSortField().toString().toLowerCase();
        query.order(sortDirection + sortField);

        // TODO PGU limit the filters numbers; handle the cursor on filter ids
        // http://stackoverflow.com/questions/6905898/illegalargumentexception-splitting-the-provided-query-requires-that-too-many-su
        final QueryResultIterator<Book> itr = query.offset(start).limit(length).iterator();

        final ArrayList<Book> books = new ArrayList<Book>(length);
        while (itr.hasNext()) {
            books.add(itr.next());
        }

        return books;
    }

    private void applyFilters(final BooksQueryParameters filtersDTO, final Query<Book> query) {

        if (!filtersDTO.getSelectedAuthors().isEmpty()) {
            query.filter("author in", filtersDTO.getSelectedAuthors());
        }

        if (!filtersDTO.getSelectedEditors().isEmpty()) {
            query.filter("editor in", filtersDTO.getSelectedEditors());
        }

        if (!filtersDTO.getSelectedCategories().isEmpty()) {
            query.filter("category in", filtersDTO.getSelectedCategories());
        }

        final String searchText = filtersDTO.getSearchText().trim();
        if (!searchText.isEmpty()) {

            final Query<BookWord> qBW = dao.ofy().query(BookWord.class);
            final QueryResultIterator<BookWord> itrBW = qBW.filter("value =", searchText.toLowerCase()).iterator();

            final ArrayList<Long> bookIds = new ArrayList<Long>();
            while (itrBW.hasNext()) {
                bookIds.add(itrBW.next().getBookId());
            }

            if (!bookIds.isEmpty()) {
                query.filter("id in", bookIds);
            }
        }
    }

    @Override
    public ArrayList<String> fetchWords(final String text) {

        // TODO PGU do a query on docs

        if (text == null || text.isEmpty() || text.trim().isEmpty()) {
            return new ArrayList<String>();
        }

        final String value = text.trim();

        final Query<Word> query = dao.ofy().query(Word.class) //
                .filter("value >=", value) //
                .filter("value <", value + "\uFFFD");

        final int nbWords = query.count();
        final ArrayList<String> words = new ArrayList<String>(nbWords);

        final QueryResultIterator<Word> itr = query.iterator();
        while (itr.hasNext()) {

            words.add(itr.next().getDisplay());
        }
        return words;
    }

    @Override
    public ArrayList<String> countAuthorsByLetters() {
        return fetchCounts(AuthorLetterFilter.class);
    }

    @Override
    public ArrayList<String> countEditorsByLetters() {
        return fetchCounts(EditorLetterFilter.class);
    }

    @Override
    public ArrayList<String> countCategoriesByLetters() {
        return fetchCounts(CategoryLetterFilter.class);
    }

    private ArrayList<String> fetchCounts(final Class<? extends LetterFilter> letterClass) {

        final Query<? extends LetterFilter> query = dao.ofy().query(letterClass);

        final int nbItems = query.count();
        final ArrayList<String> letters = new ArrayList<String>(nbItems);

        final QueryResultIterator<? extends LetterFilter> itr = query.order("letter").iterator();
        while (itr.hasNext()) {

            letters.add(itr.next().getLetter());
        }
        return letters;
    }

    @Override
    public ArrayList<String> fetchFilterCategories(final String letter) {
        return fetchFilters(letter, CategoryFilter.class);
    }

    @Override
    public ArrayList<String> fetchFilterEditors(final String letter) {
        return fetchFilters(letter, EditorFilter.class);
    }

    @Override
    public ArrayList<String> fetchFilterAuthors(final String letter) {
        return fetchFilters(letter, AuthorFilter.class);
    }

    private ArrayList<String> fetchFilters(final String letter, final Class<? extends Filter> clazz) {

        final String uppercaseLetter = letter.toUpperCase();
        final String lowercaseLetter = letter.toLowerCase();

        final Query<? extends Filter> upperQuery = dao.ofy().query(clazz) //
                .filter("value >=", uppercaseLetter) //
                .filter("value <", uppercaseLetter + "\uFFFD");

        final Query<? extends Filter> lowerQuery = dao.ofy().query(clazz) //
                .filter("value >=", lowercaseLetter) //
                .filter("value <", lowercaseLetter + "\uFFFD");

        final int nbItems = upperQuery.count() + lowerQuery.count();
        final ArrayList<String> filters = new ArrayList<String>(nbItems);

        final QueryResultIterator<? extends Filter> upperItr = upperQuery.order("value").iterator();
        final QueryResultIterator<? extends Filter> lowerItr = lowerQuery.order("value").iterator();
        while (upperItr.hasNext()) {

            filters.add(upperItr.next().getValue());
        }
        while (lowerItr.hasNext()) {

            filters.add(lowerItr.next().getValue());
        }
        return filters;
    }

    @Override
    public TreeMap<String, Integer> fetchNbBooksByCategories() {
        return fetchNbBooksByEntity(Category2Books.class);
    }

    @Override
    public TreeMap<String, Integer> fetchNbBooksByEditors() {
        return fetchNbBooksByEntity(Editor2Books.class);
    }

    private <T extends Entity2Books> TreeMap<String, Integer> fetchNbBooksByEntity(final Class<T> clazz) {
        final TreeMap<String, Integer> data = new TreeMap<String, Integer>();

        final QueryResultIterator<T> itr = dao.ofy().query(clazz).iterator();

        while (itr.hasNext()) {
            final T datum = itr.next();
            data.put(datum.getLabel(), datum.getCount());
        }
        return data;
    }

}
