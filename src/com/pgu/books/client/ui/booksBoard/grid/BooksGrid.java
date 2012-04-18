package com.pgu.books.client.ui.booksBoard.grid;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.ColumnSortEvent.AsyncHandler;
import com.google.gwt.user.cellview.client.ColumnSortList;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.pgu.books.client.activity.booksBoard.grid.BooksGridPresenter;
import com.pgu.books.shared.Book;

// TODO PGU EDITION of a book: edition in the grid and a new form to create a new book
// TODO PGU server sorting on columns
// TODO PGU edition only for logged admin
public class BooksGrid extends Composite implements BooksGridUI {

    private static BooksGridUiBinder uiBinder = GWT.create(BooksGridUiBinder.class);

    interface BooksGridUiBinder extends UiBinder<Widget, BooksGrid> {
    }

    @UiField(provided = true)
    DataGrid<Book>             grid;

    @UiField(provided = true)
    SimplePager                pager;

    private BooksGridPresenter presenter;
    private TextColumn<Book>   titleColumn;

    private enum SortField {
        AUTHOR, TITLE, EDITOR, YEAR, CATEGORY
    }

    private final HashMap<TextColumn<Book>, SortField> col2field = new HashMap<TextColumn<Book>, SortField>();

    @Override
    public void setPresenter(final BooksGridPresenter presenter) {
        this.presenter = presenter;
    }

    // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellWidgets
    // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellTable
    // http://gwt.google.com/samples/Showcase/Showcase.html#!CwCellTable
    // http://www.mytechtip.com/2010/11/gwt-celltable-example-using_8168.html
    public BooksGrid() {

        buildCellTableWithPager();

        initWidget(uiBinder.createAndBindUi(this));
    }

    private void buildCellTableWithPager() {
        grid = new DataGrid<Book>();
        grid.setWidth("100%");
        grid.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);
        grid.setEmptyTableWidget(new Label("Ningún libro"));

        final SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
        pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
        pager.setDisplay(grid);

        final TextColumn<Book> authorColumn = new TextColumn<Book>() {

            @Override
            public String getValue(final Book book) {
                return book.getAuthor();
            }
        };
        titleColumn = new TextColumn<Book>() {

            @Override
            public String getValue(final Book book) {
                return book.getTitle();
            }
        };
        final TextColumn<Book> editorColumn = new TextColumn<Book>() {

            @Override
            public String getValue(final Book book) {
                return book.getEditor();
            }
        };
        final TextColumn<Book> yearColumn = new TextColumn<Book>() {

            @Override
            public String getValue(final Book book) {
                return book.getYear();
            }
        };
        final TextColumn<Book> commentColumn = new TextColumn<Book>() {

            @Override
            public String getValue(final Book book) {
                return book.getComment();
            }
        };
        final TextColumn<Book> categoryColumn = new TextColumn<Book>() {

            @Override
            public String getValue(final Book book) {
                return book.getCategory();
            }
        };

        authorColumn.setSortable(true);
        titleColumn.setSortable(true);
        editorColumn.setSortable(true);
        yearColumn.setSortable(true);
        categoryColumn.setSortable(true);

        col2field.put(authorColumn, SortField.AUTHOR);
        col2field.put(titleColumn, SortField.TITLE);
        col2field.put(editorColumn, SortField.EDITOR);
        col2field.put(yearColumn, SortField.YEAR);
        col2field.put(categoryColumn, SortField.CATEGORY);

        grid.addColumn(titleColumn, "Título");
        grid.addColumn(authorColumn, "Autor");
        grid.addColumn(editorColumn, "Editor");
        grid.addColumn(yearColumn, "Año");
        grid.addColumn(commentColumn, "Comentario");
        grid.addColumn(categoryColumn, "Categoría");
    }

    private boolean         isGettingNbBooks = false;
    private boolean         isGettingBooks   = false;
    private Integer         nbBooks          = 0;
    private ArrayList<Book> books;
    private int             currentStart     = 0;

    @Override
    public void initFetch() {
        isGettingNbBooks = true;
        isGettingBooks = true;
    }

    @Override
    public void showBooks(final ArrayList<Book> books) {
        this.books = books;
        isGettingNbBooks = false;

        updateGrid();
    }

    @Override
    public void setNbBooks(final Integer count) {
        nbBooks = count;
        isGettingBooks = false;

        updateGrid();
    }

    private void updateGrid() {
        if (isGettingBooks) {
            return;
        }
        if (isGettingNbBooks) {
            return;
        }

        final boolean isExact = currentStart + books.size() == nbBooks;

        grid.setRowCount(nbBooks, isExact);
        provider.updateRowData(currentStart, books);
    }

    private AsyncDataProvider<Book> provider;
    private int                     length;

    @Override
    public void initFetchBooks() {
        provider = new AsyncDataProvider<Book>() {
            @Override
            protected void onRangeChanged(final HasData<Book> display) {

                GWT.log("gridStart: " + grid.getPageStart() + ", currentStart: " + display.getVisibleRange().getStart());

                currentStart = display.getVisibleRange().getStart();
                length = display.getVisibleRange().getLength();

                final ColumnSortList sortList = grid.getColumnSortList();

                ColumnSortList.ColumnSortInfo currentInfo = null;
                for (int i = 0; i < sortList.size(); i++) {
                    final ColumnSortList.ColumnSortInfo info = sortList.get(i);
                    GWT.log(" column: " + col2field.get(info.getColumn()));
                    GWT.log("    asc: " + info.isAscending());

                    if (i == 0) {
                        currentInfo = info;
                    }
                }

                if (currentInfo != null) {
                    sortList.clear();
                    sortList.push(currentInfo); // keeps only one sort
                }

                // TODO PGU add the sorting column
                presenter.fetchBooks(currentStart, length);
            }
        };

        provider.addDataDisplay(grid);

        final AsyncHandler columnSortHandler = new AsyncHandler(grid);
        grid.addColumnSortHandler(columnSortHandler);
        grid.getColumnSortList().push(titleColumn); // by default, we know it is sorted by titles
    }

    @Override
    public int getLength() {
        return length;
    }

}
