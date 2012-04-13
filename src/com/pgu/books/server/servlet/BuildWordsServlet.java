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

import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.googlecode.objectify.Query;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.BookWord;
import com.pgu.books.server.domain.IsWord;
import com.pgu.books.server.domain.Word;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.AppUtils;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BuildWordsServlet extends HttpServlet {

    private static final String SEP = " ";

    private static final Logger LOGGER = Logger.getLogger(BuildWordsServlet.class.getName());

    private final DAO dao = new DAO();

    private static final String PARAM_ACTION = "action";
    private static final String ACTION_DELETE = "delete";
    private static final String ACTION_BOOK_WORDS = "bookwords";
    private static final String ACTION_WORDS = "words";

    private static final List<String> actions = Arrays.asList( //
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

        final AppUtils appUtils = new AppUtils() //
                .logger(LOGGER) //
                .startInMs(startTime) //
                .response(resp);

        final String action = req.getParameter(PARAM_ACTION);
        if (action == null //
                || !actions.contains(action.toLowerCase())) {
            AppUtils.setBadRequest("Illegal action for this request: " + action, resp, LOGGER);
            return;
        }

        if (ACTION_START.equalsIgnoreCase(action) //
                || ACTION_DELETE.equalsIgnoreCase(action)) {

            // delete the current bookWords and words
            for (final Class<? extends IsWord> clazz : Arrays.asList(BookWord.class, Word.class)) {

                final boolean hasReachedTimeOut = deleteWords(clazz, startTime);
                if (hasReachedTimeOut) {

                    final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_WORDS);
                    queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_WORDS).param(PARAM_ACTION, ACTION_DELETE));

                    AppUtils.print("Deletion in process", resp, startTime, LOGGER);
                    return;
                }
            }

            // next step: put new bookWords
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_WORDS);
            queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_WORDS).param(PARAM_ACTION, ACTION_BOOK_WORDS));

            AppUtils.print("Deletion process is over", resp, startTime, LOGGER);
            return;

        } else if (ACTION_BOOK_WORDS.equalsIgnoreCase(action)) {
            //
            // loop through all books to create the bookWords
            final Query<Book> query = dao.ofy().query(Book.class);

            final String cursorParam = req.getParameter(AppUrls.PARAM_CURSOR);
            if (cursorParam != null) {
                query.startCursor(Cursor.fromWebSafeString(cursorParam));
            }

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

                if (AppUtils.hasReachedTimeOut(startTime)) {
                    final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_WORDS);
                    queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_WORDS) //
                            .param(PARAM_ACTION, ACTION_BOOK_WORDS) //
                            .param(AppUrls.PARAM_CURSOR, itr.getCursor().toWebSafeString()));

                    AppUtils.print("BookWords creation in process", resp, startTime, LOGGER);
                    return;
                }
            }

            // next step: put new words
            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_WORDS);
            queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_WORDS).param(PARAM_ACTION, ACTION_WORDS));

            AppUtils.print("BookWords creation process is over", resp, startTime, LOGGER);
            return;

        } else if (ACTION_WORDS.equalsIgnoreCase(action)) {
            //
            // loop through all bookWords to create the words
            final Query<BookWord> query = dao.ofy().query(BookWord.class);

            final String cursorParam = req.getParameter(AppUrls.PARAM_CURSOR);
            if (cursorParam != null) {
                query.startCursor(Cursor.fromWebSafeString(cursorParam));
            }

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
                dao.ofy().put(new Word().value(value).display(display)); // TODO PGU add weight based on count?
                wordsCache.add(wordCache); // update cache

                if (AppUtils.hasReachedTimeOut(startTime)) {
                    final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_WORDS);
                    queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_WORDS) //
                            .param(PARAM_ACTION, ACTION_WORDS) //
                            .param(AppUrls.PARAM_CURSOR, itr.getCursor().toWebSafeString()));

                    AppUtils.print("Words creation in process", resp, startTime, LOGGER);
                    return;
                }
            }

            AppUtils.print("Words creation process is over", resp, startTime, LOGGER);
            return;

        } else {
            AppUtils.setBadRequest("Unknown action: " + action, resp, LOGGER);
            return;
        }
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

    private <T extends IsWord> boolean deleteWords(final Class<T> clazz, final long startTime) {

        final boolean hasWord = dao.ofy().query(clazz).limit(1).count() > 0;

        if (hasWord) {
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
