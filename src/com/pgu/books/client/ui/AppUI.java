package com.pgu.books.client.ui;

import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.activity.AppPresenter;
import com.pgu.books.client.ui.booksBoard.BooksBoardUI;
import com.pgu.books.client.ui.booksBoard.filters.BooksFiltersUI;
import com.pgu.books.client.ui.booksBoard.grid.BooksGridUI;
import com.pgu.books.client.ui.booksBoard.search.BooksSearchUI;
import com.pgu.books.client.ui.booksCharts.BooksChartsUI;
import com.pgu.books.client.ui.booksImport.BooksImportUI;
import com.pgu.books.client.ui.booksMenu.BooksMenuUI;

public interface AppUI extends IsWidget {

    void setPresenter(AppPresenter presenter);

    BooksBoardUI getBooksBoardUI();

    BooksChartsUI getBooksChartsUI();

    BooksImportUI getBooksImportUI();

    BooksFiltersUI getBooksFiltersUI();

    BooksSearchUI getBooksSearchUI();

    BooksGridUI getBooksGridUI();

    void showBooks();

    void showCharts();

    void showImport();

    void showUnknownTag(String tag);

    BooksMenuUI getBooksMenuUI();

}
