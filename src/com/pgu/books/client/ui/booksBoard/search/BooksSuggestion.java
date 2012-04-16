package com.pgu.books.client.ui.booksBoard.search;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;

public class BooksSuggestion implements Suggestion {

    private final String word;

    public BooksSuggestion(final String word) {
        this.word = word;
    }

    @Override
    public String getDisplayString() {
        return word;
    }

    @Override
    public String getReplacementString() {
        return word;
    }

}
