package com.pgu.books.client.ui.booksCharts;

import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.activity.booksCharts.BooksChartsPresenter;
import com.pgu.books.client.ui.utils.IsFocusable;

public interface BooksChartsUI extends IsWidget, IsFocusable {

    void setPresenter(BooksChartsPresenter presenter);

}
