package com.pgu.books.server.access;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;
import com.pgu.books.shared.Book;

public class DAO extends DAOBase {

    static {
        ObjectifyService.register(Book.class);
    }

}
