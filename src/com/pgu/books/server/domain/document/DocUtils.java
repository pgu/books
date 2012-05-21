package com.pgu.books.server.domain.document;

import java.util.logging.Logger;

import com.google.appengine.api.search.Document;

public class DocUtils {

    private static final Logger LOG = Logger.getLogger(DocUtils.class.getSimpleName());

    public static String getOnlyField(final String fieldName, final Document doc) {
        if (doc.getFieldCount(fieldName) == 1) {
            return doc.getOnlyField(fieldName).getText();
        }
        LOG.severe("Field " + fieldName + " present " + doc.getFieldCount(fieldName));
        return "";
    }

    public static Double getOnlyFieldNumeric(final String fieldName, final Document doc) {
        if (doc.getFieldCount(fieldName) == 1) {
            return doc.getOnlyField(fieldName).getNumber();
        }
        LOG.severe("Field " + fieldName + " present " + doc.getFieldCount(fieldName));
        return 0D;
    }

}
