package com.pgu.books.server.utils;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
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

    public void throwInterruptProcessException(final String msg) throws IOException, InterruptProcessException {

        resp.setContentType("text/plain");
        resp.getWriter().println(msg);

        logger.warning(msg);

        throw new InterruptProcessException(msg, startTime);
    }

    public void info(final String msg) throws IOException {

        resp.setContentType("text/plain");
        resp.getWriter().println(msg);

        logger.info(msg);
    }

    public String getParameter(final ParserRequest parser, final HttpServletRequest req) throws IOException,
            ProcessException {

        final String value = req.getParameter(parser.paramName);

        if (value != null //
                && !parser.references.contains(value.toLowerCase())) {

            throwProcessException(String.format("Illegal %s for this request: %s", parser.paramName, value));
        }

        return value == null ? parser.defaultValue : value.toLowerCase();
    }

}
