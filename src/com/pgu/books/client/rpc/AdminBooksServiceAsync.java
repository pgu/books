package com.pgu.books.client.rpc;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.shared.domain.Book;

public interface AdminBooksServiceAsync {

    void testImport(AsyncCallback<String> asyncCallbackApp);

    void importBooks(String categoryTitle, AsyncCallback<String> asyncCallback);

    void deleteAll(AsyncCallback<Void> asyncCallbackApp);

    void saveBook(Book book, AsyncCallback<Void> asyncCallbackApp);

    void deleteBooks(ArrayList<Book> selectedBooks, AsyncCallback<Void> asyncCallbackApp);

}
