package com.pgu.books.client.activity.books.filters;

import java.util.ArrayList;
import java.util.List;

import com.pgu.books.client.ui.books.filters.FilterValue;

public interface BooksFiltersPresenter {

    void fetchBooks(ArrayList<String> selectedAuthors, ArrayList<String> selectedEditors,
            ArrayList<String> selectedCategories);

    void fetchCategoriesByLetter(String letter, List<FilterValue> valuesToFill);

    void fetchEditorsByLetter(String letter, List<FilterValue> valuesToFill);

    void fetchAuthorsByLetter(String letter, List<FilterValue> valuesToFill);

    void fetchAuthorsByLetterNew(String letter);

}
