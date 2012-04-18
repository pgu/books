package com.pgu.books.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("admin/books")
public interface AdminBooksService extends RemoteService {

    String test(String string);

}
