package com.pgu.books.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("book")
public interface BookService extends RemoteService {

    void createBooks(String cat);

    void testImport();

}
