package com.pgu.books.shared.dto;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BooksQueryParameters implements IsSerializable {

    private String            searchText = "";
    private ArrayList<String> selectedAuthors;
    private ArrayList<String> selectedEditors;
    private ArrayList<String> selectedCategories;

    public BooksQueryParameters authors(final ArrayList<String> selectedAuthors) {
        checkNotNull(selectedAuthors);

        this.selectedAuthors = selectedAuthors;
        return this;
    }

    public BooksQueryParameters editors(final ArrayList<String> selectedEditors) {
        checkNotNull(selectedEditors);

        this.selectedEditors = selectedEditors;
        return this;
    }

    public BooksQueryParameters categories(final ArrayList<String> selectedCategories) {
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

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(final String searchText) {
        this.searchText = searchText;
    }

    private void checkNotNull(final ArrayList<String> selecteds) {
        if (null == selecteds) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "BooksFiltersDTO [searchText=" + searchText + ", selectedAuthors=" + selectedAuthors
                + ", selectedEditors=" + selectedEditors + ", selectedCategories=" + selectedCategories + "]";
    }

}
