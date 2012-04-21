package com.pgu.books.client.ui.dashboardInfo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Widget;

public class MessageInfo extends Composite {

    private static MessageInfoUiBinder uiBinder = GWT.create(MessageInfoUiBinder.class);

    interface MessageInfoUiBinder extends UiBinder<Widget, MessageInfo> {
    }

    public MessageInfo() {
        initWidget(uiBinder.createAndBindUi(this));

        final DialogBox dialogBox = new DialogBox();
        dialogBox.setAnimationEnabled(true);
    }

    public void valid(final String message) {
    }

    public void error(final String message) {
    }

}
