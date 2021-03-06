package com.pgu.books.client.ui;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.AppPresenter;
import com.pgu.books.client.ui.booksBoard.BooksBoard;
import com.pgu.books.client.ui.booksBoard.BooksBoardUI;
import com.pgu.books.client.ui.booksBoard.edition.BookFormUI;
import com.pgu.books.client.ui.booksBoard.filters.BooksFiltersUI;
import com.pgu.books.client.ui.booksBoard.list.BooksDeleteUI;
import com.pgu.books.client.ui.booksBoard.list.BooksGridUI;
import com.pgu.books.client.ui.booksBoard.search.BooksSearchUI;
import com.pgu.books.client.ui.booksCharts.BooksCharts;
import com.pgu.books.client.ui.booksImport.BooksImport;
import com.pgu.books.client.ui.booksImport.BooksImportUI;
import com.pgu.books.client.ui.booksMenu.BooksMenu;
import com.pgu.books.client.ui.booksMenu.BooksMenuUI;
import com.pgu.books.client.ui.utils.IsFocusable;
import com.pgu.books.shared.dto.LoginInfo;

public class Dashboard extends Composite implements AppUI {

    private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);

    interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
    }

    @UiField
    HTMLPanel            dashboard;

    @UiField(provided = true)
    BooksMenu            booksMenu;

    @UiField(provided = true)
    BooksBoard           booksBoard;

    @UiField(provided = true)
    BooksCharts          booksCharts;

    private BooksImport  booksImport;

    private AppPresenter presenter;

    public Dashboard(final LoginInfo loginInfo) {
        booksMenu = new BooksMenu(loginInfo);
        booksBoard = new BooksBoard(loginInfo);
        booksCharts = new BooksCharts(loginInfo);

        initWidget(uiBinder.createAndBindUi(this));

        if (loginInfo.isLoggedIn()) {
            booksImport = new BooksImport(loginInfo);
            dashboard.add(booksImport);
        }
    }

    @Override
    public void setPresenter(final AppPresenter presenter) {
        this.presenter = presenter;
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
        if (booksImport != null) {
            show(booksImport);
        }
    }

    @Override
    public void showUnknownTag(final String tag) {
        presenter.showUnknownTag("Unknown tag [" + tag + "]");
    }

    @SuppressWarnings("unchecked")
    private List<? extends IsFocusable> getFocusables() {
        if (booksImport == null) {
            return Arrays.asList( //
                    getBooksBoardUI(), //
                    getBooksChartsUI());
        } else {
            return Arrays.asList( //
                    getBooksBoardUI(), //
                    getBooksChartsUI(), //
                    getBooksImportUI());
        }
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

    @Override
    public BooksMenuUI getBooksMenuUI() {
        return booksMenu;
    }

    @Override
    public BookFormUI getBookFormUI() {
        return booksBoard.getBookForm();
    }

    @Override
    public BooksDeleteUI getBooksDeleteUI() {
        return booksBoard.getBooksDelete();
    }

}
