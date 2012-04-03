package com.pgu.books.client.ui.book;

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
        // https://developers.google.com/web-toolkit/doc/latest/DevGuideUiCellTable
        initWidget(uiBinder.createAndBindUi(this));
    }

}
