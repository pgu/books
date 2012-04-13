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
import com.pgu.books.server.domain.Filter;
import com.pgu.books.server.exception.InterruptProcessException;
import com.pgu.books.server.exception.ProcessException;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.AppUtils;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BuildFiltersServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(BuildFiltersServlet.class.getName());

    private final DAO dao = new DAO();

    // TODO PGU update the cron file and queue file

    private static final String PARAM_STAGE = "stage";
    private static final String STAGE_FILTER = "filter";
    private static final String STAGE_LETTER = "letter";

    private static final String PARAM_ACTION = "action";
    private static final String ACTION_DELETE = "delete";
    private static final String ACTION_PUT = "put";
    private static final String ACTION_CLEANUP = "cleanup";

    private static final String PARAM_FILTER = "filter";
    private static final String FILTER_AUTHOR = "author";
    private static final String FILTER_EDITOR = "editor";
    private static final String FILTER_CATEGORY = "category";

    private static final List<String> stages = Arrays.asList( //
            STAGE_FILTER, //
            STAGE_LETTER //
            );
    private static final List<String> actions = Arrays.asList( //
            ACTION_DELETE, //
            ACTION_PUT, //
            ACTION_CLEANUP //
            );
    private static final List<String> filters = Arrays.asList( //
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

        final AppUtils appUtils = new AppUtils() //
                .logger(LOGGER) //
                .startInMs(startTime) //
                .response(resp);

        final String stage = getParameterStage(req, appUtils);
        final String action = getParameterAction(req, appUtils);
        final String filter = getParameterFilter(req, appUtils);

        if (isFilterStage(stage)) {

            if (isDeleteAction(action)) {
                deleteFilters(filter, appUtils);

            } else if (isPutAction(action)) {
                putFilters(req, appUtils);

            } else if (isCleanupAction(action)) {
                cleanupFilters(filter, req, appUtils);

            } else {
                appUtils.throwProcessException("Unknown action " + action);
            }

        } else if (isLetterStage(stage)) {

            if (isDeleteAction(action)) {
                deleteLetters(filter, appUtils);

            } else if (isPutAction(action)) {

            } else if (isCleanupAction(action)) {

            } else {
                appUtils.throwProcessException("Unknown action " + action);
                // TODO PGU
                // add clean param (remove all)
                // add put param (create letters)
                // add clean param (remove duplicates)
                // add count param (for each letter, count items and save the counts)
            }

        } else {
            appUtils.throwProcessException("Unknown stage " + stage);
        }
    }

    private void cleanupFilters(final String filter, final HttpServletRequest req, final AppUtils appUtils)
            throws IOException, InterruptProcessException {

        final Class<? extends Filter> filterClass = getFilterClass(filter);

        final Query<? extends Filter> query = dao.ofy().query(filterClass);
        setStartCursor(req, query);

        final QueryResultIterator<? extends Filter> itr = query.iterator();
        while (itr.hasNext()) {

            final Filter isFilter = itr.next();
            final List<?> keys = dao.ofy().query(filterClass).filter("value", isFilter.getValue()).listKeys();

            if (keys.size() > 1) {
                keys.remove(keys.size() - 1); // keeps one value
                dao.ofy().delete(keys); // delete the others
            }

            if (appUtils.hasReachedTimeOut()) {

                new FilterTask() //
                        .stage(STAGE_FILTER) //
                        .action(ACTION_CLEANUP) //
                        .filter(getFilterValue(filterClass)) //
                        .cursor(itr.getCursor().toWebSafeString()) //
                        .addToQueue();

                appUtils.throwInterruptProcessException("Cleaning up filters has reached its time's limit");
            }
        }

        final String nextFilter = getNextFilter(filter);
        if (nextFilter != null) {
            new FilterTask() //
                    .stage(STAGE_FILTER) //
                    .action(ACTION_CLEANUP) //
                    .filter(nextFilter) //
                    .addToQueue();

            appUtils.info("Starts the next step in clean up process for " + nextFilter);

        } else {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_DELETE) //
                    .addToQueue();

            appUtils.info("Cleaning up filters process is over");
        }
    }

    private void putFilters(final HttpServletRequest req, final AppUtils appUtils) throws IOException,
            InterruptProcessException {

        final Query<Book> query = dao.ofy().query(Book.class);
        setStartCursor(req, query);

        final QueryResultIterator<Book> itr = query.iterator();
        while (itr.hasNext()) {
            final Book book = itr.next();

            dao.ofy().put(new AuthorFilter().value(book.getAuthor()));
            dao.ofy().put(new EditorFilter().value(book.getEditor()));
            dao.ofy().put(new CategoryFilter().value(book.getCategory()));

            if (appUtils.hasReachedTimeOut()) {

                new FilterTask() //
                        .stage(STAGE_FILTER) //
                        .action(ACTION_PUT) //
                        .cursor(itr.getCursor().toWebSafeString()) //
                        .addToQueue();

                appUtils.throwInterruptProcessException("Creating filters has reached its time's limit");
            }
        }

        new FilterTask() //
                .stage(STAGE_FILTER) //
                .action(ACTION_CLEANUP) //
                .addToQueue();

        appUtils.info("Filters creation process is over");

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

        public FilterTask cursor(final String cursor) {
            task.param(AppUrls.PARAM_CURSOR, cursor);
            return this;
        }

        public FilterTask addToQueue() {
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
            queue.add(task);
            return this;
        }
    }

    private void deleteFilters(final String filter, final AppUtils appUtils) throws IOException,
            InterruptProcessException {

        final Class<? extends Filter> filterClass = getFilterClass(filter);

        deleteFilter(filterClass, appUtils);

        final String nextFilter = getNextFilter(filter);
        if (nextFilter != null) {
            new FilterTask() //
                    .stage(STAGE_FILTER) //
                    .action(ACTION_DELETE) //
                    .filter(nextFilter) //
                    .addToQueue();

            appUtils.info("Starts the next step in deletion process for " + nextFilter);

        } else {
            new FilterTask() //
                    .stage(STAGE_FILTER) //
                    .action(ACTION_PUT) //
                    .addToQueue();

            appUtils.info("Deleting filters is over");
        }
    }

    private String getNextFilter(final String filter) {
        if (FILTER_AUTHOR.equalsIgnoreCase(filter)) {
            return FILTER_EDITOR;

        } else if (FILTER_EDITOR.equalsIgnoreCase(filter)) {
            return FILTER_CATEGORY;
        } else {
            return null;
        }
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
        private String paramName;
        private List<String> references;
        private String defaultValue;
    }

    private String getParameterStage(final HttpServletRequest req, final AppUtils appUtils) throws IOException,
            ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_STAGE;
        parser.references = stages;
        parser.defaultValue = STAGE_FILTER;

        return getParameter(parser, req, appUtils);
    }

    private String getParameterAction(final HttpServletRequest req, final AppUtils appUtils) throws IOException,
            ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_ACTION;
        parser.references = actions;
        parser.defaultValue = ACTION_DELETE;

        return getParameter(parser, req, appUtils);
    }

    private String getParameterFilter(final HttpServletRequest req, final AppUtils appUtils) throws IOException,
            ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_FILTER;
        parser.references = filters;
        parser.defaultValue = FILTER_AUTHOR;

        return getParameter(parser, req, appUtils);
    }

    private String getParameter(final ParserRequest parser, final HttpServletRequest req, final AppUtils appUtils)
            throws IOException, ProcessException {

        final String value = req.getParameter(parser.paramName);

        if (value != null //
                && !parser.references.contains(value.toLowerCase())) {

            appUtils.throwProcessException(String.format("Illegal %s for this request: %s", parser.paramName, value));
        }

        return value == null ? parser.defaultValue : value.toLowerCase();
    }

    private void setStartCursor(final HttpServletRequest req, final Query<?> query) {
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

    private Class<? extends Filter> parseFilterClass(final HttpServletRequest req) {
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

    private void deleteFilter(final Class<? extends Filter> filterClass, final AppUtils appUtils)
            throws InterruptProcessException, IOException {

        final boolean hasFilter = dao.ofy().query(filterClass).limit(1).count() > 0;

        if (hasFilter) {
            final QueryResultIterator<? extends Filter> itr = dao.ofy().query(filterClass).iterator();
            while (itr.hasNext()) {

                dao.ofy().delete(itr.next());

                if (appUtils.hasReachedTimeOut()) {

                    new FilterTask() //
                            .stage(STAGE_FILTER) //
                            .action(ACTION_DELETE) //
                            .filter(getFilterValue(filterClass)) //
                            .addToQueue();

                    appUtils.throwInterruptProcessException("Deleting filters has reached its time's limit");
                }
            }
        }
    }

}
