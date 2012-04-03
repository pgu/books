package com.pgu.books.client.ui.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.Books;

public class Menu extends Composite {

    private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);

    interface MenuUiBinder extends UiBinder<Widget, Menu> {
    }

    @UiField(provided = true)
    Hyperlink booksLink;

    public Menu() {
        booksLink = new Hyperlink("Libros", Books.TAG_BOOKS);
        initWidget(uiBinder.createAndBindUi(this));
    }

}
