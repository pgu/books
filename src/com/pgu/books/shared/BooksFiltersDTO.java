package com.pgu.books.shared;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BooksFiltersDTO implements IsSerializable {

    private final ArrayList<String> selectedAuthors = new ArrayList<String>();
    private final ArrayList<String> selectedEditors = new ArrayList<String>();
    private final ArrayList<String> selectedCategories = new ArrayList<String>();

    public BooksFiltersDTO authors(final ArrayList<String> selectedAuthors) {
        this.selectedAuthors.clear();
        this.selectedAuthors.addAll(selectedAuthors);
        return this;
    }

    public BooksFiltersDTO editors(final ArrayList<String> selectedEditors) {
        this.selectedEditors.clear();
        this.selectedEditors.addAll(selectedEditors);
        return this;
    }

    public BooksFiltersDTO categories(final ArrayList<String> selectedCategories) {
        this.selectedCategories.clear();
        this.selectedCategories.addAll(selectedCategories);
        return this;
    }

}
