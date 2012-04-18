package com.pgu.books.client.ui;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.AppPresenter;
import com.pgu.books.client.ui.booksBoard.BooksBoard;
import com.pgu.books.client.ui.booksBoard.BooksBoardUI;
import com.pgu.books.client.ui.booksBoard.filters.BooksFiltersUI;
import com.pgu.books.client.ui.booksBoard.grid.BooksGridUI;
import com.pgu.books.client.ui.booksBoard.search.BooksSearchUI;
import com.pgu.books.client.ui.booksCharts.BooksCharts;
import com.pgu.books.client.ui.booksImport.BooksImport;
import com.pgu.books.client.ui.booksImport.BooksImportUI;
import com.pgu.books.client.ui.booksMenu.BooksMenu;
import com.pgu.books.client.ui.utils.IsFocusable;

public class Dashboard extends Composite implements AppUI {

    private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);

    interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
    }

    @UiField
    BooksMenu            booksMenu;

    @UiField
    BooksBoard           booksBoard;

    @UiField
    BooksCharts          booksCharts;

    @UiField
    BooksImport          booksImport;

    private AppPresenter dashboardPresenter;

    public Dashboard() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(final AppPresenter dashboardPresenter) {
        this.dashboardPresenter = dashboardPresenter;
    }

    @Override
    public BooksImportUI getBooksImportUI() {
        return booksImport;
    }

    @Override
    public BooksCharts getBooksChartsUI() {
        return booksCharts;
    }

    @Override
    public BooksBoardUI getBooksBoardUI() {
        return booksBoard;
    }

    @Override
    public BooksFiltersUI getBooksFiltersUI() {
        return booksBoard.getBooksFilters();
    }

    @Override
    public BooksSearchUI getBooksSearchUI() {
        return booksBoard.getBooksSearch();
    }

    @Override
    public BooksGridUI getBooksGridUI() {
        return booksBoard.getBooksGrid();
    }

    @Override
    public void showBooks() {
        show(booksBoard);
    }

    @Override
    public void showCharts() {
        show(booksCharts);
    }

    @Override
    public void showImport() {
        show(booksImport);
    }

    @Override
    public void showUnknownTag(final String tag) {
        final String msg = "Unknown tag [" + tag + "]";
        GWT.log(msg);
        Window.alert(msg);
    }

    @SuppressWarnings("unchecked")
    private List<? extends IsFocusable> getFocusables() {
        return Arrays.asList( //
                getBooksBoardUI(), //
                getBooksChartsUI(), //
                getBooksImportUI());
    }

    private void show(final Widget widgetToShow) {
        for (final IsFocusable w : getFocusables()) {
            if (w == null) {
                continue;
            }

            final boolean isWidgetToFocus = w.equals(widgetToShow);
            if (isWidgetToFocus) {
                w.startFocus();
            } else {
                w.loseFocus();
            }
        }
    }

}
