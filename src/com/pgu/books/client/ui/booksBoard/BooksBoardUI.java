package com.pgu.books.client.ui.booksBoard;

import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.activity.booksBoard.BooksBoardPresenter;
import com.pgu.books.client.ui.utils.IsFocusable;

public interface BooksBoardUI extends IsWidget, IsFocusable {

    void setPresenter(BooksBoardPresenter presenter);

}
