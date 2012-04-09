package com.pgu.books.server.domain;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BookWord implements IsSerializable, IsWord {

    @Id
    private Long id;

    private String value;
    private String display;
    private Long bookId;

    public BookWord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value.toLowerCase();
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(final String display) {
        this.display = display;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(final Long bookId) {
        this.bookId = bookId;
    }

    public BookWord value(final String text) {
        setValue(text);
        setDisplay(text);
        return this;
    }

    public BookWord bookId(final Long bookId) {
        setBookId(bookId);
        return this;
    }

}
