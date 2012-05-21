package com.pgu.books.server.rpc;

import static com.pgu.books.server.domain.document.BookDoc.AUTHOR;
import static com.pgu.books.server.domain.document.BookDoc.BOOK_ID;
import static com.pgu.books.server.domain.document.BookDoc.CATEGORY;
import static com.pgu.books.server.domain.document.BookDoc.COMMENT;
import static com.pgu.books.server.domain.document.BookDoc.EDITOR;
import static com.pgu.books.server.domain.document.BookDoc.TITLE;
import static com.pgu.books.server.domain.document.BookDoc.YEAR;
import static com.pgu.books.server.domain.document.BookDoc._DOC_TYPE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.search.Document;
import com.google.appengine.api.search.Field;
import com.google.appengine.api.search.Index;
import com.google.appengine.api.search.IndexSpec;
import com.google.appengine.api.search.Query;
import com.google.appengine.api.search.Results;
import com.google.appengine.api.search.ScoredDocument;
import com.google.appengine.api.search.SearchServiceFactory;
import com.google.gwt.thirdparty.guava.common.base.Strings;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pgu.books.client.rpc.AdminBooksService;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.ArchivedBook;
import com.pgu.books.server.domain.BookId;
import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.utils.BookCategory;

@SuppressWarnings("serial")
public class AdminBooksServiceImpl extends RemoteServiceServlet implements AdminBooksService {

    private static final Logger LOG   = Logger.getLogger(AdminBooksServiceImpl.class.getSimpleName());

    private static final Index  INDEX = SearchServiceFactory.getSearchService().getIndex(
                                              IndexSpec.newBuilder().setName("shared_index"));

    private final DAO           dao   = new DAO();

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

                    final String authorRaw = tokens[0].trim();
                    final String author = authorRaw.isEmpty() ? "" : authorRaw.substring(1); // removes first "

                    final String categoryRaw = tokens[5].trim();
                    final String category = categoryRaw.isEmpty() ? "" : categoryRaw.substring(0,
                            categoryRaw.length() - 1); // removes last "

                    final String title = tokens[1].trim();
                    final String editor = tokens[2].trim();
                    final String _year = tokens[3].trim();
                    final Integer year = Strings.isNullOrEmpty(_year) ? null : Integer.valueOf(_year);
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

    // https://developers.google.com/appengine/docs/java/search/overview
    @Override
    public void saveBook(final Book book) {
        if (null == book.getId()) {

            // generate an id
            final BookId bookId = new BookId();
            dao.ofy().put(bookId);

            // create a doc for the book
            final Document.Builder docBuilder = Document.newBuilder() //
                    .addField(Field.newBuilder().setName(_DOC_TYPE._()).setText("book")) //
                    .addField(Field.newBuilder().setName(BOOK_ID._()).setNumber(bookId.getId())) //
                    .addField(Field.newBuilder().setName(AUTHOR._()).setText(book.getAuthor())) //
                    .addField(Field.newBuilder().setName(TITLE._()).setText(book.getTitle())) //
                    .addField(Field.newBuilder().setName(EDITOR._()).setText(book.getEditor())) //
                    .addField(Field.newBuilder().setName(YEAR._()).setNumber(book.getYear())) //
                    .addField(Field.newBuilder().setName(COMMENT._()).setText(book.getComment())) //
                    .addField(Field.newBuilder().setName(CATEGORY._()).setText(book.getCategory()));

            INDEX.add(docBuilder.build());

        } else {

            // retrieves the doc for the book id
            final Results<ScoredDocument> results = INDEX.search(Query.newBuilder().build("" + //
                    _DOC_TYPE._() + ":book " + //
                    BOOK_ID._() + ":" + book.getId()) //
                    );

            final ScoredDocument doc = results.iterator().next();

            // removes it from the index 

            // creates a new one with the same book id
            final Document.Builder docBuilder = Document.newBuilder() //
                    .addField(Field.newBuilder().setName(_DOC_TYPE._()).setText("book")) //
                    .addField(Field.newBuilder().setName(BOOK_ID._()).setNumber(book.getId())) //
                    .addField(Field.newBuilder().setName(AUTHOR._()).setText(book.getAuthor())) //
                    .addField(Field.newBuilder().setName(TITLE._()).setText(book.getTitle())) //
                    .addField(Field.newBuilder().setName(EDITOR._()).setText(book.getEditor())) //
                    .addField(Field.newBuilder().setName(YEAR._()).setNumber(book.getYear())) //
                    .addField(Field.newBuilder().setName(COMMENT._()).setText(book.getComment())) //
                    .addField(Field.newBuilder().setName(CATEGORY._()).setText(book.getCategory()));

            INDEX.add(docBuilder.build());

        }
    }

    @Override
    public void deleteBooks(final ArrayList<Book> selectedBooks) {
        final String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date());

        final ArrayList<ArchivedBook> archivedBooks = new ArrayList<ArchivedBook>(selectedBooks.size());
        for (final Book book : selectedBooks) {

            final ArchivedBook archivedBook = new ArchivedBook(book);
            archivedBook.setBookId(book.getId());
            archivedBook.setArchiveDate(date);

            archivedBooks.add(archivedBook);
        }
        dao.ofy().put(archivedBooks);

        dao.ofy().delete(selectedBooks);
    }
}
