package com.pgu.books.client.presenter.booksImport;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.client.BookService;
import com.pgu.books.client.BookServiceAsync;

public class BooksImportPresenterImpl implements BooksImportPresenter {

    private final BookServiceAsync bookService = GWT.create(BookService.class);

    @Override
    public void createBooks(final String categoryTitle) {
        bookService.createBooks(categoryTitle, new AsyncCallback<Void>() {

            @Override
            public void onFailure(final Throwable caught) {
            }

            @Override
            public void onSuccess(final Void result) {
                Window.alert("done for " + categoryTitle);
            }
        });

    }

}
