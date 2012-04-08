package com.pgu.books.server.rpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.google.appengine.api.datastore.QueryResultIterable;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Query;
import com.pgu.books.client.BooksService;
import com.pgu.books.server.access.DAO;
import com.pgu.books.server.domain.AuthorFilter;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.EditorFilter;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BookCategory;
import com.pgu.books.shared.BooksFiltersDTO;

@SuppressWarnings("serial")
public class BooksServiceImpl extends RemoteServiceServlet implements BooksService {

    private static final Logger LOG = Logger.getLogger(BooksServiceImpl.class.getSimpleName());

    private final DAO dao = new DAO();

    // final Objectify ofy = ObjectifyService.begin();
    // final List<Book> books = BooksDB.DB.get(cat);
    // ofy.put(books);
    // ofy.query(Book.class).filter("author", "toto").list();

    @Override
    public String testImport() {
        return importBooks(BookCategory.titles.get(0));
    }

    @Override
    public String importBooks(final String categoryTitle) {
        final InputStream is = getServletContext().getResourceAsStream("/WEB-INF/books/" + categoryTitle + ".txt");
        final BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {

            int countTotal = 0;
            int countImported = 0;

            String line = null;
            while ((line = br.readLine()) != null) {
                countTotal++;

                final String[] tokens = line.split("\", \"");
                if (tokens.length == 6) {
                    countImported++;

                    final String rawAuthor = tokens[0];
                    final String author = rawAuthor.isEmpty() ? "" : rawAuthor.substring(1); // removes first "

                    final String rawCategory = tokens[5];
                    final String category = rawCategory.isEmpty() ? "" : rawCategory.substring(0,
                            rawCategory.length() - 1); // removes last "

                    dao.ofy().put(new Book(author, tokens[1], tokens[2], tokens[3], tokens[4], category));
                } else {
                    System.out.println("Not imported: " + line);
                    LOG.warning("Not imported: " + line);
                }
            }

            return countImported + " / " + countTotal;

        } catch (final IOException e) {
            e.printStackTrace();
        }

        return "An error occurred!";
    }

    @Override
    public ArrayList<Book> fetchBooks(final BooksFiltersDTO filtersDTO, final int start, final int length) {

        final Query<Book> query = dao.ofy().query(Book.class);

        applyFilters(filtersDTO, query);

        final Query<Book> q = query.order("title").offset(start).limit(length);

        return new ArrayList<Book>(q.list());
    }

    @Override
    public int countBooks(final BooksFiltersDTO filtersDTO) {

        final Query<Book> query = dao.ofy().query(Book.class);

        applyFilters(filtersDTO, query);

        return query.count();
    }

    private void applyFilters(final BooksFiltersDTO filtersDTO, final Query<Book> query) {

        if (!filtersDTO.getSelectedAuthors().isEmpty()) {
            query.filter("author in", filtersDTO.getSelectedAuthors());
        }

        if (!filtersDTO.getSelectedEditors().isEmpty()) {
            query.filter("editor in", filtersDTO.getSelectedEditors());
        }

        if (!filtersDTO.getSelectedCategories().isEmpty()) {
            query.filter("category in", filtersDTO.getSelectedCategories());
        }
    }

    @Override
    public void delete() {
        final QueryResultIterable<Key<Book>> keys = dao.ofy().query(Book.class).fetchKeys();
        dao.ofy().delete(keys);
    }

    @Override
    public ArrayList<String> fetchFilterAuthors() {
        final List<AuthorFilter> authors = dao.ofy().query(AuthorFilter.class).order("value").list();

        final ArrayList<String> names = new ArrayList<String>(authors.size());
        for (final AuthorFilter authorFilter : authors) {

            names.add(authorFilter.getValue());
        }
        return names;
    }

    @Override
    public ArrayList<String> fetchFilterEditors() {
        final List<EditorFilter> editors = dao.ofy().query(EditorFilter.class).order("value").list();

        final ArrayList<String> names = new ArrayList<String>(editors.size());
        for (final EditorFilter editorFilter : editors) {

            names.add(editorFilter.getValue());
        }
        return names;
    }

    @Override
    public ArrayList<String> fetchFilterCategories() {
        final List<CategoryFilter> categories = dao.ofy().query(CategoryFilter.class).order("value").list();

        final ArrayList<String> names = new ArrayList<String>(categories.size());
        for (final CategoryFilter categoryFilter : categories) {

            names.add(categoryFilter.getValue());
        }
        return names;
    }

}