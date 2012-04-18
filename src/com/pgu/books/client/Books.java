package com.pgu.books.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;
import com.pgu.books.client.activity.AppActivity;
import com.pgu.books.client.app.AsyncCallbackApp;
import com.pgu.books.client.rpc.LoginService;
import com.pgu.books.client.rpc.LoginServiceAsync;
import com.pgu.books.client.ui.AppUI;
import com.pgu.books.shared.LoginInfo;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Books implements EntryPoint {

    public static final String      TAG_BOOKS    = "books";
    public static final String      TAG_CHARTS   = "charts";
    public static final String      TAG_IMPORT   = "import";

    private final LoginServiceAsync loginService = GWT.create(LoginService.class);

    @Override
    public void onModuleLoad() {
        //
        // history
        final String initToken = History.getToken();
        if (initToken.isEmpty()) {
            History.newItem(TAG_BOOKS);
        }

        History.addValueChangeHandler(new ValueChangeHandler<String>() {

            @Override
            public void onValueChange(final ValueChangeEvent<String> event) {
                final String tag = event.getValue();

                if (TAG_BOOKS.equals(tag)) {
                    AppActivity.get().showBooks();

                } else if (TAG_CHARTS.equals(tag)) {
                    AppActivity.get().showCharts();

                } else if (TAG_IMPORT.equals(tag)) {
                    AppActivity.get().showImport();

                } else {
                    AppActivity.get().showUnknownTag(tag);
                }
            }
        });

        //
        // UI
        loginService.login(GWT.getHostPageBaseURL(), new AsyncCallbackApp<LoginInfo>() {

            @Override
            public void onSuccess(final LoginInfo loginInfo) {

                final AppUI firstView = AppActivity.get().initView(loginInfo);
                RootPanel.get().add(firstView);
                History.fireCurrentHistoryState();

            }

        });
    }
}
