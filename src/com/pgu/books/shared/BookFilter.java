package com.pgu.books.shared;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BookFilter implements IsSerializable {

    public enum Type {
        AUTHOR, EDITOR, CATEGORY
    }

    public BookFilter() {
    }

    // TODO PGU

    @Id
    private Long id;

    private String type;
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

    public Type getType() {
        if (type == null) {
            return null;
        }
        return Type.valueOf(type);
    }

    public void setType(final Type type) {
        if (type == null) {
            this.type = null;
        }
        this.type = type.toString();
    }

    public BookFilter type(final Type type) {
        setType(type);
        return this;
    }

    public BookFilter value(final String value) {
        setValue(value);
        return this;
    }

}
