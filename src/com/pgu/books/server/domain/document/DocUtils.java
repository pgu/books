package com.pgu.books.server.domain.document;

import com.google.appengine.api.search.Document;
import com.google.appengine.api.search.Field;
import com.pgu.books.server.AppLog;

public class DocUtils {

    private final AppLog log = new AppLog();

    public String text(final BookDoc fieldName, final Document doc) {
        final Field field = field(fieldName, doc);
        return field == null ? "" : field.getText();
    }

    public Long numLong(final BookDoc fieldName, final Document doc) {
        final String text = text(fieldName, doc);
        return "".equals(text) ? 0L : Long.getLong(text);
    }

    public Integer numInt(final BookDoc fieldName, final Document doc) {
        final String text = text(fieldName, doc);
        return "".equals(text) ? 0 : Integer.getInteger(text);
    }

    public Double num(final BookDoc fieldName, final Document doc) {
        final Field field = field(fieldName, doc);
        return field == null ? 0D : field.getNumber();
    }

    private Field field(final BookDoc fieldName, final Document doc) {
        final String name = fieldName._();
        if (doc.getFieldCount(name) == 1) {
            return doc.getOnlyField(name);
        }

        log.warning(this, "The field %s is present %s times", name, doc.getFieldCount(name));
        return null;
    }

}
