package com.pgu.books.client.ui.booksBoard.filters;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.activity.booksBoard.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.utils.FilterType;

public interface BooksFiltersUI extends IsWidget {

    void setPresenter(BooksFiltersPresenter presenter);

    void setCounts(ArrayList<String> countsByLetters, FilterType author);

    void setFilters(ArrayList<String> filters, Letter letter, FilterType filterType);

}
