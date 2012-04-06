package com.pgu.books.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.shared.Book;

public interface BookServiceAsync {

    void testImport(AsyncCallback<Void> asyncCallback);

    void importBooks(String categoryTitle, AsyncCallback<Void> asyncCallback);

    void fetchBooks(int start, int length, AsyncCallback<ArrayList<Book>> asyncCallback);

    void countBooks(AsyncCallback<Integer> asyncCallbackApp);

}
