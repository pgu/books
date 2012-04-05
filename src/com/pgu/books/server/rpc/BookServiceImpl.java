package com.pgu.books.server.rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.pgu.books.client.BookService;
import com.pgu.books.shared.Book;

@SuppressWarnings("serial")
public class BookServiceImpl extends RemoteServiceServlet implements BookService {

    static {
        ObjectifyService.register(Book.class);
    }

    @Override
    public void createBooks(final String cat) {
        final Objectify ofy = ObjectifyService.begin();

        final List<Book> books = BooksDB.DB.get(cat);
        ofy.put(books);

        // ofy.query(Book.class).filter("author", "toto").list();

    }

    @Override
    public void testImport() {
        final InputStream is = getServletContext().getResourceAsStream("/WEB-INF/books/Test.txt");
        final BufferedReader br = new BufferedReader(new InputStreamReader(is));
        final Objectify ofy = ObjectifyService.begin();
        try {

            String line = null;
            while ((line = br.readLine()) != null) {
                final String[] tokens = line.split(";");
                if (tokens.length == 6) {
                    ofy.put(new Book(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]));
                }
            }

        } catch (final IOException e) {
            e.printStackTrace();
        }

    }

}
