package com.pgu.books.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BooksFiltersDTO;

public interface BooksServiceAsync {

    void testImport(AsyncCallback<Void> asyncCallback);

    void importBooks(String categoryTitle, AsyncCallback<Void> asyncCallback);

    void countBooks(BooksFiltersDTO filtersDTO, AsyncCallback<Integer> asyncCallbackApp);

    void fetchBooks(BooksFiltersDTO filtersDTO, int start, int length, AsyncCallback<ArrayList<Book>> asyncCallbackApp);

}
