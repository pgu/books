package com.pgu.books.client.rpc;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.pgu.books.shared.domain.Book;

@RemoteServiceRelativePath("admin/books")
public interface AdminBooksService extends RemoteService {

    String importBooks(int start, int length);

    void deleteAll();

    void saveBook(Book book);

    void deleteBooks(ArrayList<Book> selectedBooks);
}
