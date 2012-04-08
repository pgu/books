package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpStatus;

import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Query;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.AuthorFilter;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.EditorFilter;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.AppUtils;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BuildFiltersServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(BuildFiltersServlet.class.getName());

    private final DAO dao = new DAO();

    private static final String PARAM_ACTION = "action";
    private static final String ACTION_START = "start";
    private static final String ACTION_DELETE = "delete";
    private static final String ACTION_PUT = "put";
    private static final String ACTION_CLEAN = "clean";

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

        final String action = req.getParameter(PARAM_ACTION);
        if (action == null //
                || !ACTION_START.equalsIgnoreCase(action) //
                || !ACTION_DELETE.equalsIgnoreCase(action) //
                || !ACTION_PUT.equalsIgnoreCase(action) //
                || !ACTION_CLEAN.equalsIgnoreCase(action) //
        ) {
            resp.setStatus(HttpStatus.SC_BAD_REQUEST);
            resp.setContentType("text/plain");
            resp.getWriter().print("Illegal action for this request: " + action);
        }

        if (ACTION_START.equalsIgnoreCase(action) //
                || ACTION_DELETE.equalsIgnoreCase(action)) {

            // delete the current filters
            for (final Class<? extends IsSerializable> clazz : Arrays.asList( //
                    AuthorFilter.class, //
                    EditorFilter.class, //
                    CategoryFilter.class)) {

                final boolean hasReachedTimeOut = deleteFilter(clazz, startTime);
                if (hasReachedTimeOut) {

                    final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                    queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS).param(PARAM_ACTION, ACTION_DELETE));

                    print("Deletion in process", resp, startTime);
                    return;
                }
            }
            // next step: put new filters
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
            queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS).param(PARAM_ACTION, ACTION_PUT));

            print("Deletion process is over", resp, startTime);
            return;

        } else if (ACTION_PUT.equalsIgnoreCase(action)) {
            //
            // loop through all books to create the filters
            final Query<Book> query = dao.ofy().query(Book.class);

            final String cursorParam = req.getParameter(AppUrls.PARAM_CURSOR);
            if (cursorParam != null) {
                query.startCursor(Cursor.fromWebSafeString(cursorParam));
            }

            final QueryResultIterator<Book> itr = query.iterator();
            while (itr.hasNext()) {
                final Book book = itr.next();

                dao.ofy().put(new AuthorFilter().value(book.getAuthor()));
                dao.ofy().put(new EditorFilter().value(book.getEditor()));
                dao.ofy().put(new CategoryFilter().value(book.getCategory()));

                if (AppUtils.hasReachedTimeOut(startTime)) {
                    final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                    queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS) //
                            .param(PARAM_ACTION, ACTION_PUT) //
                            .param(AppUrls.PARAM_CURSOR, itr.getCursor().toWebSafeString()));

                    print("Creation in process", resp, startTime);
                    return;
                }
            }

            // next step: remove duplicates
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
            queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS).param(PARAM_ACTION, ACTION_CLEAN));

            print("Creation process is over", resp, startTime);
            return;

        } else if (ACTION_CLEAN.equalsIgnoreCase(action)) {
            //
            // loop through all filters to remove duplicates
            final Query<AuthorFilter> query = dao.ofy().query(AuthorFilter.class);

            final String cursorParam = req.getParameter(AppUrls.PARAM_CURSOR);
            if (cursorParam != null) {
                query.startCursor(Cursor.fromWebSafeString(cursorParam));
            }

            final QueryResultIterator<AuthorFilter> itr = query.iterator();
            while (itr.hasNext()) {
                final AuthorFilter authorFilter = itr.next();

                final List<Key<AuthorFilter>> keys = dao.ofy().query(AuthorFilter.class)
                        .filter("value", authorFilter.getValue()).listKeys();

                if (keys.size() > 1) {
                    keys.remove(keys.size() - 1); // keeps one value
                    dao.ofy().delete(keys); // delete the others
                }

                if (AppUtils.hasReachedTimeOut(startTime)) {
                    final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                    queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS) //
                            .param(PARAM_ACTION, ACTION_CLEAN) //
                            .param(AppUrls.PARAM_CURSOR, itr.getCursor().toWebSafeString()));

                    print("Cleaning in process", resp, startTime);
                    return;
                }
            }

            print("Cleaning process is over", resp, startTime);
            return;

        } else {
            throw new IllegalArgumentException("Unknown action: " + action);
        }
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

                if (AppUtils.hasReachedTimeOut(startTime)) {
                    return true;
                }
            }
        }
        return false;
    }

}
