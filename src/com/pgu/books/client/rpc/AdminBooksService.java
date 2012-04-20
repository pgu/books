package com.pgu.books.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.pgu.books.shared.domain.Book;

@RemoteServiceRelativePath("admin/books")
public interface AdminBooksService extends RemoteService {

    String importBooks(String categoryTitle);

    String testImport();

    void deleteAll();

    void saveBook(Book book);
}
