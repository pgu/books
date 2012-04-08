package com.pgu.books.server.utils;

public final class AppUtils {

    public static final long LIMIT_MS = 1000 * 25;

    private AppUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean hasReachedTimeOut(final long startTimeInMs) {
        return System.currentTimeMillis() - startTimeInMs > LIMIT_MS;
    }

}
