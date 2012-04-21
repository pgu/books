package com.pgu.books.client.app;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.client.ui.utils.Notification;

public abstract class AsyncCallbackApp<T> implements AsyncCallback<T> {

    @Override
    public void onFailure(final Throwable caught) {
        Notification.error("Technical problem");
    }

}
