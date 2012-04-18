package com.pgu.books.client.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.pgu.books.shared.LoginInfo;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService {

    public LoginInfo login(String requestUri);

}
