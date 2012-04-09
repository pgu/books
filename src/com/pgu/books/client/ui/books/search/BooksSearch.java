package com.pgu.books.client.ui.books.search;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.books.search.BooksSearchPresenter;

public class BooksSearch extends Composite {

    private static BooksSearchMenuUiBinder uiBinder = GWT.create(BooksSearchMenuUiBinder.class);

    interface BooksSearchMenuUiBinder extends UiBinder<Widget, BooksSearch> {
    }

    @UiField
    Label title;

    @UiField
    Button btnSearch;

    @UiField(provided = true)
    SuggestBox suggestBox;

    // private final MultiWordSuggestOracle oracle;
    private final MySuggestOracle myOracle;
    private BooksSearchPresenter presenter;

    public BooksSearch() {

        // oracle = new MultiWordSuggestOracle();
        // suggestBox = new SuggestBox(oracle);

        myOracle = new MySuggestOracle();
        suggestBox = new SuggestBox(myOracle);

        initWidget(uiBinder.createAndBindUi(this));

        // suggestBox.getTextBox().addKeyUpHandler(new KeyUpHandler() {
        //
        // @Override
        // public void onKeyUp(final KeyUpEvent event) {
        // GWT.log("keyup " + suggestBox.getText().length());
        // if (suggestBox.getText().length() == 3) {
        // presenter.getSuggestions(suggestBox.getText());
        // }
        // }
        // });
    }

    public void setPresenter(final BooksSearchPresenter presenter) {
        this.presenter = presenter;
        myOracle.setPresenter(presenter);
    }

    public void setWords(final ArrayList<String> words, final String text) {
        GWT.log("setwords");
        // if (suggestBox.getText().startsWith(text)) {
        // TODO PGU
        // oracle.clear();
        // oracle.setDefaultSuggestionsFromText(words);
        // suggestBox.showSuggestionList();
        // }
        if (suggestBox.getText().startsWith(text)) {
            GWT.log("showsuggestion");
            myOracle.setWords(words, text);
        }

    }
}
