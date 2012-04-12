package com.pgu.books.client.activity.books.filters;

import java.util.ArrayList;

import com.pgu.books.client.activity.utils.FilterType;
import com.pgu.books.client.ui.books.filters.Letter;

public interface BooksFiltersPresenter {

    void fetchBooks(ArrayList<String> selectedAuthors, ArrayList<String> selectedEditors,
            ArrayList<String> selectedCategories);

    void fetchFiltersByLetter(Letter letter, FilterType filterType);

}
