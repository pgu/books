package com.pgu.books.server.servlet;

import static com.pgu.books.server.utils.AppUtils.hasReachedTimeOut;
import static com.pgu.books.server.utils.AppUtils.setBadRequest;

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
import com.pgu.books.server.domain.Filter;
import com.pgu.books.server.exception.InterruptProcessException;
import com.pgu.books.server.exception.ProcessException;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.AppUtils;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BuildFiltersServlet extends HttpServlet {

    private static final Logger       LOGGER          = Logger.getLogger(BuildFiltersServlet.class.getName());

    private final DAO                 dao             = new DAO();

    // TODO PGU update the cron file and queue file

    private static final String       PARAM_STAGE     = "stage";
    private static final String       STAGE_FILTER    = "filter";
    private static final String       STAGE_LETTER    = "letter";

    private static final String       PARAM_ACTION    = "action";
    private static final String       ACTION_DELETE   = "delete";
    private static final String       ACTION_PUT      = "put";
    private static final String       ACTION_CLEANUP  = "cleanup";

    private static final String       PARAM_FILTER    = "filter";
    private static final String       FILTER_AUTHOR   = "author";
    private static final String       FILTER_EDITOR   = "editor";
    private static final String       FILTER_CATEGORY = "category";

    private static final List<String> stages          = Arrays.asList( //
                                                              STAGE_FILTER, //
                                                              STAGE_LETTER //
                                                      );
    private static final List<String> actions         = Arrays.asList( //
                                                              ACTION_DELETE, //
                                                              ACTION_PUT, //
                                                              ACTION_CLEANUP //
                                                      );
    private static final List<String> filters         = Arrays.asList( //
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

        if (isFilterStage(stage)) {

            if (isDeleteAction(action)) {

                deleteFilters(filter, startTime);

            } else if (isPutAction(action)) {

            } else if (isCleanupAction(action)) {

            } else {
                setBadRequest("Unknown action " + action, resp, LOGGER);
            }

        } else if (isLetterStage(stage)) {

            if (isDeleteAction(action)) {

            } else if (isPutAction(action)) {

            } else if (isCleanupAction(action)) {

            } else {
                setBadRequest("Unknown action " + action, resp, LOGGER);
            }

        } else {
            setBadRequest("Unknown stage " + stage, resp, LOGGER);
        }

        if (ACTION_DELETE.equalsIgnoreCase(action)) {

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
                    queue.add(newTask().param(PARAM_ACTION, ACTION_PUT) //
                            .param(AppUrls.PARAM_CURSOR, itr.getCursor().toWebSafeString()));

                    AppUtils.print("Creation in process", resp, startTime, LOGGER);
                    return;
                }
            }

            // next step: remove duplicates
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
            queue.add(newTask().param(PARAM_ACTION, ACTION_CLEAN));

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
                    queue.add(newTask().param(PARAM_ACTION, ACTION_CLEAN) //
                            .param(PARAM_FILTER, filterValue) //
                            .param(AppUrls.PARAM_CURSOR, itr.getCursor().toWebSafeString()));

                    AppUtils.print("Cleaning in process", resp, startTime, LOGGER);
                    return;
                }
            }

            if (AuthorFilter.class.equals(filterClass)) {
                final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                queue.add(newTask().param(PARAM_ACTION, ACTION_CLEAN) //
                        .param(PARAM_FILTER, FILTER_EDITOR));

                AppUtils.print("Cleaning in process", resp, startTime, LOGGER);
                return;

            } else if (EditorFilter.class.equals(filterClass)) {
                final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                queue.add(newTask().param(PARAM_ACTION, ACTION_CLEAN) //
                        .param(PARAM_FILTER, FILTER_CATEGORY));

                AppUtils.print("Cleaning in process", resp, startTime, LOGGER);
                return;
            } else {

                final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
                queue.add(newTask().param(PARAM_ACTION, ACTION_COUNTS));

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
                queue.add(newTask().param(PARAM_ACTION, ACTION_COUNTS) //
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

    private static class FilterTask {

        private final TaskOptions task;

        private FilterTask() {
            task = TaskOptions.Builder.withUrl(AppUrls.BUILD_FILTERS);
        }

        public FilterTask stage(final String stage) {
            task.param(PARAM_STAGE, stage);
            return this;
        }

        public FilterTask action(final String action) {
            task.param(PARAM_ACTION, action);
            return this;
        }

        public FilterTask filter(final String filter) {
            task.param(PARAM_FILTER, filter);
            return this;
        }

        public FilterTask addToQueue() {
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
            queue.add(task);
            return this;
        }
    }

    private void deleteFilters(final String filter, final long startTime) {

        final Class<? extends Filter> filterClass = getFilterClass(filter);

        try {
            deleteFilter(filterClass, startTime);

        } catch (final InterruptProcessException e) {

            new FilterTask() //
                    .stage(STAGE_FILTER) //
                    .action(ACTION_DELETE) //
                    .filter(getFilterValue(filterClass)) //
                    .addToQueue();

            throw e;
        }

        // go to next step: delete other filters or put new filters
        final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
        queue.add(newTask().param(PARAM_ACTION, ACTION_PUT));

        AppUtils.print("Deletion process is over", resp, startTime, LOGGER);
        return;

    }

    private Class<? extends Filter> getFilterClass(final String filter) {
        if (FILTER_AUTHOR.equalsIgnoreCase(filter)) {
            return AuthorFilter.class;

        } else if (FILTER_EDITOR.equalsIgnoreCase(filter)) {
            return EditorFilter.class;

        } else if (FILTER_CATEGORY.equalsIgnoreCase(filter)) {
            return CategoryFilter.class;

        } else {
            throw new IllegalArgumentException("Unknown filter: " + filter);
        }
    }

    private boolean isCleanupAction(final String action) {
        return ACTION_CLEANUP.equals(action);
    }

    private boolean isPutAction(final String action) {
        return ACTION_PUT.equals(action);
    }

    private boolean isDeleteAction(final String action) {
        return ACTION_DELETE.equals(action);
    }

    private boolean isLetterStage(final String stage) {
        return STAGE_LETTER.equals(stage);
    }

    private boolean isFilterStage(final String stage) {
        return STAGE_FILTER.equals(stage);
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
        parser.defaultValue = ACTION_DELETE;

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

    private String getFilterValue(final Class<? extends Filter> filterClass) {

        if (AuthorFilter.class.equals(filterClass)) {
            return FILTER_AUTHOR;

        } else if (EditorFilter.class.equals(filterClass)) {
            return FILTER_EDITOR;

        } else if (CategoryFilter.class.equals(filterClass)) {
            return FILTER_CATEGORY;

        } else {
            throw new IllegalArgumentException("Unknown filter " + filterClass);
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

    private void deleteFilter(final Class<? extends Filter> filterClass, final long startTime)
            throws InterruptProcessException {

        final boolean hasFilter = dao.ofy().query(filterClass).limit(1).count() > 0;

        if (hasFilter) {
            final QueryResultIterator<? extends Filter> itr = dao.ofy().query(filterClass).iterator();
            while (itr.hasNext()) {

                dao.ofy().delete(itr.next());

                if (hasReachedTimeOut(startTime)) {
                    throw new InterruptProcessException("deleteFilter has reached time's limit", startTime);
                }
            }
        }
    }

}
