package com.pgu.books.server.rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pgu.books.client.BookService;
import com.pgu.books.server.access.DAO;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BookCategory;

@SuppressWarnings("serial")
public class BookServiceImpl extends RemoteServiceServlet implements BookService {

    private final DAO dao = new DAO();

    // final Objectify ofy = ObjectifyService.begin();
    // final List<Book> books = BooksDB.DB.get(cat);
    // ofy.put(books);
    // ofy.query(Book.class).filter("author", "toto").list();

    @Override
    public void testImport() {
        importBooks(BookCategory.titles.get(0));
    }

    @Override
    public void importBooks(final String categoryTitle) {
        final InputStream is = getServletContext().getResourceAsStream("/WEB-INF/books/" + categoryTitle + ".txt");
        final BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {

            String line = null;
            while ((line = br.readLine()) != null) {
                final String[] tokens = line.split("\", \"");
                if (tokens.length == 6) {

                    final String rawAuthor = tokens[0];
                    final String author = rawAuthor.isEmpty() ? "" : rawAuthor.substring(1); // removes first "

                    final String rawCategory = tokens[5];
                    final String category = rawCategory.isEmpty() ? "" : rawCategory.substring(0,
                            rawCategory.length() - 1); // removes last "

                    dao.ofy().put(new Book(author, tokens[1], tokens[2], tokens[3], tokens[4], category));
                }
            }

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Book> fetchBooks(final int start, final int length) {
        return new ArrayList<Book>(dao.ofy().query(Book.class).order("title").offset(start).limit(length).list());

        // final Objectify ofy = ObjectifyService.begin();
        // final List<Book> books = BooksDB.DB.get(cat);
        // ofy.put(books);
        // ofy.query(Book.class).filter("author", "toto").list();
    }

    @Override
    public int countBooks() {
        return dao.ofy().query(Book.class).count();
    }

}
