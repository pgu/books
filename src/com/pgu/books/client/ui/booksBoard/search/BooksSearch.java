package com.pgu.books.client.ui.booksBoard.search;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.booksBoard.search.BooksSearchPresenter;

public class BooksSearch extends Composite implements BooksSearchUI {

    private static BooksSearchMenuUiBinder uiBinder = GWT.create(BooksSearchMenuUiBinder.class);

    interface BooksSearchMenuUiBinder extends UiBinder<Widget, BooksSearch> {
    }

    @UiField
    Label                                  title;

    @UiField
    Button                                 btnSearch;

    @UiField(provided = true)
    SuggestBox                             suggestBox;

    private final BooksSearchSuggestOracle booksSearchSuggestOracle;
    private BooksSearchPresenter           presenter;

    public BooksSearch() {

        booksSearchSuggestOracle = new BooksSearchSuggestOracle();
        suggestBox = new SuggestBox(booksSearchSuggestOracle);

        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(final BooksSearchPresenter presenter) {
        this.presenter = presenter;
        booksSearchSuggestOracle.setPresenter(presenter);
    }

    @Override
    public void setWords(final ArrayList<String> words, final String text) {
        if (suggestBox.getText().startsWith(text)) {
            booksSearchSuggestOracle.setWords(words, text);
        }
    }

    @UiHandler("btnSearch")
    public void clickSearch(final ClickEvent e) {
        presenter.searchBooks(suggestBox.getText());
    }

}
