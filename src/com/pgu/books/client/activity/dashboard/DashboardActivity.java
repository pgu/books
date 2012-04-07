package com.pgu.books.client.activity.dashboard;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.client.BooksService;
import com.pgu.books.client.BooksServiceAsync;
import com.pgu.books.client.activity.books.board.BooksboardPresenter;
import com.pgu.books.client.activity.books.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.app.AsyncCallbackApp;
import com.pgu.books.client.ui.Dashboard;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BooksFiltersDTO;

public class DashboardActivity implements //
        DashboardPresenter, //
        BooksImportPresenter, //
        BooksboardPresenter, //
        BooksFiltersPresenter //
{

    public static DashboardActivity INSTANCE = new DashboardActivity();

    private DashboardActivity() {
    }

    private final BooksServiceAsync booksService = GWT.create(BooksService.class);

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
        booksService.importBooks(categoryTitle, new AsyncCallback<Void>() {

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
        booksService.testImport(new AsyncCallbackApp<Void>() {

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

        booksService.countBooks(filtersDTO, new AsyncCallbackApp<Integer>() {

            @Override
            public void onSuccess(final Integer count) {
                GWT.log("success count " + count);
                dashboardUI.getBooksboardUI().setNbBooks(count);
            }

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
                dashboardUI.getBooksboardUI().setNbBooks(0);
            }

        });

        booksService.fetchBooks(filtersDTO, start, length, new AsyncCallbackApp<ArrayList<Book>>() {

            @Override
            public void onSuccess(final ArrayList<Book> books) {
                GWT.log("success list " + books.size());
                dashboardUI.getBooksboardUI().showBooks(books);
            }

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
                dashboardUI.getBooksboardUI().showBooks(new ArrayList<Book>());
            }

        });
    }

    private final BooksFiltersDTO filtersDTO = new BooksFiltersDTO();

    @Override
    public void fetchBooks( //
            final ArrayList<String> selectedAuthors, //
            final ArrayList<String> selectedEditors, //
            final ArrayList<String> selectedCategories) {

        filtersDTO //
                .authors(selectedAuthors) //
                .editors(selectedEditors) //
                .categories(selectedCategories);

        fetchBooks(0, dashboardUI.getBooksboardUI().getLength());
    }

    @Override
    public void deleteBooks() {
        booksService.delete(new AsyncCallbackApp<Void>() {

            @Override
            public void onSuccess(final Void result) {
                Window.alert("Done");
            }

        });
    }

}
