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
import com.pgu.books.shared.BookCategory;

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
        importBooks(BookCategory.titles.get(0));
    }

    private void importBooks(final String filename) {
        final InputStream is = getServletContext().getResourceAsStream("/WEB-INF/books/" + filename + "txt");
        final BufferedReader br = new BufferedReader(new InputStreamReader(is));
        final Objectify ofy = ObjectifyService.begin();
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

                    ofy.put(new Book(author, tokens[1], tokens[2], tokens[3], tokens[4], category));
                }
            }

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void importAllBooks() {
        for (final String title : BookCategory.titles) {
            importBooks(title);
        }
    }

}
