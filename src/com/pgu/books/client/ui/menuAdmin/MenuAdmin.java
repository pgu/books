package com.pgu.books.client.ui.menuAdmin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.Books;

public class MenuAdmin extends Composite {

    private static MenuAdminUiBinder uiBinder = GWT.create(MenuAdminUiBinder.class);

    interface MenuAdminUiBinder extends UiBinder<Widget, MenuAdmin> {
    }

    @UiField
    HorizontalPanel menu;

    @UiField(provided = true)
    Hyperlink booksLink, graphsLink, importLink;

    public MenuAdmin() {
        booksLink = new Hyperlink("Libros", Books.TAG_BOOKS);
        graphsLink = new Hyperlink("Gráficos", Books.TAG_GRAPHS);
        importLink = new Hyperlink("Import", Books.TAG_IMPORT);

        initWidget(uiBinder.createAndBindUi(this));

        menu.setSpacing(5);
    }

}
