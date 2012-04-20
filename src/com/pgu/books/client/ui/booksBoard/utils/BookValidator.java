package com.pgu.books.client.ui.booksBoard.utils;

import java.util.Date;

import com.google.gwt.i18n.client.DateTimeFormat;

public class BookValidator {

    public static boolean isValidTitle(final String value) {
        return value.length() > 2;
    }

    public static boolean isValidAuthor(final String value) {
        return value.length() > 2;
    }

    public static boolean isValidEditor(final String value) {
        return value.length() > 2;
    }

    public static boolean isValidYear(final String value) {

        int y = 0;
        try {
            y = Integer.parseInt(value);
        } catch (final NumberFormatException nfe) {
            return false;
        }

        final int currentYear = Integer.parseInt(DateTimeFormat.getFormat("yyyy").format(new Date()));
        if (y > currentYear) {
            return false;
        }
        return true;
    }

    public static boolean isValidComment(final String value) {
        return true;
    }

    public static boolean isValidCategory(final String value) {
        return value.length() > 2;
    }

}
