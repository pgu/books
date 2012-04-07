package com.pgu.books.server.domain;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public class CategoryFilter implements IsSerializable {

    public CategoryFilter() {
    }

    @Id
    private Long id;

    private String value;

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

    public CategoryFilter value(final String value) {
        setValue(value);
        return this;
    }

}
