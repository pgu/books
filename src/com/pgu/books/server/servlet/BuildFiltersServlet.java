package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.Query;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.AuthorFilter;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.EditorFilter;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BuildFiltersServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(BuildFiltersServlet.class.getName());

    private static final long LIMIT_MS = 1000 * 25;
    private static final String URL_BUILD_FILTERS = "/buildFilters";
    private static final String QUEUE_BUILD_FILTERS = "buildFilters";
    private static final String PARAM_CURSOR = "cursor";

    private final DAO dao = new DAO();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {
        LOGGER.info("...GET request ");
        doPost(req, resp);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {

        final long startTime = System.currentTimeMillis();
        LOGGER.info("...POST request ");

        //
        // delete the current filters
        for (final Class<? extends IsSerializable> clazz : Arrays.asList( //
                //
                AuthorFilter.class, //
                EditorFilter.class, //
                CategoryFilter.class)) {

            final boolean hasReachedTimeOut = deleteFilter(clazz, startTime);
            if (hasReachedTimeOut) {
                print("delete in process", resp, startTime);
                return;
            }
        }

        //
        // loop through all books to create the filters
        final Query<Book> query = dao.ofy().query(Book.class);

        final String cursorParam = req.getParameter(PARAM_CURSOR);
        if (cursorParam != null) {
            query.startCursor(Cursor.fromWebSafeString(cursorParam));
        }

        final List<String> cacheAuthor = new ArrayList<String>(500); // use local cache to avoid latence with the
                                                                     // indexer
        final List<String> cacheEditor = new ArrayList<String>(500);
        final List<String> cacheCategory = new ArrayList<String>(500);

        final QueryResultIterator<Book> itr = query.iterator();
        while (itr.hasNext()) {
            final Book book = itr.next();

            putFilterAuthor(book, cacheAuthor);
            putFilterEditor(book, cacheEditor);
            putFilterCategory(book, cacheCategory);

            if (hasReachedTimeOut(startTime)) {
                final Queue queue = QueueFactory.getQueue(QUEUE_BUILD_FILTERS);
                queue.add(TaskOptions.Builder.withUrl(URL_BUILD_FILTERS) //
                        .param(PARAM_CURSOR, itr.getCursor().toWebSafeString()));
                print("put in process", resp, startTime);
                return;
            }
        }
        print("Building filters is over :-)", resp, startTime);
    }

    private void print(final String msg, final HttpServletResponse resp, final long startTime) throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println(msg + " (" + (System.currentTimeMillis() - startTime) + " ms)");
    }

    private <T extends IsSerializable> boolean deleteFilter(final Class<T> clazz, final long startTime) {

        final boolean hasFilter = dao.ofy().query(clazz).limit(1).count() > 0;

        if (hasFilter) {
            final QueryResultIterator<T> itr = dao.ofy().query(clazz).iterator();
            while (itr.hasNext()) {

                dao.ofy().delete(itr.next());

                if (hasReachedTimeOut(startTime)) {
                    final Queue queue = QueueFactory.getQueue(QUEUE_BUILD_FILTERS);
                    queue.add(TaskOptions.Builder.withUrl(URL_BUILD_FILTERS));
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasReachedTimeOut(final long startTime) {
        return System.currentTimeMillis() - startTime > LIMIT_MS;
    }

    private void putFilterCategory(final Book book, final List<String> cache) {
        final String category = book.getCategory();

        final boolean doesNotExist = //
        dao.ofy().query(CategoryFilter.class).filter("value", category).limit(1).count() == 0 //
                && !cache.contains(category);

        if (doesNotExist) {
            dao.ofy().put(new CategoryFilter().value(category));
            cache.add(category);
        }
    }

    private void putFilterEditor(final Book book, final List<String> cache) {
        final String editor = book.getEditor();

        final boolean doesNotExist = //
        dao.ofy().query(EditorFilter.class).filter("value", editor).limit(1).count() == 0 //
                && !cache.contains(editor);

        if (doesNotExist) {
            dao.ofy().put(new EditorFilter().value(editor));
            cache.add(editor);
        }
    }

    private void putFilterAuthor(final Book book, final List<String> cache) {
        final String author = book.getAuthor();

        final boolean doesNotExist = //
        dao.ofy().query(AuthorFilter.class).filter("value", author).limit(1).count() == 0 //
                && !cache.contains(author);

        if (doesNotExist) {
            dao.ofy().put(new AuthorFilter().value(author));
            cache.add(author);
        }
    }

}
