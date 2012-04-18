package com.pgu.books.client.rpc;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BooksFiltersDTO;

public interface BooksServiceAsync {

    void countBooks(BooksFiltersDTO filtersDTO, AsyncCallback<Integer> asyncCallbackApp);

    void fetchBooks(BooksFiltersDTO filtersDTO, int start, int length, AsyncCallback<ArrayList<Book>> asyncCallbackApp);

    void fetchWords(String text, AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void countAuthorsByLetters(AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void countEditorsByLetters(AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void countCategoriesByLetters(AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchFilterCategories(String letter, AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchFilterEditors(String letter, AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchFilterAuthors(String letter, AsyncCallback<ArrayList<String>> asyncCallbackApp);

}
