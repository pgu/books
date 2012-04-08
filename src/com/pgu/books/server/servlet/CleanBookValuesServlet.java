package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pgu.books.server.access.DAO;

@SuppressWarnings("serial")
public class CleanBookValuesServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(CleanBookValuesServlet.class.getName());

    private final DAO dao = new DAO();

    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {
        LOGGER.info("...GET request ");
        doPost(req, resp);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {

        // get bookValues and delete duplicates
        // if not finish add task with cursor param
    }

}
