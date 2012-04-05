package com.pgu.books.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BookServiceAsync {

    void testImport(AsyncCallback<Void> asyncCallback);

    void importBooks(String categoryTitle, AsyncCallback<Void> asyncCallback);

}
