package com.pgu.books.server.domain;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BookValue implements IsSerializable {

    public enum Field {
        AUTHOR, TITLE, EDITOR, YEAR, COMMENT, CATEGORY
    }

    public BookValue() {
    }

    @Id
    private Long id;

    private String value;
    private Field field;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (field == null ? 0 : field.hashCode());
        result = prime * result + (value == null ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BookValue other = (BookValue) obj;
        if (field != other.field) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BookValue [id=" + id + ", value=" + value + ", field=" + field + "]";
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

    public Field getField() {
        return field;
    }

    public void setField(final Field field) {
        this.field = field;
    }

    public BookValue author(final String author) {
        newBookValue(author, Field.AUTHOR);
        return this;
    }

    public BookValue title(final String title) {
        newBookValue(title, Field.TITLE);
        return this;
    }

    public BookValue editor(final String editor) {
        newBookValue(editor, Field.EDITOR);
        return this;
    }

    public BookValue year(final String year) {
        newBookValue(year, Field.YEAR);
        return this;
    }

    public BookValue comment(final String comment) {
        newBookValue(comment, Field.COMMENT);
        return this;
    }

    public BookValue category(final String category) {
        newBookValue(category, Field.CATEGORY);
        return this;
    }

    private void newBookValue(final String value, final Field field) {
        if (this.value != null) {
            throw new UnsupportedOperationException("You can assign only once a value");
        }
        setValue(value);
        setField(field);
    }

}
