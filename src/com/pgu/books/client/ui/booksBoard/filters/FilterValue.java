package com.pgu.books.client.ui.booksBoard.filters;

public class FilterValue implements Comparable<FilterValue> {

    private final String value;

    public FilterValue(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int compareTo(final FilterValue o) {
        return value.compareTo(o.getValue());
    }

}
