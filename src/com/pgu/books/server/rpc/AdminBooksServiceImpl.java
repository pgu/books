package com.pgu.books.server.rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.ibm.icu.text.SimpleDateFormat;
import com.pgu.books.client.rpc.AdminBooksService;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.ArchivedBook;
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

                    final String title = tokens[1].trim();
                    final String editor = tokens[2].trim();
                    final String year = tokens[3].trim();
                    final String comment = tokens[4].trim();

                    dao.ofy().put(new Book(author, title, editor, year, comment, category));

                } else {
                    LOG.warning("** Not imported: " + line);
                }
            }

            return countImported + " / " + countTotal + " (" + (System.currentTimeMillis() - startTime) + " ms)";

        } catch (final IOException e) {
            e.printStackTrace();
        }

        return "An error occurred!";
    }

    @Override
    public void deleteAll() {
        // if (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production) {
        // return; // The app is running on App Engine...
        // }

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
        final String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date());

        final ArrayList<ArchivedBook> archivedBooks = new ArrayList<ArchivedBook>(selectedBooks.size());
        for (final Book book : selectedBooks) {

            final ArchivedBook archivedBook = new ArchivedBook(book);
            archivedBook.setArchiveDate(date);
            archivedBooks.add(archivedBook);
        }
        dao.ofy().put(archivedBooks);

        dao.ofy().delete(selectedBooks);
    }
}
