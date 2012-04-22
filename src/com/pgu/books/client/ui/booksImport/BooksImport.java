package com.pgu.books.client.ui.booksImport;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.ui.utils.Notification;
import com.pgu.books.shared.dto.LoginInfo;
import com.pgu.books.shared.utils.BookCategory;

public class BooksImport extends Composite implements BooksImportUI {

    private static BooksImportUiBinder uiBinder = GWT.create(BooksImportUiBinder.class);

    interface BooksImportUiBinder extends UiBinder<Widget, BooksImport> {
    }

    @UiField(provided = true)
    Grid                                        categories;

    @UiField
    Button                                      btnAll, btnTest, btnDelete;

    private BooksImportPresenter                presenter;
    private final HashMap<String, ToggleButton> title2btns = new HashMap<String, ToggleButton>();

    public BooksImport(final LoginInfo loginInfo) {
        final int cols = 6;
        final ArrayList<String> titles = BookCategory.titles;
        int rows = titles.size() / cols;
        if (titles.size() % cols > 0) {
            rows++;
        }

        categories = new Grid(rows, cols);

        initWidget(uiBinder.createAndBindUi(this));

        int i = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                final String title = titles.get(i++);

                final ToggleButton toggle = new ToggleButton(title);
                toggle.addClickHandler(newClickOnToggle(toggle));

                categories.setWidget(row, col, toggle);
                title2btns.put(title, toggle);
            }
        }

    }

    private ClickHandler newClickOnToggle(final ToggleButton toggle) {
        return new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                toggle.setEnabled(false);
                presenter.importBooks(toggle.getText());
            }
        };
    }

    @Override
    public void setPresenter(final BooksImportPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void enableImport(final String categoryTitle) {
        title2btns.get(categoryTitle).setEnabled(true);
        Notification.error(categoryTitle + ": Error");
    }

    @Override
    public void disableImport(final String categoryTitle, final String importResult) {
        title2btns.get(categoryTitle).setEnabled(false);
        Notification.validation(categoryTitle + ": " + importResult);
    }

    @UiHandler("btnAll")
    public void clickAllCategories(final ClickEvent e) {
        for (final String title : BookCategory.titles) {
            presenter.importBooks(title);
        }
    }

    @UiHandler("btnTest")
    public void clickTest(final ClickEvent e) {
        presenter.testImport();
    }

    @UiHandler("btnDelete")
    public void clickDelete(final ClickEvent e) {
        presenter.deleteAllBooks();
    }

    @Override
    public void startFocus() {
        setVisible(true);
    }

    @Override
    public void loseFocus() {
        setVisible(false);
    }
}
