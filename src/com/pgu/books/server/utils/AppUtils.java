package com.pgu.books.server.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpStatus;

public final class AppUtils {

    public static final long LIMIT_MS = 1000 * 25;

    private AppUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean hasReachedTimeOut(final long startTimeInMs) {
        return System.currentTimeMillis() - startTimeInMs > LIMIT_MS;
    }

    public static void setBadRequest(final String msg, final HttpServletResponse resp) throws IOException {
        resp.setStatus(HttpStatus.SC_BAD_REQUEST);
        resp.setContentType("text/plain");
        resp.getWriter().print(msg);
    }

    public static void print(final String msg, final HttpServletResponse resp, final long startTime) throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println(msg + " (" + (System.currentTimeMillis() - startTime) + " ms)");
    }

}