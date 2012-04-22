package com.pgu.books.server.rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.google.appengine.api.utils.SystemProperty;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pgu.books.client.rpc.AdminBooksService;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.ArchivedBook;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.utils.BookCategory;

@SuppressWarnings("serial")
public class AdminBooksServiceImpl extends RemoteServiceServlet implements AdminBooksService {

    private static final Logger LOG = Logger.getLogger(AdminBooksServiceImpl.class.getSimpleName());

    private final DAO           dao = new DAO();

    @Override
    public String testImport() {
        return importBooks(BookCategory.titles.get(0));
    }

    @Override
    public String importBooks(final String categoryTitle) {
        final long startTime = System.currentTimeMillis();

        final InputStream is = getServletContext().getResourceAsStream("/WEB-INF/books/" + categoryTitle + ".txt");
        final BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
        try {

            int countTotal = 0;
            int countImported = 0;

            String line = null;
            while ((line = br.readLine()) != null) {
                countTotal++;

                final String[] tokens = line.split("\", \"");
                if (tokens.length == 6) {
                    countImported++;

                    final String authorRaw = tokens[0];
                    final String author = authorRaw.isEmpty() ? "" : authorRaw.substring(1); // removes first "

                    final String categoryRaw = tokens[5];
                    final String category = categoryRaw.isEmpty() ? "" : categoryRaw.substring(0,
                            categoryRaw.length() - 1); // removes last "

                    final String title = tokens[1];
                    final String editor = tokens[2];
                    final String year = tokens[3];
                    final String comment = tokens[4];

                    dao.ofy().put(new Book(author, title, editor, year, comment, category));

                } else {
                    LOG.warning("Not imported: " + line);
                }
            }

            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_WORDS);
            queue.add(TaskOptions.Builder.withUrl(AppUrls.BUILD_WORDS));

            return countImported + " / " + countTotal + " (" + (System.currentTimeMillis() - startTime) + " ms)";

        } catch (final IOException e) {
            e.printStackTrace();
        }

        return "An error occurred!";
    }

    @Override
    public void deleteAll() {
        if (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production) {
            return; // The app is running on App Engine...
        }

        final QueryResultIterator<Book> itr = dao.ofy().query(Book.class).iterator();
        while (itr.hasNext()) {
            dao.ofy().delete(itr.next());
        }
    }

    @Override
    public void saveBook(final Book book) {
        dao.ofy().put(book);
    }

    @Override
    public void deleteBooks(final ArrayList<Book> selectedBooks) {
        final ArrayList<ArchivedBook> archivedBooks = new ArrayList<ArchivedBook>(selectedBooks.size());
        for (final Book book : selectedBooks) {
            archivedBooks.add(new ArchivedBook(book));
        }
        dao.ofy().put(archivedBooks);

        dao.ofy().delete(selectedBooks);
    }

}
