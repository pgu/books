package com.pgu.books.server;

import com.google.appengine.api.search.Document;
import com.google.appengine.api.search.Field;
import com.pgu.books.server.domain.document.BookDoc;

public class AppDoc {

    private final Document.Builder docBuilder = Document.newBuilder();

    public AppDoc text(final BookDoc bookDoc, final String value) {
        docBuilder.addField(Field.newBuilder().setName(bookDoc._()).setText(value));
        return this;
    }

    public AppDoc num(final BookDoc bookDoc, final Integer value) {
        docBuilder.addField(Field.newBuilder().setName(bookDoc._()).setNumber(value));
        return this;
    }

    public AppDoc num(final BookDoc bookDoc, final Long value) {
        docBuilder.addField(Field.newBuilder().setName(bookDoc._()).setNumber(value));
        return this;
    }

    public Document build() {
        return docBuilder.build();
    }
}
