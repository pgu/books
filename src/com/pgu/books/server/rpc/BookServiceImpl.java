package com.pgu.books.server.rpc;

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

    }

}
