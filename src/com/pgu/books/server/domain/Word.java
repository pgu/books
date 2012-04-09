package com.pgu.books.server.domain;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Word implements IsSerializable, IsWord {

    @Id
    private Long id;

    private String value;
    private String display;

    public Word() {
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
        this.value = value;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(final String display) {
        this.display = display;
    }

    public Word value(final String value) {
        setValue(value);
        return this;
    }

    public Word display(final String display) {
        setDisplay(display);
        return this;
    }

}
