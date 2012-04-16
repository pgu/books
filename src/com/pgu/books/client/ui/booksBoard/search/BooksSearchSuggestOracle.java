package com.pgu.books.client.ui.booksBoard.search;

import java.util.ArrayList;

import com.google.gwt.user.client.ui.SuggestOracle;
import com.pgu.books.client.activity.booksBoard.search.BooksSearchPresenter;

public class BooksSearchSuggestOracle extends SuggestOracle {

    private BooksSearchPresenter presenter;

    public void setPresenter(final BooksSearchPresenter presenter) {
        this.presenter = presenter;
    }

    private Callback callback;
    private Request  request;

    @Override
    public void requestSuggestions(final Request request, final Callback callback) {

        if (request.getQuery().length() < 3) {
            callback.onSuggestionsReady(request, new Response(new ArrayList<Suggestion>()));
            return;
        }

        if (request.getQuery().length() >= 3) {
            this.callback = callback;
            this.request = request;

            presenter.getSuggestions(request.getQuery());
            return;
        }

    }

    public void setWords(final ArrayList<String> words, final String text) {
        final ArrayList<BooksSuggestion> suggestions = new ArrayList<BooksSuggestion>(words.size());
        for (final String word : words) {
            suggestions.add(new BooksSuggestion(word));
        }

        final Response response = new Response(suggestions);
        callback.onSuggestionsReady(request, response);
    }

}
