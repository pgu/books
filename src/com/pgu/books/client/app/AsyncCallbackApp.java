package com.pgu.books.client.app;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.client.ui.dashboardInfo.MessageInfo;

public abstract class AsyncCallbackApp<T> implements AsyncCallback<T> {

    private final MessageInfo messageInfo;

    public AsyncCallbackApp(final MessageInfo messageInfo) {
        this.messageInfo = messageInfo;
    }

    @Override
    public void onFailure(final Throwable caught) {
        messageInfo.error("Technical problem");
    }

}
