package com.pgu.books.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AdminBooksServiceAsync {

    void testImport(AsyncCallback<String> asyncCallbackApp);

    void importBooks(String categoryTitle, AsyncCallback<String> asyncCallback);

    void deleteAll(AsyncCallback<Void> asyncCallbackApp);

}