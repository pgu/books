package com.pgu.books.client.ui.booksImport;

import com.pgu.books.client.activity.booksImport.BooksImportPresenter;

public interface BooksImportUI {

    void setPresenter(BooksImportPresenter booksImportPresenter);

    void enableImport(String categoryTitle);

    void disableImport(String categoryTitle, String importResult);

}
