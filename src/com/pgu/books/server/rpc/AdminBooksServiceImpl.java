package com.pgu.books.server.rpc;

import java.util.logging.Logger;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pgu.books.client.rpc.AdminBooksService;

@SuppressWarnings("serial")
public class AdminBooksServiceImpl extends RemoteServiceServlet implements AdminBooksService {

    private static final Logger LOG = Logger.getLogger(AdminBooksServiceImpl.class.getSimpleName());

    @Override
    public String test(final String string) {
        return string + " :-)";
    }

}
