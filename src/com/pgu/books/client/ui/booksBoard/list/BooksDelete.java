package com.pgu.books.client.ui.booksBoard.list;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.booksBoard.list.BooksDeletePresenter;

public class BooksDelete extends Composite implements BooksDeleteUI {

    private static BooksDeleteUiBinder uiBinder = GWT.create(BooksDeleteUiBinder.class);

    interface BooksDeleteUiBinder extends UiBinder<Widget, BooksDelete> {
    }

    @UiField
    VerticalPanel           booksDelete;

    @UiField
    Button                  btnDelete;

    private final BooksGrid booksGrid;

    public BooksDelete(final BooksGrid booksGrid) {
        initWidget(uiBinder.createAndBindUi(this));
        booksDelete.setSpacing(4);

        this.booksGrid = booksGrid;
    }

    private BooksDeletePresenter presenter;

    @Override
    public void setPresenter(final BooksDeletePresenter presenter) {
        this.presenter = presenter;
    }

    @UiHandler("btnDelete")
    public void clickDelete(final ClickEvent e) {
        presenter.deleteBooks(booksGrid.getSelectedBooks());
    }

}
