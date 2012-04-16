package com.pgu.books.client.ui.booksBoard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.booksBoard.BooksBoardPresenter;
import com.pgu.books.client.ui.booksBoard.filters.BooksFilters;
import com.pgu.books.client.ui.booksBoard.filters.BooksFiltersUI;
import com.pgu.books.client.ui.booksBoard.grid.BooksGrid;
import com.pgu.books.client.ui.booksBoard.grid.BooksGridUI;
import com.pgu.books.client.ui.booksBoard.search.BooksSearch;
import com.pgu.books.client.ui.booksBoard.search.BooksSearchUI;

public class BooksBoard extends Composite implements BooksBoardUI {

    private static BooksBoardUiBinder uiBinder = GWT.create(BooksBoardUiBinder.class);

    interface BooksBoardUiBinder extends UiBinder<Widget, BooksBoard> {
    }

    @UiField(provided = true)
    DockPanel                  booksBoard;

    private final BooksGrid    booksGrid;
    private final BooksFilters booksFilters;
    private final BooksSearch  booksSearch;

    public BooksBoard() {

        booksBoard = new DockPanel();
        booksBoard.setSpacing(4);
        booksBoard.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        booksSearch = new BooksSearch();
        booksFilters = new BooksFilters();

        booksBoard.add(booksSearch, DockPanel.NORTH);
        booksBoard.add(booksFilters, DockPanel.WEST);

        booksGrid = new BooksGrid();
        booksGrid.setHeight("600px");
        booksGrid.setWidth("1000px");
        booksBoard.add(booksGrid, DockPanel.CENTER);

        initWidget(uiBinder.createAndBindUi(this));
    }

    private BooksBoardPresenter presenter;

    @Override
    public void setPresenter(final BooksBoardPresenter presenter) {
        this.presenter = presenter;
    }

    public BooksFiltersUI getBooksFilters() {
        return booksFilters;
    }

    public BooksSearchUI getBooksSearch() {
        return booksSearch;
    }

    public BooksGridUI getBooksGrid() {
        return booksGrid;
    }

    @Override
    public void startFocus() {
        setVisible(true);
    }

    @Override
    public void loseFocus() {
        setVisible(false);
    }

}
