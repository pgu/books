package com.pgu.books.client.activity.booksImport;

public interface BooksImportPresenter {

    void importBooks(int start, int length);

    void deleteAllBooks();

}
