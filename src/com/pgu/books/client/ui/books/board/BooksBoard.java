package com.pgu.books.client.ui.books.board;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.pgu.books.client.activity.books.board.BooksBoardPresenter;
import com.pgu.books.shared.Book;

public class BooksBoard extends Composite {

    //    private static List<Book>         BOOKS    = new ArrayList<Book>();
    //    static {
    //        for (int i = 0; i < 100; i++) {
    //            BOOKS.add(new Book("author" + i, "title" + i, "editor" + i, "year" + i, "comment" + i, "category" + i)); //
    //        }
    //    }

    private static BooksBoardUiBinder uiBinder = GWT.create(BooksBoardUiBinder.class);

    interface BooksBoardUiBinder extends UiBinder<Widget, BooksBoard> {
    }

    @UiField(provided = true)
    CellTable<Book>             grid;

    @UiField(provided = true)
    SimplePager                 pager;

    private BooksBoardPresenter presenter;

    public void setPresenter(final BooksBoardPresenter presenter) {
        this.presenter = presenter;
    }

    // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellWidgets
    // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellTable
    // http://gwt.google.com/samples/Showcase/Showcase.html#!CwCellTable
    // http://www.mytechtip.com/2010/11/gwt-celltable-example-using_8168.html
    public BooksBoard() {

        buildCellTableWithPager();

        initWidget(uiBinder.createAndBindUi(this));
    }

    private void buildCellTableWithPager() {
        grid = new CellTable<Book>();
        grid.setWidth("100%", true);
        grid.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);

        final SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
        pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
        pager.setDisplay(grid);

        final TextColumn<Book> authorColumn = new TextColumn<Book>() {

            @Override
            public String getValue(final Book book) {
                return book.getAuthor();
            }
        };
        final TextColumn<Book> titleColumn = new TextColumn<Book>() {

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

    public void initFetch() {
        isGettingNbBooks = true;
        isGettingBooks = true;
    }

    public void showBooks(final ArrayList<Book> books) {
        this.books = books;
        isGettingNbBooks = false;

        updateGrid();
    }

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

        grid.setRowCount(nbBooks);
        grid.setRowData(currentStart, books);
    }

    public void initFetchBooks() {
        final AsyncDataProvider<Book> provider = new AsyncDataProvider<Book>() {
            @Override
            protected void onRangeChanged(final HasData<Book> display) {

                currentStart = display.getVisibleRange().getStart();
                final int length = display.getVisibleRange().getLength();

                presenter.fetchBooks(currentStart, length);
            }
        };
        provider.addDataDisplay(grid);
        provider.updateRowCount(nbBooks, true);
    }

}
