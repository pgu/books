package com.pgu.books.client.activity.books.filters;

import java.util.ArrayList;
import java.util.List;

import com.pgu.books.client.ui.books.filters.FilterValue;
import com.pgu.books.client.ui.books.filters.Letter;

public interface BooksFiltersPresenter {

    void fetchBooks(ArrayList<String> selectedAuthors, ArrayList<String> selectedEditors,
            ArrayList<String> selectedCategories);

    void countEditorsByLetters(List<Letter> lettersToFill);

    void countCategoriesByLetters(List<Letter> lettersToFill);

    void fetchCategoriesByLetter(String letter, List<FilterValue> valuesToFill);

    void fetchEditorsByLetter(String letter, List<FilterValue> valuesToFill);

    void fetchAuthorsByLetter(String letter, List<FilterValue> valuesToFill);

    void fetchAuthorsByLetterNew(String letter);

}
