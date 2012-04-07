package com.pgu.books.client.activity.dashboard;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.client.BookService;
import com.pgu.books.client.BookServiceAsync;
import com.pgu.books.client.activity.books.board.BooksboardPresenter;
import com.pgu.books.client.activity.books.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.app.AsyncCallbackApp;
import com.pgu.books.client.ui.Dashboard;
import com.pgu.books.shared.Book;

public class DashboardActivity implements //
        DashboardPresenter, //
        BooksImportPresenter, //
        BooksboardPresenter, //
        BooksFiltersPresenter //
{

    public static DashboardActivity INSTANCE = new DashboardActivity();

    private DashboardActivity() {
    }

    private final BookServiceAsync bookService = GWT.create(BookService.class);

    private Dashboard dashboardUI;

    public Dashboard start() {
        if (null == dashboardUI) {
            dashboardUI = new Dashboard();
            dashboardUI.setPresenter(this);
            dashboardUI.getBooksImportUI().setPresenter(this);
            dashboardUI.getBooksboardUI().setPresenter(this);
            dashboardUI.getBooksFiltersUI().setPresenter(this);

            dashboardUI.getBooksboardUI().initFetchBooks();
        }
        return dashboardUI;
    }

    @Override
    public void importBooks(final String categoryTitle) {
        bookService.importBooks(categoryTitle, new AsyncCallback<Void>() {

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

    @Override
    public void testImport() {
        bookService.testImport(new AsyncCallbackApp<Void>() {

            @Override
            public void onSuccess(final Void result) {
                Window.alert("success");
            }

        });
    }

    @Override
    public void fetchBooks(final int start, final int length) {
        GWT.log("start -> " + start + ", " + "length -> " + length);

        dashboardUI.getBooksboardUI().initFetch();
        bookService.countBooks(new AsyncCallbackApp<Integer>() {

            @Override
            public void onSuccess(final Integer count) {
                dashboardUI.getBooksboardUI().setNbBooks(count);
            }

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
                dashboardUI.getBooksboardUI().setNbBooks(0);
            }

        });

        bookService.fetchBooks(start, length, new AsyncCallbackApp<ArrayList<Book>>() {

            @Override
            public void onSuccess(final ArrayList<Book> books) {
                dashboardUI.getBooksboardUI().showBooks(books);
            }

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
                dashboardUI.getBooksboardUI().showBooks(new ArrayList<Book>());
            }

        });
    }

    @Override
    public void fetchBooks( //
            final ArrayList<String> selectedAuthors, //
            final ArrayList<String> selectedEditors, //
            final ArrayList<String> selectedCategories) {
        // TODO PGU
    }

}
