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
import com.pgu.books.server.domain.AuthorLetterFilter;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.CategoryLetterFilter;
import com.pgu.books.server.domain.EditorFilter;
import com.pgu.books.server.domain.EditorLetterFilter;
import com.pgu.books.server.domain.IsFilter;
import com.pgu.books.server.exception.ProcessException;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.AppUtils;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BuildFiltersServlet extends HttpServlet {

    private static final Logger       LOGGER                   = Logger.getLogger(BuildFiltersServlet.class.getName());

    private final DAO                 dao                      = new DAO();

    // TODO PGU update the cron file and queue file

    private static final String       PARAM_STAGE              = "stage";
    private static final String       STAGE_FILTER             = "filter";
    private static final String       STAGE_LETTER             = "letter";

    private static final String       PARAM_ACTION             = "action";
    private static final String       ACTION_DELETE_ALL        = "delete";
    private static final String       ACTION_PUT               = "put";
    private static final String       ACTION_REMOVE_DUPLICATES = "remove_duplicates";

    private static final String       PARAM_FILTER             = "filter";
    private static final String       FILTER_AUTHOR            = "author";
    private static final String       FILTER_EDITOR            = "editor";
    private static final String       FILTER_CATEGORY          = "category";

    private static final List<String> stages                   = Arrays.asList( //
                                                                       STAGE_FILTER, //
                                                                       STAGE_LETTER //
                                                               );
    private static final List<String> actions                  = Arrays.asList( //
                                                                       ACTION_DELETE_ALL, //
                                                                       ACTION_PUT, //
                                                                       ACTION_REMOVE_DUPLICATES //
                                                               );
    private static final List<String> filters                  = Arrays.asList( //
                                                                       FILTER_AUTHOR, //
                                                                       FILTER_EDITOR, //
                                                                       FILTER_CATEGORY //
                                                               );

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

        final String stage = getParameterStage(req, resp);
        final String action = getParameterAction(req, resp);
        final String filter = getParameterFilter(req, resp);

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

                    final String filterValue = getFilterValue(filterClass);

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

                final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS) //
                        .param(PARAM_ACTION, ACTION_COUNTS));

                AppUtils.print("Cleaning process is over", resp, startTime, LOGGER);
                return;
            }

        } else if (ACTION_COUNTS.equalsIgnoreCase(action)) {
            // TODO PGU 
            // add clean param (remove all)
            // add put param (create letters)
            // add clean param (remove duplicates)
            // add count param (for each letter, count items and save the counts)

            // create letters indices
            final Class<? extends IsFilter> filterClass = parseFilterClass(req);

            if (filterClass == null) {
                AppUtils.setBadRequest("Unknown filter: " + req.getParameter(PARAM_FILTER), resp, LOGGER);
                return;
            }

            final Query<? extends IsFilter> query = dao.ofy().query(filterClass);

            setStartCursor(req, query);

            final QueryResultIterator<? extends IsFilter> itr = query.iterator();
            // TODO PGU a while for each type class
            while (itr.hasNext()) {
                final IsFilter hasValue = itr.next();

                final String firstLetter = hasValue.getValue().substring(0, 1).toUpperCase();
                if (AuthorFilter.class.equals(filterClass)) {
                    dao.ofy().put(new AuthorLetterFilter().letter(firstLetter));

                } else if (EditorFilter.class.equals(filterClass)) {
                    dao.ofy().put(new EditorLetterFilter().letter(firstLetter));

                } else if (CategoryFilter.class.equals(filterClass)) {
                    dao.ofy().put(new CategoryLetterFilter().letter(firstLetter));

                } else {
                    LOGGER.severe("Unknown filterClass " + filterClass);
                }
            }
            if (AppUtils.hasReachedTimeOut(startTime)) {

                final String filterValue = getFilterValue(filterClass);

                final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS) //
                        .param(PARAM_ACTION, ACTION_COUNTS) //
                        .param(PARAM_FILTER, filterValue) //
                        .param(AppUrls.PARAM_CURSOR, itr.getCursor().toWebSafeString()));

                AppUtils.print("Counts in process", resp, startTime, LOGGER);
                return;
                // TODO PGU do it also for next filters classes
            }

        } else {
            AppUtils.setBadRequest("Unknown action: " + action, resp, LOGGER);
            return;
        }
    }

    private static class ParserRequest {
        private String       paramName;
        private List<String> references;
        private String       tag;
        private String       defaultValue;
    }

    private String getParameterStage(final HttpServletRequest req, final HttpServletResponse resp) throws IOException,
            ProcessException {
        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_STAGE;
        parser.references = stages;
        parser.tag = "stage";
        parser.defaultValue = STAGE_FILTER;

        return getParameter(parser, req, resp);
    }

    private String getParameterAction(final HttpServletRequest req, final HttpServletResponse resp) throws IOException,
            ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_ACTION;
        parser.references = actions;
        parser.tag = "action";
        parser.defaultValue = ACTION_DELETE_ALL;

        return getParameter(parser, req, resp);
    }

    private String getParameterFilter(final HttpServletRequest req, final HttpServletResponse resp) throws IOException,
            ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_FILTER;
        parser.references = filters;
        parser.tag = "filter";
        parser.defaultValue = FILTER_AUTHOR;

        return getParameter(parser, req, resp);
    }

    private String getParameter(final ParserRequest parser, final HttpServletRequest req, final HttpServletResponse resp)
            throws IOException, ProcessException {

        final String value = req.getParameter(parser.paramName);

        if (value != null //
                && !parser.references.contains(value.toLowerCase())) {

            AppUtils.setBadRequest( //
                    String.format("Illegal %s for this request: %s", parser.tag, value), //
                    resp, LOGGER);
        }

        return value == null ? parser.defaultValue : value.toLowerCase();
    }

    private void setStartCursor(final HttpServletRequest req, final Query<? extends IsFilter> query) {
        final String cursorParam = req.getParameter(AppUrls.PARAM_CURSOR);
        if (cursorParam != null) {
            query.startCursor(Cursor.fromWebSafeString(cursorParam));
        }
    }

    private String getFilterValue(final Class<? extends IsFilter> filterClass) {

        if (AuthorFilter.class.equals(filterClass)) {
            return FILTER_AUTHOR;

        } else if (EditorFilter.class.equals(filterClass)) {
            return FILTER_EDITOR;

        } else if (CategoryFilter.class.equals(filterClass)) {
            return FILTER_CATEGORY;
        }
        return null;
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
