package com.pgu.books.server.rpc;

import static com.pgu.books.server.domain.document.BookDoc.ARCHIVE_DATE;
import static com.pgu.books.server.domain.document.BookDoc.AUTHOR;
import static com.pgu.books.server.domain.document.BookDoc.BOOK_ID;
import static com.pgu.books.server.domain.document.BookDoc.CATEGORY;
import static com.pgu.books.server.domain.document.BookDoc.COMMENT;
import static com.pgu.books.server.domain.document.BookDoc.DOC_TYPE;
import static com.pgu.books.server.domain.document.BookDoc.EDITOR;
import static com.pgu.books.server.domain.document.BookDoc.TITLE;
import static com.pgu.books.server.domain.document.BookDoc.YEAR;
import static com.pgu.books.server.domain.document.DocType.ARCHIVE_BOOK;
import static com.pgu.books.server.domain.document.DocType.BOOK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.appengine.api.search.Query;
import com.google.appengine.api.search.Results;
import com.google.appengine.api.search.ScoredDocument;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pgu.books.client.rpc.AdminBooksService;
import com.pgu.books.server.AppDoc;
import com.pgu.books.server.AppLog;
import com.pgu.books.server.Search;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.sql.BookFilter;
import com.pgu.books.server.domain.sql.BookId;
import com.pgu.books.server.domain.sql.BookLetter;
import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.utils.AppUtils;

@SuppressWarnings("serial")
public class AdminBooksServiceImpl extends RemoteServiceServlet implements AdminBooksService {

    private final AppLog   log = new AppLog();
    private final Search   s   = new Search();
    private final DAO      dao = new DAO();
    private final AppUtils u   = new AppUtils();

    @Override
    public String importBooks(final int start, final int length) {

        final long startTime = System.currentTimeMillis();
        final int stop = start + length;
        log.info(this, "Importing books from %s to %s", start, stop);

        final InputStream is = getServletContext().getResourceAsStream("/WEB-INF/books/import/books.txt");
        final BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
        try {

            boolean hasWarning = false;

            int counter = 0;
            int countImported = 0;

            String line = null;
            while ((line = br.readLine()) != null) {

                if (counter < start) {
                    counter++;
                    continue;
                }

                if (counter >= stop) {
                    break;
                }

                counter++;
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
                    final Integer year = u.isVoid(_year) ? null : Integer.valueOf(_year);
                    final String comment = tokens[4].trim();

                    saveBook(new Book(author, title, editor, year, comment, category));

                } else {
                    hasWarning = true;
                    log.warning(this, "The book %s has not been imported: %s", counter, line);
                }
            }

            log.info(this, "Imported books: %s/%s in %s ms", countImported, length, System.currentTimeMillis()
                    - startTime);

            return hasWarning ? "Warning: not all the books have been imported"
                    : "Success: All the books have been imported";

        } catch (final IOException e) {
            log.error(this, e);
            return e.getMessage();
        }
    }

    @Override
    public void deleteAll() {
        // TODO if (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production) {
        // return; // The app is running on App Engine...
        // }

        final QueryResultIterator<BookId> bookIdItr = dao.ofy().query(BookId.class).iterator();
        while (bookIdItr.hasNext()) {
            dao.ofy().delete(bookIdItr.next());
        }

        final Iterator<ScoredDocument> bookDocItr = s.idx().search(Query.newBuilder().build("" + //
                DOC_TYPE._() + ":" + BOOK._())).iterator();
        while (bookDocItr.hasNext()) {
            s.idx().remove(bookDocItr.next().getId());
        }

        final Iterator<ScoredDocument> archiveDocItr = s.archiveIdx().search(Query.newBuilder().build("" + //
                DOC_TYPE._() + ":" + ARCHIVE_BOOK._())).iterator();
        while (archiveDocItr.hasNext()) {
            s.archiveIdx().remove(archiveDocItr.next().getId());
        }
    }

    // https://developers.google.com/appengine/docs/java/search/overview
    @Override
    public void saveBook(final Book book) {

        if (null == book.getId()) { // creation

            // generate an id
            final BookId bookId = new BookId();
            dao.ofy().put(bookId);

            // create a doc for the book
            final AppDoc doc = new AppDoc() //
                    .text(DOC_TYPE, BOOK._()) //
                    .num(BOOK_ID, bookId.getId()) //
                    .text(AUTHOR, book.getAuthor()) //
                    .text(TITLE, book.getTitle()) //
                    .text(EDITOR, book.getEditor()) //
                    .num(YEAR, book.getYear()) //
                    .text(COMMENT, book.getComment()) //
                    .text(CATEGORY, book.getCategory()) //
            ;
            s.idx().add(doc.build());

            // TODO PGU Jul 11, 2012 see the added value of doing this..
//            final String filterValue = book.getAuthor();
//            if (!u.isVoid(filterValue)) {
//
//                // save a filter if it does not exist
//                final com.googlecode.objectify.Query<BookFilter> filterQuery = dao.ofy().query(BookFilter.class);
//                filterQuery.filter("type =", BookFilter.Type.AUTHOR);
//                filterQuery.filter("value =", filterValue);
//
//                if (0 == filterQuery.count()) {
//                    final BookFilter filterAuthor = new BookFilter();
//                    filterAuthor.setType(BookFilter.Type.AUTHOR);
//                    filterAuthor.setValue(filterValue);
//                    dao.ofy().put(filterAuthor);
//                }
//
//                // save a its letter it the filter does not exist OR increment by 1
//                final String upperLetter = filterValue.substring(0, 1).toUpperCase();
//
//                final com.googlecode.objectify.Query<BookLetter> letterQuery = dao.ofy().query(BookLetter.class);
//                letterQuery.filter("type =", BookFilter.Type.AUTHOR);
//                letterQuery.filter("upperLetter =", upperLetter);
//
//                if (0 == letterQuery.count()) {
//                    final BookLetter letterAuthor = new BookLetter();
//                    letterAuthor.setType(BookFilter.Type.AUTHOR);
//                    letterAuthor.setNb(1);
//                    letterAuthor.setUpperLetter(upperLetter);
//                    dao.ofy().put(letterAuthor);
//                } else {
//                    final BookLetter letterAuthor = letterQuery.get();
//                    letterAuthor.setNb(letterAuthor.getNb() + 1);
//                    dao.ofy().put(letterAuthor);
//                }
//
//            }

        } else { // update

            // retrieves the doc with the book id
            final ScoredDocument currentDoc = fetchDocByBook(book);

            s.idx().remove(currentDoc.getId());

            // creates a new one with the same book id
            final AppDoc newDoc = new AppDoc() //
                    .text(DOC_TYPE, BOOK._()) //
                    .num(BOOK_ID, book.getId()) //
                    .text(AUTHOR, book.getAuthor()) //
                    .text(TITLE, book.getTitle()) //
                    .text(EDITOR, book.getEditor()) //
                    .num(YEAR, book.getYear()) //
                    .text(COMMENT, book.getComment()) //
                    .text(CATEGORY, book.getCategory()) //
            ;
            s.idx().add(newDoc.build());
        }

        // TODO PGU update number of authors, categories, editor, year
    }

    @Override
    public void deleteBooks(final ArrayList<Book> selectedBooks) {

        final String now = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        final ArrayList<Long> bookIds = new ArrayList<Long>(selectedBooks.size());

        for (final Book book : selectedBooks) {
            final ScoredDocument doc = fetchDocByBook(book);

            final AppDoc archiveDoc = new AppDoc() //
                    .text(DOC_TYPE, ARCHIVE_BOOK._()) //
                    .copyNumLong(BOOK_ID, doc) //
                    .copyText(AUTHOR, doc) //
                    .copyText(TITLE, doc) //
                    .copyText(EDITOR, doc) //
                    .copyNumInt(YEAR, doc) //
                    .copyText(COMMENT, doc) //
                    .copyText(CATEGORY, doc) //
                    .text(ARCHIVE_DATE, now) //
            ;

            s.idx().remove(doc.getId()); // removes it from the index
            s.archiveIdx().add(archiveDoc.build()); // adds the archive

            bookIds.add(book.getId());

            // TODO PGU update number of authors, categories, editor, year
        }

        // clean bookIds
        final Map<Long, BookId> id2bookId = dao.ofy().get(BookId.class, bookIds);
        dao.ofy().delete(id2bookId.values());
    }

    private ScoredDocument fetchDocByBook(final Book book) {
        final Results<ScoredDocument> docs = s.idx().search(Query.newBuilder().build("" + //
                DOC_TYPE._() + ":" + BOOK._() + " " + //
                BOOK_ID._() + ":" + book.getId()) //
                );

        if (docs.getNumberReturned() == 1) {
            return docs.iterator().next();

        } else {
            final IllegalArgumentException e = new IllegalArgumentException(String.format(
                    "%s results have been found for the book id %s", docs.getNumberReturned(), book.getId()));
            log.error(this, e);
            throw e;
        }
    }
}
