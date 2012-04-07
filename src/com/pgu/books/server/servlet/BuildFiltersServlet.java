package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pgu.books.server.access.DAO;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BookFilter;

@SuppressWarnings("serial")
public class BuildFiltersServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(BuildFiltersServlet.class.getName());

    private final DAO dao = new DAO();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {
        LOGGER.info("...GET request ");
        doPost(req, resp);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {
        // TODO PGU voir queue task

        // clean filters // TODO PGU cursor
        dao.ofy().delete(dao.ofy().query(BookFilter.class).listKeys());

        // loop through all books // TODO PGU cursor
        final List<Book> books = dao.ofy().query(Book.class).list();
        for (final Book book : books) {

            final String author = book.getAuthor();
            putFilter(BookFilter.Type.AUTHOR, author);

            final String editor = book.getEditor();
            putFilter(BookFilter.Type.EDITOR, editor);

            final String category = book.getCategory();
            putFilter(BookFilter.Type.CATEGORY, category);
        }

        // get authors, editors, categories
        // if !exists then put else nothing
    }

    private void putFilter(final BookFilter.Type type, final String value) {
        final int count = dao.ofy().query(BookFilter.class) //
                .filter("type", type) //
                .filter("value", value).count();

        if (count == 0) {

            dao.ofy().put(new BookFilter().type(type).value(value));
            try {
                Thread.sleep(200); // give time for the indexer
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
