package com.pgu.books.client.activity.books.search;

public interface BooksSearchPresenter {

    void getSuggestions(String text);

    void searchBooks(String text);

}
