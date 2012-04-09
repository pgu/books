package com.pgu.books.client.ui.books.search;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.Widget;

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

    private final MultiWordSuggestOracle oracle;

    public BooksSearch() {

        oracle = new MultiWordSuggestOracle();
        suggestBox = new SuggestBox(oracle);

        initWidget(uiBinder.createAndBindUi(this));

        suggestBox.addKeyUpHandler(new KeyUpHandler() {

            @Override
            public void onKeyUp(final KeyUpEvent event) {
                suggestBox.getValue();
                suggestBox.getText();
            }
        });
    }

}
