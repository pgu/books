package com.pgu.books.client.ui.booksBoard.list;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.activity.booksBoard.list.BooksGridPresenter;
import com.pgu.books.shared.domain.Book;

public interface BooksGridUI extends IsWidget {

    void setPresenter(BooksGridPresenter presenter);

    void initFetchBooks();

    void initFetchFlags();

    void setNbBooks(Integer count);

    void showBooks(ArrayList<Book> books);

    int getLength();

    void refreshGrid();

}
