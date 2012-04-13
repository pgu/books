package com.pgu.books.server.domain;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public abstract class LetterFilter implements IsSerializable {

    @Id
    private Long id;

    private String letter;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (letter == null ? 0 : letter.hashCode());
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
        final LetterFilter other = (LetterFilter) obj;
        if (letter == null) {
            if (other.letter != null) {
                return false;
            }
        } else if (!letter.equals(other.letter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LetterFilter [id=" + id + ", letter=" + letter + "]";
    }

    public LetterFilter letter(final String letter) {
        setLetter(letter);
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(final String letter) {
        this.letter = letter;
    }

}
