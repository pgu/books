package com.pgu.books.shared;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BooksFiltersDTO implements IsSerializable {

    private ArrayList<String> selectedAuthors;
    private ArrayList<String> selectedEditors;
    private ArrayList<String> selectedCategories;

    public BooksFiltersDTO authors(final ArrayList<String> selectedAuthors) {
        checkNotNull(selectedAuthors);

        this.selectedAuthors = selectedAuthors;
        return this;
    }

    public BooksFiltersDTO editors(final ArrayList<String> selectedEditors) {
        checkNotNull(selectedEditors);

        this.selectedEditors = selectedEditors;
        return this;
    }

    public BooksFiltersDTO categories(final ArrayList<String> selectedCategories) {
        checkNotNull(selectedCategories);

        this.selectedCategories = selectedCategories;
        return this;
    }

    public ArrayList<String> getSelectedAuthors() {
        if (selectedAuthors == null) {
            selectedAuthors = new ArrayList<String>();
        }
        return selectedAuthors;
    }

    public ArrayList<String> getSelectedEditors() {
        if (selectedEditors == null) {
            selectedEditors = new ArrayList<String>();
        }
        return selectedEditors;
    }

    public ArrayList<String> getSelectedCategories() {
        if (selectedCategories == null) {
            selectedCategories = new ArrayList<String>();
        }
        return selectedCategories;
    }

    private void checkNotNull(final ArrayList<String> selectedEditors) {
        if (null == selectedEditors) {
            throw new IllegalArgumentException();
        }
    }

}
