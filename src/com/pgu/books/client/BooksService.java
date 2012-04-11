package com.pgu.books.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BooksFiltersDTO;

@RemoteServiceRelativePath("books")
public interface BooksService extends RemoteService {

    String importBooks(String categoryTitle);

    String testImport();

    ArrayList<Book> fetchBooks(BooksFiltersDTO filtersDTO, int start, int length);

    int countBooks(BooksFiltersDTO filtersDTO);

    void delete();

    ArrayList<String> fetchFilterAuthors();

    ArrayList<String> fetchFilterEditors();

    ArrayList<String> fetchFilterCategories();

    ArrayList<String> fetchWords(String text);

    ArrayList<String> countAuthorsByLetters();

    ArrayList<String> countEditorsByLetters();

    ArrayList<String> countCategoriesByLetters();

    ArrayList<String> fetchFilterCategories(String letter);

    ArrayList<String> fetchFilterEditors(String letter);

    ArrayList<String> fetchFilterAuthors(String letter);

}
