package com.pgu.books.server.rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.google.appengine.api.datastore.QueryResultIterable;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Query;
import com.pgu.books.client.BooksService;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.AuthorFilter;
import com.pgu.books.server.domain.AuthorLetterFilter;
import com.pgu.books.server.domain.BookWord;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.CategoryLetterFilter;
import com.pgu.books.server.domain.EditorFilter;
import com.pgu.books.server.domain.EditorLetterFilter;
import com.pgu.books.server.domain.Filter;
import com.pgu.books.server.domain.LetterFilter;
import com.pgu.books.server.domain.Word;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BookCategory;
import com.pgu.books.shared.BooksFiltersDTO;

@SuppressWarnings("serial")
public class BooksServiceImpl extends RemoteServiceServlet implements BooksService {

    private static final Logger LOG = Logger.getLogger(BooksServiceImpl.class.getSimpleName());

    private final DAO dao = new DAO();

    @Override
    public String testImport() {
        return importBooks(BookCategory.titles.get(0));
    }

    @Override
    public String importBooks(final String categoryTitle) {
        final long startTime = System.currentTimeMillis();

        final InputStream is = getServletContext().getResourceAsStream("/WEB-INF/books/" + categoryTitle + ".txt");
        final BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {

            int countTotal = 0;
            int countImported = 0;

            String line = null;
            while ((line = br.readLine()) != null) {
                countTotal++;

                final String[] tokens = line.split("\", \"");
                if (tokens.length == 6) {
                    countImported++;

                    final String authorRaw = tokens[0];
                    final String author = authorRaw.isEmpty() ? "" : authorRaw.substring(1); // removes first "

                    final String categoryRaw = tokens[5];
                    final String category = categoryRaw.isEmpty() ? "" : categoryRaw.substring(0,
                            categoryRaw.length() - 1); // removes last "

                    final String title = tokens[1];
                    final String editor = tokens[2];
                    final String year = tokens[3];
                    final String comment = tokens[4];

                    dao.ofy().put(new Book(author, title, editor, year, comment, category));

                } else {
                    LOG.warning("Not imported: " + line);
                }
            }

            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_WORDS);
            queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_WORDS));

            return countImported + " / " + countTotal + " (" + (System.currentTimeMillis() - startTime) + " ms)";

        } catch (final IOException e) {
            e.printStackTrace();
        }

        return "An error occurred!";
    }

    @Override
    public ArrayList<Book> fetchBooks(final BooksFiltersDTO filtersDTO, final int start, final int length) {

        final Query<Book> query = dao.ofy().query(Book.class);
        applyFilters(filtersDTO, query);

        // TODO PGU
        // http://stackoverflow.com/questions/6905898/illegalargumentexception-splitting-the-provided-query-requires-that-too-many-su
        final QueryResultIterator<Book> itr = query.order("title").offset(start).limit(length).iterator();

        final ArrayList<Book> books = new ArrayList<Book>(length);
        while (itr.hasNext()) {
            books.add(itr.next());
        }

        return books;
    }

    @Override
    public int countBooks(final BooksFiltersDTO filtersDTO) {

        final Query<Book> query = dao.ofy().query(Book.class);

        applyFilters(filtersDTO, query);

        return query.count();
    }

    private void applyFilters(final BooksFiltersDTO filtersDTO, final Query<Book> query) {

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
    public void delete() {
        // TODO PGU use a cursor + only in local mode
        final QueryResultIterable<Key<Book>> keys = dao.ofy().query(Book.class).fetchKeys();
        dao.ofy().delete(keys);
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

        final Query<? extends Filter> query = dao.ofy().query(clazz) //
                .filter("value >=", letter) //
                .filter("value <", letter + "\uFFFD");

        final int nbItems = query.count();
        final ArrayList<String> filters = new ArrayList<String>(nbItems);

        final QueryResultIterator<? extends Filter> itr = query.order("value").iterator();
        while (itr.hasNext()) {

            filters.add(itr.next().getValue());
        }
        return filters;
    }

}
