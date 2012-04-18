package com.pgu.books.client.ui.booksMenu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.Books;
import com.pgu.books.client.app.AsyncCallbackApp;
import com.pgu.books.client.rpc.AdminBooksService;
import com.pgu.books.client.rpc.AdminBooksServiceAsync;
import com.pgu.books.client.rpc.LoginService;
import com.pgu.books.client.rpc.LoginServiceAsync;
import com.pgu.books.shared.LoginInfo;

public class BooksMenu extends Composite {

    private static BooksMenuUiBinder uiBinder = GWT.create(BooksMenuUiBinder.class);

    interface BooksMenuUiBinder extends UiBinder<Widget, BooksMenu> {
    }

    @UiField
    HorizontalPanel                      menu;

    @UiField(provided = true)
    Hyperlink                            booksLink, graphsLink, importLink;

    private final AdminBooksServiceAsync adminBooksService = GWT.create(AdminBooksService.class);
    private final LoginServiceAsync      loginService      = GWT.create(LoginService.class);

    public BooksMenu() {
        booksLink = new Hyperlink("Libros", Books.TAG_BOOKS);
        graphsLink = new Hyperlink("Gráficos", Books.TAG_CHARTS);
        importLink = new Hyperlink("Import", Books.TAG_IMPORT);

        initWidget(uiBinder.createAndBindUi(this));

        menu.setSpacing(5);

        final HTML status = new HTML("Log? ");
        final Anchor signInLink = new Anchor("Sign In");
        final Button btnLogin = new Button("Login");
        final Button btnRpc = new Button("Test RPC");
        final HTML result = new HTML("");
        menu.add(signInLink);
        menu.add(status);
        menu.add(btnLogin);
        menu.add(btnRpc);
        menu.add(result);

        btnLogin.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                loginService.login(GWT.getHostPageBaseURL(), new AsyncCallbackApp<LoginInfo>() {

                    @Override
                    public void onSuccess(final LoginInfo loginInfo) {
                        status.setText("Log? " + loginInfo.isLoggedIn());

                        if (loginInfo.isLoggedIn()) {

                            final String msg = "logout url : " + loginInfo.getLogoutUrl() + "<br/>" + //
                                    "email : " + loginInfo.getEmailAddress();

                            result.setHTML(msg);
                            signInLink.setText("Sign out");
                            signInLink.setHref(loginInfo.getLogoutUrl());

                        } else {
                            result.setHTML("login url   : " + loginInfo.getLoginUrl());
                            signInLink.setText("Sign in");
                            signInLink.setHref(loginInfo.getLoginUrl());
                        }
                    }

                });
            }
        });

        btnRpc.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                adminBooksService.test("toto", new AsyncCallbackApp<String>() {

                    @Override
                    public void onSuccess(final String result) {
                        Window.alert("Success " + result);
                    }
                });
            }
        });
    }
}
