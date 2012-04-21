package com.pgu.books.client.ui.utils;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PopupPanel;

public class Notification {

    public static void validation(final String message) {
        final DecoratedPopupPanel popup = new DecoratedPopupPanel(true);
        popup.setAnimationEnabled(true);
        popup.setWidth("1000px");
        popup.setHeight("100px");
        popup.setPopupPosition(0, 0);

        final Style style = popup.getElement().getStyle();
        style.setBackgroundColor("green");
        style.setColor("white");
        style.setFontSize(2, Unit.EM);

        popup.add(new HTML(message));

        popup.addCloseHandler(new CloseHandler<PopupPanel>() {

            @Override
            public void onClose(final CloseEvent<PopupPanel> event) {
                GWT.log("*******");
                popup.removeFromParent();
            }
        });

        popup.show();
        final Timer timer = new Timer() {
            @Override
            public void run() {
                CloseEvent.fire(popup, popup);
            }
        };

        timer.schedule(5000);
    }

    public static void error(final String message) {
        final DialogBox popup = new DialogBox();
        popup.setAnimationEnabled(true);
        popup.setWidth(Window.getClientWidth() + "px");
        popup.setPopupPosition(0, 0);

        final HTML label = new HTML(message);
        final Button closeBtn = new Button("X");

        final HorizontalPanel hp = new HorizontalPanel();
        hp.add(label);
        hp.add(closeBtn);
        popup.add(hp);

        final Style style = hp.getElement().getStyle();
        style.setWidth(100, Unit.PCT);
        style.setHeight(100, Unit.PCT);
        style.setBackgroundColor("red");
        style.setColor("white");
        style.setFontSize(4, Unit.EM);

        popup.addCloseHandler(new CloseHandler<PopupPanel>() {

            @Override
            public void onClose(final CloseEvent<PopupPanel> event) {
                GWT.log("*********");
                popup.removeFromParent();
            }
        });

        closeBtn.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                CloseEvent.fire(popup, popup);
            }
        });

        popup.show();
    }

}
