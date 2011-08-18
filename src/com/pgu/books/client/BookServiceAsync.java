package com.pgu.books.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BookServiceAsync {

    void createBooks(AsyncCallback<Void> asyncCallback);

}
