package com.pgu.books.server.utils;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpStatus;

import com.pgu.books.server.exception.InterruptProcessException;
import com.pgu.books.server.exception.ProcessException;

public final class AppUtils {

    public static final long LIMIT_MS = 1000 * 25;

    private HttpServletResponse resp;
    private Logger logger;

    private long startTime;

    public AppUtils() {
    }

    public AppUtils response(final HttpServletResponse resp) {
        this.resp = resp;
        return this;
    }

    public AppUtils logger(final Logger logger) {
        this.logger = logger;
        return this;
    }

    public AppUtils startInMs(final long startTime) {
        this.startTime = startTime;
        return this;
    }

    public boolean hasReachedTimeOut() {
        return System.currentTimeMillis() - startTime > LIMIT_MS;
    }

    public void throwProcessException(final String msg) throws IOException, ProcessException {

        resp.setStatus(HttpStatus.SC_BAD_REQUEST);
        resp.setContentType("text/plain");
        resp.getWriter().print(msg);

        logger.severe(msg);

        throw new ProcessException(msg);
    }

    public void printInterrupt(final InterruptProcessException ex) throws IOException {

        final String msg = ex.getMessage();

        resp.setContentType("text/plain");
        resp.getWriter().println(msg);

        logger.info(msg);
    }

}
