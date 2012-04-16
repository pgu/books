package com.pgu.books.client.ui.booksCharts;

import java.util.TreeMap;

public class ChartConfig {

    private String title;
    private String header1;
    private String header2;
    private TreeMap<String, Integer> data;

    public ChartConfig title(final String title) {
        this.title = title;
        return this;
    }

    public ChartConfig headerKey(final String header1) {
        this.header1 = header1;
        return this;
    }

    public ChartConfig headerValue(final String header2) {
        this.header2 = header2;
        return this;
    }

    public ChartConfig data(final TreeMap<String, Integer> data) {
        this.data = data;
        return this;
    }

    public String getHeader1() {
        return header1;
    }

    public String getHeader2() {
        return header2;
    }

    public String getTitle() {
        return title;
    }

    public TreeMap<String, Integer> getData() {
        return data;
    }

}
