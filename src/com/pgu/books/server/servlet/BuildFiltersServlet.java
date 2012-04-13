package com.pgu.books.server.servlet;

import java.io.IOException;
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
import com.googlecode.objectify.Query;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.AuthorFilter;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.EditorFilter;
import com.pgu.books.server.domain.IsFilter;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.AppUtils;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BuildFiltersServlet extends HttpServlet {

    private static final Logger       LOGGER          = Logger.getLogger(BuildFiltersServlet.class.getName());

    private final DAO                 dao             = new DAO();

    private static final String       PARAM_ACTION    = "action";
    private static final String       ACTION_START    = "start";
    private static final String       ACTION_DELETE   = "delete";
    private static final String       ACTION_PUT      = "put";
    private static final String       ACTION_CLEAN    = "clean";
    private static final String       ACTION_COUNTS   = "counts";

    private static final List<String> actions         = Arrays.asList(ACTION_CLEAN, ACTION_DELETE, ACTION_PUT,
                                                              ACTION_START);

    private static final String       PARAM_FILTER    = "filter";
    private static final String       FILTER_AUTHOR   = "author";
    private static final String       FILTER_EDITOR   = "editor";
    private static final String       FILTER_CATEGORY = "category";

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
                || !actions.contains(action.toLowerCase())) {
            AppUtils.setBadRequest("Illegal action for this request: " + action, resp, LOGGER);
            return;
        }

        if (ACTION_START.equalsIgnoreCase(action) //
                || ACTION_DELETE.equalsIgnoreCase(action)) {

            // delete the current filters
            for (final Class<? extends IsFilter> clazz : Arrays.asList( //
                    AuthorFilter.class, //
                    EditorFilter.class, //
                    CategoryFilter.class)) {

                final boolean hasReachedTimeOut = deleteFilter(clazz, startTime);
                if (hasReachedTimeOut) {

                    final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                    queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS).param(PARAM_ACTION, ACTION_DELETE));

                    AppUtils.print("Deletion in process", resp, startTime, LOGGER);
                    return;
                }
            }
            // next step: put new filters
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
            queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS).param(PARAM_ACTION, ACTION_PUT));

            AppUtils.print("Deletion process is over", resp, startTime, LOGGER);
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

                    AppUtils.print("Creation in process", resp, startTime, LOGGER);
                    return;
                }
            }

            // next step: remove duplicates
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
            queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS).param(PARAM_ACTION, ACTION_CLEAN));

            AppUtils.print("Creation process is over", resp, startTime, LOGGER);
            return;

        } else if (ACTION_CLEAN.equalsIgnoreCase(action)) {
            //
            // loop through all filters to remove duplicates
            final Class<? extends IsFilter> filterClass = parseFilterClass(req);

            if (filterClass == null) {
                AppUtils.setBadRequest("Unknown filter: " + req.getParameter(PARAM_FILTER), resp, LOGGER);
                return;
            }

            final Query<? extends IsFilter> query = dao.ofy().query(filterClass);

            final String cursorParam = req.getParameter(AppUrls.PARAM_CURSOR);
            if (cursorParam != null) {
                query.startCursor(Cursor.fromWebSafeString(cursorParam));
            }

            final QueryResultIterator<? extends IsFilter> itr = query.iterator();
            while (itr.hasNext()) {
                final IsFilter hasValue = itr.next();

                final List<?> keys = dao.ofy().query(filterClass).filter("value", hasValue.getValue()).listKeys();

                if (keys.size() > 1) {
                    keys.remove(keys.size() - 1); // keeps one value
                    dao.ofy().delete(keys); // delete the others
                }

                if (AppUtils.hasReachedTimeOut(startTime)) {

                    String filterValue = null;
                    if (AuthorFilter.class.equals(filterClass)) {
                        filterValue = FILTER_AUTHOR;

                    } else if (EditorFilter.class.equals(filterClass)) {
                        filterValue = FILTER_EDITOR;

                    } else if (CategoryFilter.class.equals(filterClass)) {
                        filterValue = FILTER_CATEGORY;
                    }

                    final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                    queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS) //
                            .param(PARAM_ACTION, ACTION_CLEAN) //
                            .param(PARAM_FILTER, filterValue) //
                            .param(AppUrls.PARAM_CURSOR, itr.getCursor().toWebSafeString()));

                    AppUtils.print("Cleaning in process", resp, startTime, LOGGER);
                    return;
                }
            }

            if (AuthorFilter.class.equals(filterClass)) {
                final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS) //
                        .param(PARAM_ACTION, ACTION_CLEAN) //
                        .param(PARAM_FILTER, FILTER_EDITOR));

                AppUtils.print("Cleaning in process", resp, startTime, LOGGER);
                return;

            } else if (EditorFilter.class.equals(filterClass)) {
                final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS) //
                        .param(PARAM_ACTION, ACTION_CLEAN) //
                        .param(PARAM_FILTER, FILTER_CATEGORY));

                AppUtils.print("Cleaning in process", resp, startTime, LOGGER);
                return;
            } else {

                // TODO PGU starts action count
                AppUtils.print("Cleaning process is over", resp, startTime, LOGGER);
                return;
            }

        } else if (ACTION_COUNTS.equalsIgnoreCase(action)) {
            // create letters indices
            final Class<? extends IsFilter> filterClass = parseFilterClass(req);

            if (filterClass == null) {
                AppUtils.setBadRequest("Unknown filter: " + req.getParameter(PARAM_FILTER), resp, LOGGER);
                return;
            }

            final Query<? extends IsFilter> query = dao.ofy().query(filterClass);

            final String cursorParam = req.getParameter(AppUrls.PARAM_CURSOR);
            if (cursorParam != null) {
                query.startCursor(Cursor.fromWebSafeString(cursorParam));
            }

            final QueryResultIterator<? extends IsFilter> itr = query.iterator();
            while (itr.hasNext()) {
                final IsFilter hasValue = itr.next();

                final String firstLetter = hasValue.getValue().substring(0, 1);
                dao.ofy().put(new AuthorFilterLetter().letter(firstLetter.toUpperCase()));
            }
            // all letters as uppercase
            // for each letter, count how many filters begins with, for lowercase and uppercase
            // save counts

        } else {
            AppUtils.setBadRequest("Unknown action: " + action, resp, LOGGER);
            return;
        }
    }

    private Class<? extends IsFilter> parseFilterClass(final HttpServletRequest req) {
        final String paramFilter = req.getParameter(PARAM_FILTER);

        if (paramFilter == null //
                || FILTER_AUTHOR.equalsIgnoreCase(paramFilter)) {
            return AuthorFilter.class;

        } else if (FILTER_EDITOR.equalsIgnoreCase(paramFilter)) {
            return EditorFilter.class;

        } else if (FILTER_CATEGORY.equalsIgnoreCase(paramFilter)) {
            return CategoryFilter.class;
        }

        return null;
    }

    private <T extends IsFilter> boolean deleteFilter(final Class<T> clazz, final long startTime) {

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
