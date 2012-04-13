package com.pgu.books.server.domain;

import com.google.gwt.user.client.rpc.IsSerializable;

public abstract class LetterFilter implements IsSerializable {

    private String letter;

    public LetterFilter letter(final String letter) {
        setLetter(letter);
        return this;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(final String letter) {
        this.letter = letter;
    }

}
