package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

        //
        // delete the current filters
        for (final Class<? extends IsSerializable> clazz : Arrays.asList( //
                //
                AuthorFilter.class, //
                EditorFilter.class, //
                CategoryFilter.class)) {

            final Queue queue = deleteFilter(clazz, startTime);
            if (queue != null) {
                return;
            }
        }

        //
        // loop through all books to create the filters
        final Query<Book> query = dao.ofy().query(Book.class);

        final String cursorParam = req.getParameter("cursor");
        if (cursorParam != null) {
            query.startCursor(Cursor.fromWebSafeString(cursorParam));
        }

        final QueryResultIterator<Book> itr = query.iterator();
        while (itr.hasNext()) {
            final Book book = itr.next();

            Queue queue = putFilterAuthor(book);
            if (queue != null) {
                return;
            }

            queue = putFilterEditor(book);
            if (queue != null) {
                return;
            }

            queue = putFilterCategory(book);
            if (queue != null) {
                return;
            }
        }
    }

    private <T extends IsSerializable> Queue deleteFilter(final Class<T> clazz, final long startTime) {

        if (!hasFilterOfType(clazz)) {
            return null;
        }

        final QueryResultIterator<T> itr = dao.ofy().query(clazz).iterator();
        while (itr.hasNext()) {

            dao.ofy().delete(itr.next());

            if (hasReachedTimeOut(startTime)) {
                final Queue queue = QueueFactory.getQueue("buildFilters");
                queue.add(TaskOptions.Builder.withUrl("/buildFilters"));
                return queue;
            }
        }
        return null;
    }

    private boolean hasReachedTimeOut(final long startTime) {
        return System.currentTimeMillis() - startTime > LIMIT_MS;
    }

    private <T> boolean hasFilterOfType(final Class<T> clazz) {
        return dao.ofy().query(clazz).getKey() != null;
    }

    private Queue putFilterCategory(final Book book) {
        final String category = book.getCategory();

        final int count = dao.ofy().query(CategoryFilter.class).filter("value", category).count();

        if (count == 0) {

            dao.ofy().put(new CategoryFilter().value(category));
            try {
                Thread.sleep(200); // give time for the indexer
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Queue putFilterEditor(final Book book) {
        final String editor = book.getEditor();

        final int count = dao.ofy().query(EditorFilter.class).filter("value", editor).count();

        if (count == 0) {

            dao.ofy().put(new EditorFilter().value(editor));
            try {
                Thread.sleep(200); // give time for the indexer
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Queue putFilterAuthor(final Book book) {
        final String author = book.getAuthor();

        final int count = dao.ofy().query(AuthorFilter.class).filter("value", author).count();

        if (count == 0) {

            dao.ofy().put(new AuthorFilter().value(author));
            try {
                Thread.sleep(200); // give time for the indexer
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
