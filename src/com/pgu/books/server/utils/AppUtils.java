package com.pgu.books.server.utils;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpStatus;

import com.pgu.books.server.exception.ProcessException;

public final class AppUtils {

    public static final long LIMIT_MS = 1000 * 25;

    private AppUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean hasReachedTimeOut(final long startTimeInMs) {
        return System.currentTimeMillis() - startTimeInMs > LIMIT_MS;
    }

    public static void setBadRequest(final String msg, final HttpServletResponse resp, final Logger logger)
            throws IOException, ProcessException {

        resp.setStatus(HttpStatus.SC_BAD_REQUEST);
        resp.setContentType("text/plain");
        resp.getWriter().print(msg);

        logger.severe(msg);

        throw new ProcessException(msg);
    }

    public static void print(final String msg, final HttpServletResponse resp, final long startTime, final Logger logger)
            throws IOException {

        final String responseText = msg + " (" + (System.currentTimeMillis() - startTime) + " ms)";

        resp.setContentType("text/plain");
        resp.getWriter().println(responseText);

        logger.info(responseText);
    }

}
