package com.pgu.books.client.rpc;

import java.util.ArrayList;
import java.util.TreeMap;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.pgu.books.shared.dto.BooksQueryParameters;
import com.pgu.books.shared.dto.BooksResult;

@RemoteServiceRelativePath("books")
public interface BooksService extends RemoteService {

    BooksResult fetchBooks(BooksQueryParameters filtersDTO, int start, int length);

    ArrayList<String> fetchWords(String text);

    ArrayList<String> countAuthorsByLetters();

    ArrayList<String> countEditorsByLetters();

    ArrayList<String> countCategoriesByLetters();

    ArrayList<String> fetchFilterCategories(String letter);

    ArrayList<String> fetchFilterEditors(String letter);

    ArrayList<String> fetchFilterAuthors(String letter);

    TreeMap<String, Integer> fetchNbBooksByCategories();

    TreeMap<String, Integer> fetchNbBooksByEditors();

}
