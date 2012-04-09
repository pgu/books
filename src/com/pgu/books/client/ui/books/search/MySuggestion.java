package com.pgu.books.client.ui.books.search;

import com.google.gwt.user.client.ui.SuggestOracle.Suggestion;

public class MySuggestion implements Suggestion {

    private final String word;

    public MySuggestion(final String word) {
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
