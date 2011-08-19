package com.pgu.books.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BookServiceAsync {

    void createBooks(String cat, AsyncCallback<Void> asyncCallback);

}
