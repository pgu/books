package com.pgu.books.shared.dto;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.pgu.books.shared.domain.Book;

public class BooksResult implements IsSerializable {

    private ArrayList<Book> books;
    private long            nbFound;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(final ArrayList<Book> books) {
        this.books = books;
    }

    public long getNbFound() {
        return nbFound;
    }

    public void setNbFound(final long nbFound) {
        this.nbFound = nbFound;
    }

}
