package com.pgu.books.client.ui.booksBoard.grid;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.activity.booksBoard.grid.BooksGridPresenter;
import com.pgu.books.shared.Book;

public interface BooksGridUI extends IsWidget {

    void setPresenter(BooksGridPresenter presenter);

    void initFetchBooks();

    void initFetch();

    void setNbBooks(Integer count);

    void showBooks(ArrayList<Book> books);

    int getLength();

}
