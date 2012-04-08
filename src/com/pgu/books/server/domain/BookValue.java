package com.pgu.books.server.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BookValue implements IsSerializable {

    public enum Fields {
        AUTHOR, TITLE, EDITOR, YEAR, COMMENT, CATEGORY
    }

    public BookValue() {
    }

    @Id
    private Long id;

    private String value;
    private final Set<Fields> fields = new HashSet<Fields>();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        return "BookValue [id=" + id + ", value=" + value + ", fields=" + fields + "]";
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

    public Set<Fields> getFields() {
        return fields;
    }

}
