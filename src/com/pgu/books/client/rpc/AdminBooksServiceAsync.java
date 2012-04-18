package com.pgu.books.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AdminBooksServiceAsync {

    void test(String string, AsyncCallback<String> asyncCallbackApp);

}
