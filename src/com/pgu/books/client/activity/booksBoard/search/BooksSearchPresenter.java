package com.pgu.books.client.activity.booksBoard.search;

public interface BooksSearchPresenter {

    void getSuggestions(String text);

    void searchBooks(String text);

}
