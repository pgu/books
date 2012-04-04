package com.pgu.books.client.ui.book;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.shared.Book;

public class BookBoard extends Composite {

    private static List<Book>        BOOKS    = Arrays.asList(new Book("author", "title", "editor", "year", "comment",
                                                      "category"));

    private static BookBoardUiBinder uiBinder = GWT.create(BookBoardUiBinder.class);

    interface BookBoardUiBinder extends UiBinder<Widget, BookBoard> {
    }

    @UiField(provided = true)
    CellTable<Book> grid;

    public BookBoard() {

        grid = new CellTable<Book>();
        grid.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);

        final TextColumn<Book> titleColumn = new TextColumn<Book>() {

            @Override
            public String getValue(final Book book) {
                return book.getTitle();
            }
        };

        grid.addColumn(titleColumn, "Titulo");

        grid.setRowCount(BOOKS.size(), true);

        // Push the data into the widget.
        grid.setRowData(0, BOOKS);

        // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellWidgets
        // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellTable
        initWidget(uiBinder.createAndBindUi(this));
    }

}
