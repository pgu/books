package com.pgu.books.client.ui.books.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.Widget;

public class BooksMenu extends Composite {

    private static BooksMenuUiBinder uiBinder = GWT.create(BooksMenuUiBinder.class);

    interface BooksMenuUiBinder extends UiBinder<Widget, BooksMenu> {
    }

    @UiField
    Label title;

    @UiField
    Button busca;

    @UiField(provided = true)
    SuggestBox suggestBox;

    public BooksMenu() {

        final MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();
        final String[] words = new String[] { "toto", "titi", "tata" };
        for (int i = 0; i < words.length; ++i) {
            oracle.add(words[i]);
        }

        suggestBox = new SuggestBox(oracle);

        initWidget(uiBinder.createAndBindUi(this));
    }

}
