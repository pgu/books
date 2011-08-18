package com.pgu.books.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Books implements EntryPoint {
    private final BookServiceAsync bookService = GWT.create(BookService.class);

    @Override
    public void onModuleLoad() {
        final Button button = new Button();
        button.setText("Generate data");
        RootPanel.get().add(button);
        button.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                bookService.createBooks(new AsyncCallback<Void>() {

                    @Override
                    public void onFailure(final Throwable caught) {
                    }

                    @Override
                    public void onSuccess(final Void result) {
                        Window.alert("done!");
                    }
                });
            }
        });
    }
}
