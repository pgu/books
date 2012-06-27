package com.pgu.books.server.rpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.search.Index;
import com.google.appengine.api.search.IndexSpec;
import com.google.appengine.api.search.QueryOptions;
import com.google.appengine.api.search.Results;
import com.google.appengine.api.search.ScoredDocument;
import com.google.appengine.api.search.SearchServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Query;
import com.pgu.books.client.rpc.BooksService;
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
import com.pgu.books.server.domain.document.DocUtils;
import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.dto.BooksQueryParameters;

@SuppressWarnings("serial")
public class BooksServiceImpl extends RemoteServiceServlet implements BooksService {

    private static final Logger LOG   = Logger.getLogger(BooksServiceImpl.class.getSimpleName());

    private final DAO           dao   = new DAO();

    private static final Index  INDEX = SearchServiceFactory.getSearchService().getIndex(
                                              IndexSpec.newBuilder().setName("shared_index"));

    /**
     * TODO http://code.google.com/p/google-app-engine-samples/source/browse/trunk/search/java/src/com/google/appengine/
     * demos/search/TextSearchServlet.java
     */
    public void testSearch() {
        final HttpServletRequest req = null;

        // action remove
        final ArrayList<Long> bookIds = (ArrayList<Long>) Arrays.asList(1L, 2L);
        remove(bookIds);

        // action search
        search(req);

        // sends result
    }

    private ArrayList<Book> search(final HttpServletRequest req) {

        final String _queryStr = req.getParameter("query");
        final String queryStr = _queryStr == null ? "" : _queryStr;

        final Integer limit = Integer.parseInt(req.getParameter("limit")); // 10

        final com.google.appengine.api.search.Query query = com.google.appengine.api.search.Query.newBuilder()
                .setOptions(QueryOptions.newBuilder().setLimit(limit).build()).build(queryStr);
        final Results<ScoredDocument> results = INDEX.search(query);

        final ArrayList<Book> books = new ArrayList<Book>(limit);
        for (final ScoredDocument scoredDoc : results) {
            final Book book = new Book() //
                    .id(DocUtils.getOnlyFieldNumeric("id", scoredDoc).longValue()) //
                    .author(DocUtils.getOnlyField("author", scoredDoc)) //
                    .title(DocUtils.getOnlyField("title", scoredDoc)) //
                    .editor(DocUtils.getOnlyField("editor", scoredDoc)) //
                    .year(DocUtils.getOnlyFieldNumeric("year", scoredDoc).intValue()) //
                    .comment(DocUtils.getOnlyField("comment", scoredDoc)) //
                    .category(DocUtils.getOnlyField("category", scoredDoc)) //
            ;
            books.add(book);
        }
        return books;
    }

    private void remove(final ArrayList<Long> bookIds) {
        for (final Long bookId : bookIds) {
            INDEX.remove(Long.toString(bookId));
        }
    }

    @Override
    public ArrayList<Book> fetchBooks(final BooksQueryParameters queryParameters, final int start, final int length) {

        final Query<Book> query = dao.ofy().query(Book.class);
        //
        // filters
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

    @Override
    public int countBooks(final BooksQueryParameters filtersDTO) {

        final Query<Book> query = dao.ofy().query(Book.class);

        applyFilters(filtersDTO, query);

        return query.count();
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
