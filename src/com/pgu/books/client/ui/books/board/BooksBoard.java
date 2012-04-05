package com.pgu.books.client.ui.books.board;

import java.util.ArrayList;
import java.util.List;

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
import com.pgu.books.shared.Book;

public class BooksBoard extends Composite {

    private static List<Book>         BOOKS    = new ArrayList<Book>();
    static {
        for (int i = 0; i < 100; i++) {
            BOOKS.add(new Book("author" + i, "title" + i, "editor" + i, "year" + i, "comment" + i, "category" + i)); //
        }
    }

    private static BooksBoardUiBinder uiBinder = GWT.create(BooksBoardUiBinder.class);

    interface BooksBoardUiBinder extends UiBinder<Widget, BooksBoard> {
    }

    @UiField(provided = true)
    CellTable<Book> grid;

    @UiField(provided = true)
    SimplePager     pager;

    public BooksBoard() {

        //
        // books grid
        buildCellTableWithPager();

        grid.setRowCount(BOOKS.size(), true);
        grid.setRowData(0, BOOKS);

        final AsyncDataProvider<Book> provider = new AsyncDataProvider<Book>() {
            @Override
            protected void onRangeChanged(final HasData<Book> display) {
                final int start = display.getVisibleRange().getStart();
                int end = start + display.getVisibleRange().getLength();
                end = end >= BOOKS.size() ? BOOKS.size() : end;
                final List<Book> sub = BOOKS.subList(start, end);
                updateRowData(start, sub);
            }
        };
        provider.addDataDisplay(grid);
        provider.updateRowCount(BOOKS.size(), true);

        // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellWidgets
        // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellTable
        // http://gwt.google.com/samples/Showcase/Showcase.html#!CwCellTable
        // http://www.mytechtip.com/2010/11/gwt-celltable-example-using_8168.html
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

}
