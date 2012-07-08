package com.pgu.books.client.ui.booksImport;

import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.ui.utils.IsFocusable;

public interface BooksImportUI extends IsWidget, IsFocusable {

    void setPresenter(BooksImportPresenter booksImportPresenter);

}
