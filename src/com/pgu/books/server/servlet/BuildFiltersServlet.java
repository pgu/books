package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.pgu.books.server.domain.LetterFilter;
import com.pgu.books.server.exception.InterruptProcessException;
import com.pgu.books.server.exception.ProcessException;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.AppUtils;
import com.pgu.books.server.utils.ParserRequest;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BuildFiltersServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(BuildFiltersServlet.class.getName());

    private final DAO dao = new DAO();

    private static final String PARAM_STAGE = "stage";
    private static final String STAGE_FILTER = "filter";
    private static final String STAGE_LETTER = "letter";

    private static final String PARAM_ACTION = "action";
    private static final String ACTION_DELETE = "delete";
    private static final String ACTION_PUT = "put";
    private static final String ACTION_CLEANUP = "cleanup";
    private static final String ACTION_COUNT = "count";

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
            ACTION_CLEANUP, //
            ACTION_COUNT //
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

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {

        final long startTime = System.currentTimeMillis();
        LOGGER.info("...POST request ");

        final AppUtils appUtils = new AppUtils() //
                .logger(LOGGER) //
                .startInMs(startTime) //
                .response(resp);

        try {
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
                    putLetters(filter, req, appUtils);

                } else if (isCleanupAction(action)) {
                    cleanupLetters(filter, req, appUtils);

                } else if (isCountAction(action)) {
                    countLetters(filter, req, appUtils);

                } else {
                    appUtils.throwProcessException("Unknown action " + action);
                }
            } else {
                appUtils.throwProcessException("Unknown stage " + stage);
            }

        } catch (final ProcessException e) {
            // fail silently, it is already logged
        } catch (final InterruptProcessException e) {
            // fail silently, it is already logged
        }
    }

    private void countLetters(final String filter, final HttpServletRequest req, final AppUtils appUtils)
            throws IOException, InterruptProcessException {

        final Class<? extends LetterFilter> letterClass = getLetterClass(filter);
        final Class<? extends Filter> filterClass = getFilterClass(filter);

        final Query<? extends LetterFilter> query = dao.ofy().query(letterClass);
        appUtils.setStartCursor(req, query);

        final QueryResultIterator<? extends LetterFilter> itr = query.iterator();
        while (itr.hasNext()) {

            final LetterFilter isLetter = itr.next();
            final String uppercaseLetter = isLetter.getLetter();
            final String lowercaseLetter = uppercaseLetter.toLowerCase();

            final int uppercaseCount = dao.ofy().query(filterClass) //
                    .filter("value >=", uppercaseLetter) //
                    .filter("value <", uppercaseLetter + "\uFFFD") //
                    .count();

            final int lowercaseCount = dao.ofy().query(filterClass) //
                    .filter("value >=", lowercaseLetter) //
                    .filter("value <", lowercaseLetter + "\uFFFD") //
                    .count();

            isLetter.setLetter(uppercaseLetter + " (" + (uppercaseCount + lowercaseCount) + ")");
            dao.ofy().put(isLetter);

            if (appUtils.hasReachedTimeOut()) {

                new FilterTask() //
                        .stage(STAGE_LETTER) //
                        .action(ACTION_COUNT) //
                        .filter(filter) //
                        .cursor(itr.getCursor().toWebSafeString()) //
                        .addToQueue();

                appUtils.throwInterruptProcessException("Counting letterFilters has reached its time's limit");
            }
        }
        appUtils.info("Counting letterFilters is over for the filter " + filter);

        final String nextFilter = getNextFilter(filter);
        if (nextFilter != null) {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_COUNT) //
                    .filter(nextFilter) //
                    .addToQueue();

            appUtils.info("Starts counting letterFilters for " + nextFilter);
        }
    }

    private void cleanupLetters(final String filter, final HttpServletRequest req, final AppUtils appUtils)
            throws IOException, InterruptProcessException {

        final Class<? extends LetterFilter> letterClass = getLetterClass(filter);

        final Query<? extends LetterFilter> query = dao.ofy().query(letterClass);
        appUtils.setStartCursor(req, query);

        final QueryResultIterator<? extends LetterFilter> itr = query.iterator();
        while (itr.hasNext()) {

            final LetterFilter isLetter = itr.next();
            final List<?> keys = dao.ofy().query(letterClass).filter("letter =", isLetter.getLetter()).listKeys();

            if (keys.size() > 1) {
                keys.remove(keys.size() - 1); // keeps one value
                dao.ofy().delete(keys); // delete the others
            }

            if (appUtils.hasReachedTimeOut()) {

                new FilterTask() //
                        .stage(STAGE_LETTER) //
                        .action(ACTION_CLEANUP) //
                        .filter(filter) //
                        .cursor(itr.getCursor().toWebSafeString()) //
                        .addToQueue();

                appUtils.throwInterruptProcessException("Cleaning up letterFilters has reached its time's limit");
            }
        }
        appUtils.info("Cleaning up letterFilters is over for " + filter);

        final String nextFilter = getNextFilter(filter);
        if (nextFilter != null) {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_CLEANUP) //
                    .filter(nextFilter) //
                    .addToQueue();

            appUtils.info("Starts cleaning up letterFilters for " + nextFilter);
        } else {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_COUNT) //
                    .addToQueue();

            appUtils.info("Let's start the letters count");
        }
    }

    private void putLetters(final String filter, final HttpServletRequest req, final AppUtils appUtils)
            throws IOException, InterruptProcessException {

        final boolean isAuthor = isAuthor(filter);
        final boolean isEditor = isEditor(filter);
        final boolean isCategory = isCategory(filter);

        final Class<? extends Filter> filterClass = getFilterClass(filter);

        final Query<? extends Filter> query = dao.ofy().query(filterClass);
        appUtils.setStartCursor(req, query);

        final QueryResultIterator<? extends Filter> itr = query.iterator();
        while (itr.hasNext()) {

            final Filter isFilter = itr.next();
            final String letter = isFilter.getValue().substring(0, 1).toUpperCase();

            if (isAuthor) {
                dao.ofy().put(new AuthorLetterFilter().letter(letter));

            } else if (isEditor) {
                dao.ofy().put(new EditorLetterFilter().letter(letter));

            } else if (isCategory) {
                dao.ofy().put(new CategoryLetterFilter().letter(letter));

            } else {
                throw new IllegalArgumentException("Unknown filter " + filter);
            }

            if (appUtils.hasReachedTimeOut()) {

                new FilterTask() //
                        .stage(STAGE_LETTER) //
                        .action(ACTION_PUT) //
                        .filter(filter) //
                        .cursor(itr.getCursor().toWebSafeString()) //
                        .addToQueue();

                appUtils.throwInterruptProcessException("Creating letterFilters has reached its time's limit");
            }
        }
        appUtils.info("Creating letterFilters is over for the filter " + filter);

        final String nextFilter = getNextFilter(filter);
        if (nextFilter != null) {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_PUT) //
                    .filter(nextFilter) //
                    .addToQueue();

            appUtils.info("Starts creating letterFilters for " + nextFilter);

        } else {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_CLEANUP) //
                    .addToQueue();

            appUtils.info("Let's start the letterFilters clean up");
        }
    }

    private boolean isAuthor(final String filter) {
        return FILTER_AUTHOR.equalsIgnoreCase(filter);
    }

    private boolean isEditor(final String filter) {
        return FILTER_EDITOR.equalsIgnoreCase(filter);
    }

    private boolean isCategory(final String filter) {
        return FILTER_CATEGORY.equalsIgnoreCase(filter);
    }

    private void deleteLetters(final String filter, final AppUtils appUtils) throws IOException,
            InterruptProcessException {
        final Class<? extends LetterFilter> letterClass = getLetterClass(filter);

        final boolean hasLetter = dao.ofy().query(letterClass).limit(1).count() > 0;
        if (hasLetter) {

            final QueryResultIterator<? extends LetterFilter> itr = dao.ofy().query(letterClass).iterator();
            while (itr.hasNext()) {

                dao.ofy().delete(itr.next());

                if (appUtils.hasReachedTimeOut()) {

                    new FilterTask() //
                            .stage(STAGE_LETTER) //
                            .action(ACTION_DELETE) //
                            .filter(getLetterFilterValue(letterClass)) //
                            .addToQueue();

                    appUtils.throwInterruptProcessException("Deleting letterFilters has reached its time's limit");
                }
            }
        }
        appUtils.info("Deleting letterFilters is over for " + filter);

        final String nextFilter = getNextFilter(filter);
        if (nextFilter != null) {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_DELETE) //
                    .filter(nextFilter) //
                    .addToQueue();

            appUtils.info("Deleting letterFilters starts for " + nextFilter);

        } else {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_PUT) //
                    .addToQueue();

            appUtils.info("Let's start the letterFilters creation");
        }
    }

    private String getLetterFilterValue(final Class<? extends LetterFilter> letterClass) {
        if (AuthorLetterFilter.class.equals(letterClass)) {
            return FILTER_AUTHOR;

        } else if (EditorLetterFilter.class.equals(letterClass)) {
            return FILTER_EDITOR;

        } else if (CategoryLetterFilter.class.equals(letterClass)) {
            return FILTER_CATEGORY;

        } else {
            throw new IllegalArgumentException("Unknown letterFilter " + letterClass);
        }
    }

    private Class<? extends LetterFilter> getLetterClass(final String filter) {
        if (FILTER_AUTHOR.equalsIgnoreCase(filter)) {
            return AuthorLetterFilter.class;

        } else if (FILTER_EDITOR.equalsIgnoreCase(filter)) {
            return EditorLetterFilter.class;

        } else if (FILTER_CATEGORY.equalsIgnoreCase(filter)) {
            return CategoryLetterFilter.class;

        } else {
            throw new IllegalArgumentException("Unknown filter: " + filter);
        }
    }

    private void cleanupFilters(final String filter, final HttpServletRequest req, final AppUtils appUtils)
            throws IOException, InterruptProcessException {

        final Class<? extends Filter> filterClass = getFilterClass(filter);

        final Query<? extends Filter> query = dao.ofy().query(filterClass);
        appUtils.setStartCursor(req, query);

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
                        .filter(filter) //
                        .cursor(itr.getCursor().toWebSafeString()) //
                        .addToQueue();

                appUtils.throwInterruptProcessException("Cleaning up filters has reached its time's limit");
            }
        }
        appUtils.info("Cleaning up filters is over for " + filter);

        final String nextFilter = getNextFilter(filter);
        if (nextFilter != null) {
            new FilterTask() //
                    .stage(STAGE_FILTER) //
                    .action(ACTION_CLEANUP) //
                    .filter(nextFilter) //
                    .addToQueue();

            appUtils.info("Starts cleaning up filters for " + nextFilter);

        } else {
            new FilterTask() //
                    .stage(STAGE_LETTER) //
                    .action(ACTION_DELETE) //
                    .addToQueue();

            appUtils.info("Let's start the letters deletion");
        }
    }

    private void putFilters(final HttpServletRequest req, final AppUtils appUtils) throws IOException,
            InterruptProcessException {

        final Query<Book> query = dao.ofy().query(Book.class);
        appUtils.setStartCursor(req, query);

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
        appUtils.info("Creating filters is over");

        new FilterTask() //
                .stage(STAGE_FILTER) //
                .action(ACTION_CLEANUP) //
                .addToQueue();

        appUtils.info("Let's start the filters clean up");
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

        final boolean hasFilter = dao.ofy().query(filterClass).limit(1).count() > 0;
        if (hasFilter) {

            final QueryResultIterator<? extends Filter> itr = dao.ofy().query(filterClass).iterator();
            while (itr.hasNext()) {

                dao.ofy().delete(itr.next());

                if (appUtils.hasReachedTimeOut()) {

                    new FilterTask() //
                            .stage(STAGE_FILTER) //
                            .action(ACTION_DELETE) //
                            .filter(filter) //
                            .addToQueue();

                    appUtils.throwInterruptProcessException("Deleting filters has reached its time's limit");
                }
            }
        }
        appUtils.info("Deleting filters is over for " + filter);

        final String nextFilter = getNextFilter(filter);
        if (nextFilter != null) {
            new FilterTask() //
                    .stage(STAGE_FILTER) //
                    .action(ACTION_DELETE) //
                    .filter(nextFilter) //
                    .addToQueue();

            appUtils.info("Deleting filters starts for " + nextFilter);

        } else {
            new FilterTask() //
                    .stage(STAGE_FILTER) //
                    .action(ACTION_PUT) //
                    .addToQueue();

            appUtils.info("Let's start the filters creation");
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

    private boolean isCountAction(final String action) {
        return ACTION_COUNT.equals(action);
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

    private String getParameterStage(final HttpServletRequest req, final AppUtils appUtils) throws IOException,
            ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_STAGE;
        parser.references = stages;
        parser.defaultValue = STAGE_FILTER;

        return appUtils.getParameter(parser, req);
    }

    private String getParameterAction(final HttpServletRequest req, final AppUtils appUtils) throws IOException,
            ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_ACTION;
        parser.references = actions;
        parser.defaultValue = ACTION_DELETE;

        return appUtils.getParameter(parser, req);
    }

    private String getParameterFilter(final HttpServletRequest req, final AppUtils appUtils) throws IOException,
            ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_FILTER;
        parser.references = filters;
        parser.defaultValue = FILTER_AUTHOR;

        return appUtils.getParameter(parser, req);
    }

}
