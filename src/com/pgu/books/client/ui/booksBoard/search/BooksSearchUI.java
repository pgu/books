package com.pgu.books.client.ui.booksBoard.search;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.activity.booksBoard.search.BooksSearchPresenter;

public interface BooksSearchUI extends IsWidget {

    void setPresenter(BooksSearchPresenter presenter);

    void setWords(ArrayList<String> words, String text);

}
