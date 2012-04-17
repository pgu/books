package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.pgu.books.server.utils.AppQueues;
import com.pgu.books.server.utils.AppUrls;
import com.pgu.books.server.utils.ServletUtils;

@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(TestServlet.class.getName());

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {
        LOGGER.info("...GET request ");
        doPost(req, resp);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {

        final long startTime = System.currentTimeMillis();
        LOGGER.info("...POST request ");

        final ServletUtils servletUtils = new ServletUtils() //
                .logger(LOGGER) //
                .startInMs(startTime) //
                .response(resp) //
                .checkCallingEntity(req) //
        ;

        final String name = req.getParameter("name");
        if (name == null || name.isEmpty()) {

            LOGGER.info("*** new task!");

            final TaskOptions task = TaskOptions.Builder.withUrl(AppUrls.TEST);
            task.header("X-AppEngine-Cron", "true");
            task.param("name", "toto");

            final Queue queue = QueueFactory.getQueue(AppQueues.BUILD_FILTERS);
            queue.add(task);
        } else {
            LOGGER.info("*** over!");
        }

    }

}
