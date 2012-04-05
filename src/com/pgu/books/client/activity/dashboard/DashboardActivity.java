package com.pgu.books.client.activity.dashboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.client.BookService;
import com.pgu.books.client.BookServiceAsync;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.ui.Dashboard;

public class DashboardActivity implements DashboardPresenter, BooksImportPresenter {

    public static DashboardActivity INSTANCE = new DashboardActivity();

    private DashboardActivity() {
    }

    private final BookServiceAsync bookService = GWT.create(BookService.class);

    private Dashboard              dashboardUI;

    public Dashboard start() {
        if (null == dashboardUI) {
            dashboardUI = new Dashboard();
            dashboardUI.setPresenter(this);
            dashboardUI.getBooksImportUI().setPresenter(this);
        }
        return dashboardUI;
    }

    @Override
    public void createBooks(final String categoryTitle) {
        bookService.createBooks(categoryTitle, new AsyncCallback<Void>() {

            @Override
            public void onFailure(final Throwable caught) {
                dashboardUI.getBooksImportUI().enableImport(categoryTitle);
            }

            @Override
            public void onSuccess(final Void result) {
                dashboardUI.getBooksImportUI().disableImport(categoryTitle);
            }
        });

    }

    public void buildCharts() {
        dashboardUI.buildCharts();
    }

}
