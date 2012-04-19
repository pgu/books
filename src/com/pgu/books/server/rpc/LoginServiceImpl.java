package com.pgu.books.server.rpc;

import java.util.logging.Logger;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pgu.books.client.rpc.LoginService;
import com.pgu.books.shared.dto.LoginInfo;

@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

    private static final Logger LOG = Logger.getLogger(LoginServiceImpl.class.getSimpleName());

    @Override
    public LoginInfo login(final String requestUri) {
        final UserService userService = UserServiceFactory.getUserService();
        final LoginInfo loginInfo = new LoginInfo();

        final User user = userService.getCurrentUser();
        if (user != null && userService.isUserAdmin()) {

            loginInfo.setLoggedIn(true);
            loginInfo.setEmailAddress(user.getEmail());
            loginInfo.setNickname(user.getNickname());
            loginInfo.setLogoutUrl(userService.createLogoutURL(requestUri));

        } else {
            loginInfo.setLoggedIn(false);
            loginInfo.setLoginUrl(userService.createLoginURL(requestUri));
        }
        return loginInfo;
    }

}
