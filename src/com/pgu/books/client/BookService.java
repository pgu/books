package com.pgu.books.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.pgu.books.shared.Book;

@RemoteServiceRelativePath("book")
public interface BookService extends RemoteService {

    void importBooks(String categoryTitle);

    void testImport();

    ArrayList<Book> fetchBooks(int start, int length);

    int countBooks();

}
