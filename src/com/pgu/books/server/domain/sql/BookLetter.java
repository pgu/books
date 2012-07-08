package com.pgu.books.server.domain.sql;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.pgu.books.server.domain.sql.BookFilter.Type;

public class BookLetter implements IsSerializable {

    @Id
    private Long   id;
    private Type   type;
    private String upperLetter;
    private int    nb;

    public BookLetter(final Type type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (type == null ? 0 : type.hashCode());
        result = prime * result + (upperLetter == null ? 0 : upperLetter.hashCode());
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
        final BookLetter other = (BookLetter) obj;
        if (type != other.type) {
            return false;
        }
        if (upperLetter == null) {
            if (other.upperLetter != null) {
                return false;
            }
        } else if (!upperLetter.equals(other.upperLetter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BookLetter [id=" + id + ", type=" + type + ", upperLetter=" + upperLetter + ", nb=" + nb + "]";
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

    public String getUpperLetter() {
        return upperLetter;
    }

    public void setUpperLetter(final String upperLetter) {
        if (upperLetter == null) {
            this.upperLetter = null;
        } else {
            if (upperLetter.length() != 1) {
                throw new IllegalArgumentException("upperletter has an invalid length: " + upperLetter);
            }
            this.upperLetter = upperLetter.toUpperCase();
        }
    }

    public int getNb() {
        return nb;
    }

    public void setNb(final int nb) {
        this.nb = nb;
    }

}
