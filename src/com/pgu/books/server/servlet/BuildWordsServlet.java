package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
import com.pgu.books.server.domain.BookWord;
import com.pgu.books.server.domain.IsWord;
import com.pgu.books.server.domain.Word;
import com.pgu.books.server.exception.InterruptProcessException;
import com.pgu.books.server.exception.ProcessException;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.ParserRequest;
import com.pgu.books.server.utils.ServletUtils;
import com.pgu.books.shared.domain.Book;

@SuppressWarnings("serial")
public class BuildWordsServlet extends HttpServlet {

    private static final String       SEP               = " ";

    private static final Logger       LOGGER            = Logger.getLogger(BuildWordsServlet.class.getName());

    private final DAO                 dao               = new DAO();

    private static final String       PARAM_ACTION      = "action";
    private static final String       ACTION_DELETE     = "delete";
    private static final String       ACTION_BOOK_WORDS = "bookwords";
    private static final String       ACTION_WORDS      = "words";

    private static final List<String> actions           = Arrays.asList( //
                                                                ACTION_BOOK_WORDS, //
                                                                ACTION_DELETE, //
                                                                ACTION_WORDS);

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

        final ServletUtils servletUtils = new ServletUtils() //
                .logger(LOGGER) //
                .startInMs(startTime) //
                .response(resp) //
                .checkCallingEntity(req) //
        ;

        try {
            final String action = getParameterAction(req, servletUtils);

            if (isDeleteAction(action)) {

                // delete the current bookWords and words
                for (final Class<? extends IsWord> clazz : Arrays.asList(BookWord.class, Word.class)) {

                    final boolean hasWord = dao.ofy().query(clazz).limit(1).count() > 0;

                    if (hasWord) {
                        final QueryResultIterator<? extends IsWord> itr = dao.ofy().query(clazz).iterator();
                        while (itr.hasNext()) {

                            dao.ofy().delete(itr.next());

                            if (servletUtils.hasReachedTimeOut()) {

                                new WordTask() //
                                        .action(ACTION_DELETE) //
                                        .addToQueue();

                                servletUtils
                                        .throwInterruptProcessException("Deleting words has reached its time's limit");
                            }
                        }
                    }
                }
                servletUtils.info("Deleting words is over");

                // next step: put new bookWords
                new WordTask() //
                        .action(ACTION_BOOK_WORDS) //
                        .addToQueue();

                servletUtils.info("Let's start the bookwords creation");

            } else if (isBookWordsAction(action)) {
                //
                // loop through all books to create the bookWords
                final Query<Book> query = dao.ofy().query(Book.class);

                servletUtils.setStartCursor(req, query);

                final QueryResultIterator<Book> itr = query.iterator();
                while (itr.hasNext()) {
                    final Book book = itr.next();

                    final StringBuilder sb = new StringBuilder();
                    sb.append(book.getAuthor());
                    sb.append(SEP);
                    sb.append(book.getCategory());
                    sb.append(SEP);
                    sb.append(book.getComment());
                    sb.append(SEP);
                    sb.append(book.getEditor());
                    sb.append(SEP);
                    sb.append(book.getTitle());
                    sb.append(SEP);
                    sb.append(book.getYear());

                    extractWordsAndCreateBookWords(sb.toString(), book.getId());

                    if (servletUtils.hasReachedTimeOut()) {

                        new WordTask() //
                                .action(ACTION_BOOK_WORDS) //
                                .cursor(itr.getCursor().toWebSafeString()) //
                                .addToQueue();

                        servletUtils.throwInterruptProcessException("Creating bookWords has reached its time's limit");
                    }
                }
                servletUtils.info("Creating bookWords is over");

                // next step: put new words
                new WordTask() //
                        .action(ACTION_WORDS) //
                        .addToQueue();

                servletUtils.info("Let's start the words creation");

            } else if (isWordsAction(action)) {
                //
                // loop through all bookWords to create the words
                final Query<BookWord> query = dao.ofy().query(BookWord.class);

                servletUtils.setStartCursor(req, query);

                final List<String> wordsCache = new ArrayList<String>();
                final QueryResultIterator<BookWord> itr = query.iterator();
                while (itr.hasNext()) {
                    final BookWord bookWord = itr.next();
                    final String value = bookWord.getValue();
                    final String display = bookWord.getDisplay();

                    // if it is in the cache then go to next
                    final String wordCache = value + "|" + display;
                    if (wordsCache.contains(wordCache)) {
                        continue;
                    }

                    // if it is in the DB then go to next
                    final int count = dao.ofy().query(Word.class) //
                            .filter("value", value) //
                            .filter("display", display) //
                            .limit(1).count();
                    if (count > 0) {
                        continue;
                    }

                    // it does not exist then let's add it
                    dao.ofy().put(new Word().value(value).display(display));
                    wordsCache.add(wordCache); // update cache

                    if (servletUtils.hasReachedTimeOut()) {

                        new WordTask() //
                                .action(ACTION_WORDS) //
                                .cursor(itr.getCursor().toWebSafeString()) //
                                .addToQueue();

                        servletUtils.throwInterruptProcessException("Creating bookWords has reached its time's limit");
                    }
                }
                servletUtils.info("Creating words is over");

            } else {

                servletUtils.throwProcessException("Unknown action " + action);
            }
        } catch (final ProcessException e) {
            // fail silently, it is already logged
        } catch (final InterruptProcessException e) {
            // fail silently, it is already logged
        }
    }

    private boolean isWordsAction(final String action) {
        return ACTION_WORDS.equalsIgnoreCase(action);
    }

    private boolean isBookWordsAction(final String action) {
        return ACTION_BOOK_WORDS.equalsIgnoreCase(action);
    }

    private void extractWordsAndCreateBookWords(String text, final Long bookId) {
        text = text.replaceAll("[^A-Za-z0-9 ÁáÉéÍíÓóÚúñÑ]", SEP);

        for (final String part : new HashSet<String>(Arrays.asList(text.split(SEP)))) {
            final String p = part.trim();
            if (p.length() > 2) {

                dao.ofy().put(new BookWord().display(p).bookId(bookId));
            }
        }
    }

    private boolean isDeleteAction(final String action) {
        return ACTION_DELETE.equals(action);
    }

    private String getParameterAction(final HttpServletRequest req, final ServletUtils servletUtils)
            throws IOException, ProcessException {

        final ParserRequest parser = new ParserRequest();

        parser.paramName = PARAM_ACTION;
        parser.references = actions;
        parser.defaultValue = ACTION_DELETE;

        return servletUtils.getParameter(parser, req);
    }

    private static class WordTask {

        private final TaskOptions task;

        private WordTask() {
            task = TaskOptions.Builder.withUrl(AppUrls.BUILD_WORDS);
            task.header("X-AppEngine-Cron", "true");
        }

        public WordTask action(final String action) {
            task.param(PARAM_ACTION, action);
            return this;
        }

        public WordTask cursor(final String cursor) {
            task.param(AppUrls.PARAM_CURSOR, cursor);
            return this;
        }

        public WordTask addToQueue() {
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_WORDS);
            queue.add(task);
            return this;
        }
    }

}
