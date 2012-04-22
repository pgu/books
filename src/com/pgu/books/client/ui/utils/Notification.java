package com.pgu.books.client.ui.utils;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
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
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;

public class Notification {

    private static final ArrayList<PopupPanel> notifications     = new ArrayList<PopupPanel>();

    private static Resources                   resources         = GWT.create(Resources.class);
    private static final ArrayList<PopupPanel> loadingIndicators = new ArrayList<PopupPanel>();

    public static void loadingStart() {
        final PopupPanel popup = createPopup();
        final int top = Window.getClientHeight() - 50;
        final int left = Window.getClientWidth() / 2 - 50;

        popup.setPopupPosition(left, top);

        popup.add(new Image(resources.loadingIndicator()));

        loadingIndicators.add(popup);
        popup.show();
    }

    public static void loadingStop() {

        if (loadingIndicators.isEmpty()) {
            return;
        }

        final PopupPanel popup = loadingIndicators.remove(0);
        popup.removeFromParent();
    }

    public static void validation(final String message) {
        final PopupPanel popup = createPopup();
        setPopupPosition(popup);

        final HTML label = new HTML(message);

        final HorizontalPanel hp = new HorizontalPanel();
        hp.add(label);
        popup.add(hp);

        final Style styleHP = hp.getElement().getStyle();
        styleHP.setWidth(Window.getClientWidth() - 12, Unit.PX);
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
                final int height = popup.getOffsetHeight();
                final int index = notifications.indexOf(popup);

                notifications.remove(popup);
                popup.removeFromParent();

                updateNotificationPositions(height, index);
            }

        });

        notifications.add(popup);
        popup.show();

        final Timer timer = new Timer() {
            @Override
            public void run() {
                CloseEvent.fire(popup, popup);
            }
        };
        timer.schedule(5000);
    }

    private static void setPopupPosition(final PopupPanel popup) {
        int top = 0;
        for (final PopupPanel notif : notifications) {
            top += notif.getOffsetHeight();
        }
        popup.setPopupPosition(0, top);
    }

    public static void error(final String message) {
        final PopupPanel popup = createPopup();
        setPopupPosition(popup);

        final HTML label = new HTML(message);
        final Button closeBtn = new Button("X");

        final HorizontalPanel hp = new HorizontalPanel();
        hp.add(label);
        hp.add(closeBtn);
        popup.add(hp);

        final Style styleHP = hp.getElement().getStyle();
        styleHP.setWidth(Window.getClientWidth() - 12, Unit.PX);
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
                final int height = popup.getOffsetHeight();
                final int index = notifications.indexOf(popup);

                notifications.remove(popup);
                popup.removeFromParent();

                updateNotificationPositions(height, index);
            }
        });

        closeBtn.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                CloseEvent.fire(popup, popup);
            }
        });

        notifications.add(popup);
        popup.show();
    }

    private static PopupPanel createPopup() {
        final PopupPanel popup = new PopupPanel();
        popup.setAnimationEnabled(true);
        popup.setAutoHideEnabled(false);
        popup.setGlassEnabled(false);
        popup.setModal(false);
        return popup;
    }

    private static void updateNotificationPositions(final int height, final int index) {
        if (index < notifications.size()) {
            for (int i = index; i < notifications.size(); i++) {
                final PopupPanel dialogBox = notifications.get(i);
                final int currentTop = dialogBox.getAbsoluteTop();

                dialogBox.setPopupPosition(0, currentTop - height);
            }
        }
    }

}
