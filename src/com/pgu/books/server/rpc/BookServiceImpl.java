package com.pgu.books.server.rpc;

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
    public void createBooks() {
        final Objectify ofy = ObjectifyService.begin();

        ofy.put(new Book("Concha Zardoya", "Rialp", 1946, "Pájaros del nuevo mundo XXVII", ""));

    }

}
