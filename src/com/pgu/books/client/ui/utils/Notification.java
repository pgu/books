package com.pgu.books.client.ui.utils;

import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.Style.FontWeight;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PopupPanel;

public class Notification {

    public static void validation(final String message) {
        final DialogBox popup = createPopup();

        final HTML label = new HTML(message);

        final HorizontalPanel hp = new HorizontalPanel();
        hp.add(label);
        popup.add(hp);

        final Style styleHP = hp.getElement().getStyle();
        styleHP.setWidth(Window.getClientWidth() - 50, Unit.PX);
        styleHP.setHeight(100, Unit.PCT);
        styleHP.setBackgroundColor("green");

        final Style styleLB = label.getElement().getStyle();
        styleLB.setColor("white");
        styleLB.setPadding(20, Unit.PX);
        styleLB.setFontSize(1.5, Unit.EM);
        styleLB.setFontWeight(FontWeight.BOLD);

        popup.addCloseHandler(new CloseHandler<PopupPanel>() {

            @Override
            public void onClose(final CloseEvent<PopupPanel> event) {
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
        final DialogBox popup = createPopup();

        final HTML label = new HTML(message);
        final Button closeBtn = new Button("X");

        final HorizontalPanel hp = new HorizontalPanel();
        hp.add(label);
        hp.add(closeBtn);
        popup.add(hp);

        final Style styleHP = hp.getElement().getStyle();
        styleHP.setWidth(Window.getClientWidth() - 50, Unit.PX);
        styleHP.setHeight(100, Unit.PCT);
        styleHP.setBackgroundColor("red");

        final Style styleLB = label.getElement().getStyle();
        styleLB.setColor("white");
        styleLB.setPadding(20, Unit.PX);
        styleLB.setFontSize(1.5, Unit.EM);
        styleLB.setFontWeight(FontWeight.BOLD);

        final Style styleBT = closeBtn.getElement().getStyle();
        styleBT.setFloat(Style.Float.RIGHT);

        popup.addCloseHandler(new CloseHandler<PopupPanel>() {

            @Override
            public void onClose(final CloseEvent<PopupPanel> event) {
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

    private static DialogBox createPopup() {
        final DialogBox popup = new DialogBox();
        popup.setAnimationEnabled(true);
        popup.setPopupPosition(0, 0);
        popup.setAutoHideEnabled(false);
        popup.setGlassEnabled(false);
        popup.setModal(false);
        return popup;
    }

}
