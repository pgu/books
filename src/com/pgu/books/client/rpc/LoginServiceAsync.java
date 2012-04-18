package com.pgu.books.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.shared.LoginInfo;

public interface LoginServiceAsync {

    void login(String requestUri, AsyncCallback<LoginInfo> callback);

}
