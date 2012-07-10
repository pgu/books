package com.pgu.books.server.domain.sql;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BookFilter implements IsSerializable {

    public enum Type {
        AUTHOR, EDITOR, CATEGORY, YEAR
    }

    @Id
    private Long   id;
    private Type   type;
    private String value;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (type == null ? 0 : type.hashCode());
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
        final BookFilter other = (BookFilter) obj;
        if (type != other.type) {
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
        return "BookFilter [id=" + id + ", type=" + type + ", value=" + value + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(final Type type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

}
