package com.pgu.books.client.ui.booksBoard.grid;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.cell.client.EditTextCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.AsyncHandler;
import com.google.gwt.user.cellview.client.ColumnSortList;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ProvidesKey;
import com.pgu.books.client.activity.booksBoard.grid.BooksGridPresenter;
import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.dto.LoginInfo;
import com.pgu.books.shared.utils.SortField;

// TODO PGU EDITION of a book: edition in the grid and a new form to create a new book
// TODO PGU edition only for logged admin
public class BooksGrid extends Composite implements BooksGridUI {

    private static BooksGridUiBinder uiBinder = GWT.create(BooksGridUiBinder.class);

    interface BooksGridUiBinder extends UiBinder<Widget, BooksGrid> {
    }

    @UiField(provided = true)
    DataGrid<Book>                                         grid;

    @UiField(provided = true)
    SimplePager                                            pager;

    private BooksGridPresenter                             presenter;
    private Column<Book, String>                           titleColumn;

    private final HashMap<Column<Book, String>, SortField> col2field    = new HashMap<Column<Book, String>, SortField>();

    private static final ProvidesKey<Book>                 KEY_PROVIDER = new ProvidesKey<Book>() {
                                                                            @Override
                                                                            public Object getKey(final Book item) {
                                                                                return item.getId();
                                                                            }
                                                                        };

    @Override
    public void setPresenter(final BooksGridPresenter presenter) {
        this.presenter = presenter;
    }

    // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellWidgets
    // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellTable
    // http://gwt.google.com/samples/Showcase/Showcase.html#!CwCellTable
    // http://www.mytechtip.com/2010/11/gwt-celltable-example-using_8168.html
    public BooksGrid(final LoginInfo loginInfo) {

        buildCellTableWithPager(loginInfo);

        initWidget(uiBinder.createAndBindUi(this));
    }

    private void buildCellTableWithPager(final LoginInfo loginInfo) {
        grid = new DataGrid<Book>(KEY_PROVIDER);
        grid.setWidth("100%");
        grid.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);
        grid.setEmptyTableWidget(new Label("Ningún libro"));

        final SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
        pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
        pager.setDisplay(grid);

        Column<Book, String> authorColumn;
        Column<Book, String> editorColumn;
        Column<Book, String> yearColumn;
        Column<Book, String> commentColumn;
        Column<Book, String> categoryColumn;

        if (loginInfo.isLoggedIn()) {

            final EditTextCell authorCell = new EditTextCell();
            final EditTextCell titleCell = new EditTextCell();
            final EditTextCell editorCell = new EditTextCell();
            final EditTextCell yearCell = new EditTextCell();
            final EditTextCell commentCell = new EditTextCell();
            final EditTextCell categoryCell = new EditTextCell();

            authorColumn = new Column<Book, String>(authorCell) {

                @Override
                public String getValue(final Book book) {
                    return book.getAuthor();
                }
            };
            titleColumn = new Column<Book, String>(titleCell) {

                @Override
                public String getValue(final Book book) {
                    return book.getTitle();
                }
            };
            editorColumn = new Column<Book, String>(editorCell) {

                @Override
                public String getValue(final Book book) {
                    return book.getEditor();
                }
            };
            yearColumn = new Column<Book, String>(yearCell) {
                @Override
                public String getValue(final Book book) {
                    return book.getYear();
                }
            };
            commentColumn = new Column<Book, String>(commentCell) {

                @Override
                public String getValue(final Book book) {
                    return book.getComment();
                }
            };
            categoryColumn = new Column<Book, String>(categoryCell) {

                @Override
                public String getValue(final Book book) {
                    return book.getCategory();
                }
            };

            authorColumn.setFieldUpdater(new FieldUpdater<Book, String>() {

                @Override
                public void update(final int index, final Book book, final String author) {
                    if (author.length() < 3) {
                        Window.alert("Por lo menos 3 caracteres");
                        authorCell.clearViewData(KEY_PROVIDER.getKey(book));
                        grid.redraw();
                        return;
                    }

                    Window.alert("Has cambiado " + book.getAuthor() + " por " + author);
                    book.setAuthor(author);
                    grid.redraw();
                    // TODO PGU send async update
                }
            });

        } else {
            authorColumn = new TextColumn<Book>() {

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
            editorColumn = new TextColumn<Book>() {

                @Override
                public String getValue(final Book book) {
                    return book.getEditor();
                }
            };
            yearColumn = new TextColumn<Book>() {
                @Override
                public String getValue(final Book book) {
                    return book.getYear();
                }
            };
            commentColumn = new TextColumn<Book>() {

                @Override
                public String getValue(final Book book) {
                    return book.getComment();
                }
            };
            categoryColumn = new TextColumn<Book>() {

                @Override
                public String getValue(final Book book) {
                    return book.getCategory();
                }
            };
        }

        authorColumn.setSortable(true);
        titleColumn.setSortable(true);
        editorColumn.setSortable(true);
        yearColumn.setSortable(true);
        commentColumn.setSortable(false);
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
    public void initFetchFlags() {
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

                final ColumnSortList.ColumnSortInfo sortInfo = getSortInfo();

                final SortField sortField = col2field.get(sortInfo.getColumn());
                final boolean isAscending = sortInfo.isAscending();

                presenter.fetchBooks(currentStart, length, sortField, isAscending);
            }

        };

        provider.addDataDisplay(grid);
        grid.addColumnSortHandler(new AsyncHandler(grid));
    }

    private ColumnSortList.ColumnSortInfo getSortInfo() {
        final ColumnSortList sortList = grid.getColumnSortList();

        if (sortList.size() > 0) {
            final ColumnSortList.ColumnSortInfo sortInfo = sortList.get(0);

            sortList.clear();
            sortList.push(sortInfo); // keeps only one sort
        } else {

            sortList.push(titleColumn); // by default, sort by titles
        }
        return sortList.get(0);
    }

    @Override
    public int getLength() {
        return length;
    }

}
