package com.pgu.books.client.rpc;

import java.util.ArrayList;
import java.util.TreeMap;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.shared.dto.BooksQueryParameters;
import com.pgu.books.shared.dto.BooksResult;

public interface BooksServiceAsync {

    void fetchBooks(BooksQueryParameters filtersDTO, int start, int length, AsyncCallback<BooksResult> asyncCallbackApp);

    void fetchWords(String text, AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void countAuthorsByLetters(AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void countEditorsByLetters(AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void countCategoriesByLetters(AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchFilterCategories(String letter, AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchFilterEditors(String letter, AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchFilterAuthors(String letter, AsyncCallback<ArrayList<String>> asyncCallbackApp);

    void fetchNbBooksByCategories(AsyncCallback<TreeMap<String, Integer>> asyncCallbackApp);

    void fetchNbBooksByEditors(AsyncCallback<TreeMap<String, Integer>> asyncCallbackApp);

}
