package com.pgu.books.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BooksFiltersDTO;

public interface BooksServiceAsync {

    void testImport(AsyncCallback<String> asyncCallbackApp);

    void importBooks(String categoryTitle, AsyncCallback<String> asyncCallback);

    void countBooks(BooksFiltersDTO filtersDTO, AsyncCallback<Integer> asyncCallbackApp);

    void fetchBooks(BooksFiltersDTO filtersDTO, int start, int length, AsyncCallback<ArrayList<Book>> asyncCallbackApp);

    void delete(AsyncCallback<Void> asyncCallbackApp);

    void fetchFilterAuthors(AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchFilterEditors(AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchFilterCategories(AsyncCallback<ArrayList<String>> asyncCallbackApp);

}