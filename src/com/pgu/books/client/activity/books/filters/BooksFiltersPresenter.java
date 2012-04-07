package com.pgu.books.client.activity.books.filters;

import java.util.ArrayList;

public interface BooksFiltersPresenter {

    void fetchBooks(ArrayList<String> selectedAuthors, ArrayList<String> selectedEditors,
            ArrayList<String> selectedCategories);

}
