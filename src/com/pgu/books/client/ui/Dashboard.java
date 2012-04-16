package com.pgu.books.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.dashboard.DashboardPresenter;
import com.pgu.books.client.ui.books.board.Booksboard;
import com.pgu.books.client.ui.books.filters.BooksFilters;
import com.pgu.books.client.ui.books.search.BooksSearch;
import com.pgu.books.client.ui.booksCharts.BooksCharts;
import com.pgu.books.client.ui.booksImport.BooksImport;
import com.pgu.books.client.ui.booksImport.BooksImportUI;
import com.pgu.books.client.ui.menuAdmin.MenuAdmin;

public class Dashboard extends Composite {

    private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);

    interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
    }

    @UiField
    MenuAdmin            menuAdmin;

    @UiField
    BooksCharts          booksCharts;

    @UiField
    BooksImport          booksImport;

    @UiField(provided = true)
    DockPanel            booksDock;

    private Booksboard   booksboard;
    private BooksFilters booksFilters;
    private BooksSearch  booksSearch;

    public Dashboard() {
        buildBooksboard();

        initWidget(uiBinder.createAndBindUi(this));
    }

    private void buildBooksboard() {
        booksDock = new DockPanel();
        booksDock.setSpacing(4);
        booksDock.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        booksSearch = new BooksSearch();
        booksFilters = new BooksFilters();

        booksDock.add(booksSearch, DockPanel.NORTH);
        booksDock.add(booksFilters, DockPanel.WEST);

        booksboard = new Booksboard();
        booksboard.setHeight("600px");
        booksboard.setWidth("1000px");
        booksDock.add(booksboard, DockPanel.CENTER);
    }

    public void showBooks() {
        show(booksDock);
    }

    public void showCharts() {
        show(booksCharts);
    }

    public void showImport() {
        show(booksImport);
    }

    private void show(final Widget widgetToShow) {
        for (final Widget w : new Widget[] { booksDock, booksCharts, booksImport }) {
            if (w == null) {
                continue;
            }
            w.setVisible(w.equals(widgetToShow));
        }
    }

    private DashboardPresenter dashboardPresenter;

    public void setPresenter(final DashboardPresenter dashboardPresenter) {
        this.dashboardPresenter = dashboardPresenter;
    }

    public BooksImportUI getBooksImportUI() {
        return booksImport;
    }

    public Booksboard getBooksboardUI() {
        return booksboard;
    }

    public BooksFilters getBooksFiltersUI() {
        return booksFilters;
    }

    public BooksSearch getBooksSearchUI() {
        return booksSearch;
    }

    public BooksCharts getBooksChartsUI() {
        return booksCharts;
    }

}
