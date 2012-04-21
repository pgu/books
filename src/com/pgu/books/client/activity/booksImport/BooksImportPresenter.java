package com.pgu.books.client.activity.booksImport;

public interface BooksImportPresenter {

    void importBooks(String categoryTitle);

    void testImport();

    void deleteBooks();

    void showImportError(String message);

}
