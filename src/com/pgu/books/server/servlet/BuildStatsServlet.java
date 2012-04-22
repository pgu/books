package com.pgu.books.server.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.Category2Books;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.Editor2Books;
import com.pgu.books.server.domain.Entity2Books;
import com.pgu.books.server.utils.ServletUtils;
import com.pgu.books.shared.domain.Book;

@SuppressWarnings("serial")
public class BuildStatsServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(BuildStatsServlet.class.getName());

    private final DAO           dao    = new DAO();

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

        try {
            createEntity2Books("category", Category2Books.class);
            servletUtils.info("Creating stats for categories is done (" + (System.currentTimeMillis() - startTime)
                    + " ms)");

            createEntity2Books("editor", Editor2Books.class);
            servletUtils.info("Creating stats for editors is done (" + (System.currentTimeMillis() - startTime)
                    + " ms)");

        } catch (final InstantiationException e) {
            LOGGER.severe(e.getMessage());
        } catch (final IllegalAccessException e) {
            LOGGER.severe(e.getMessage());
        }
    }

    private <T extends Entity2Books> void createEntity2Books(final String attribute, final Class<T> clazz)
            throws InstantiationException, IllegalAccessException {
        //
        // clean current stats
        final QueryResultIterator<T> itr2books = dao.ofy().query(clazz).iterator();
        while (itr2books.hasNext()) {
            dao.ofy().delete(itr2books.next());
        }

        //
        // create new stats
        final QueryResultIterator<CategoryFilter> itrFilter = dao.ofy().query(CategoryFilter.class).iterator();
        while (itrFilter.hasNext()) {

            final CategoryFilter filter = itrFilter.next();

            final int count = dao.ofy().query(Book.class) //
                    .filter(attribute, filter.getValue()) //
                    .count();

            final T entity2Books = clazz.newInstance();
            entity2Books.setLabel(filter.getValue());
            entity2Books.setCount(count);

            dao.ofy().put(entity2Books);
        }
    }

}
