package com.pgu.books.client.activity.dashboard;

import com.pgu.books.client.presenter.booksImport.BooksImportPresenter;
import com.pgu.books.client.presenter.booksImport.BooksImportPresenterImpl;
import com.pgu.books.client.presenter.dashboard.DashboardPresenter;
import com.pgu.books.client.presenter.dashboard.DashboardPresenterImpl;
import com.pgu.books.client.ui.Dashboard;

public class DashboardActivity {

    public static DashboardActivity INSTANCE = new DashboardActivity();

    private DashboardActivity() {
    }

    private final DashboardPresenter   dashboardPresenter   = new DashboardPresenterImpl();
    private Dashboard                  dashboardUI;

    private final BooksImportPresenter booksImportPresenter = new BooksImportPresenterImpl();

    public Dashboard getDashboardUI() {
        if (null == dashboardUI) {
            dashboardUI = new Dashboard();
            dashboardUI.setPresenter(dashboardPresenter);
            dashboardUI.getBooksImportUI().setPresenter(booksImportPresenter);
        }
        return dashboardUI;
    }

}
