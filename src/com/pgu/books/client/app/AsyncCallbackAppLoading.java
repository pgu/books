package com.pgu.books.client.app;

import com.pgu.books.client.ui.utils.Notification;

public abstract class AsyncCallbackAppLoading<T> extends AsyncCallbackApp<T> {

    @Override
    public void onFailure(final Throwable caught) {
        super.onFailure(caught);
        Notification.loadingStop();
    }

    @Override
    public void onSuccess(final T result) {
        Notification.loadingStop();
        onSuccessApp(result);
    }

    public abstract void onSuccessApp(final T result);

}
