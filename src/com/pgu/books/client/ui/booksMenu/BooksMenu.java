package com.pgu.books.client.ui.booksMenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.Books;
import com.pgu.books.client.activity.booksMenu.BooksMenuPresenter;

public class BooksMenu extends Composite implements BooksMenuUI {

    private static BooksMenuUiBinder uiBinder = GWT.create(BooksMenuUiBinder.class);

    interface BooksMenuUiBinder extends UiBinder<Widget, BooksMenu> {
    }

    @UiField
    HorizontalPanel menu;
    @UiField
    Anchor          signin;

    @UiField(provided = true)
    Hyperlink       booksLink, graphsLink, importLink;

    public BooksMenu() {
        booksLink = new Hyperlink("Libros", Books.TAG_BOOKS);
        graphsLink = new Hyperlink("Gráficos", Books.TAG_CHARTS);
        importLink = new Hyperlink("Import", Books.TAG_IMPORT);

        initWidget(uiBinder.createAndBindUi(this));

        menu.setSpacing(5);
    }

    private BooksMenuPresenter presenter;

    @Override
    public void setPresenter(final BooksMenuPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void hideAdminFeatures(final String loginUrl) {
        importLink.setVisible(false);
        signin.setText("Sign in");
        signin.setHref(loginUrl);
    }

    @Override
    public void showAdminFeatures(final String logoutUrl) {
        importLink.setVisible(true);
        signin.setText("Sign out");
        signin.setHref(logoutUrl);
    }

}
