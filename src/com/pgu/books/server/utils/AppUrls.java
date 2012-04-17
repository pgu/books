package com.pgu.books.server.utils;

public final class AppUrls {

    private AppUrls() {
        throw new UnsupportedOperationException();
    }

    public static final String BUILD_FILTERS = "/cron/buildFilters";
    public static final String BUILD_WORDS = "/cron/buildWords";
    public static final String TEST = "/cron/test";

    public static final String PARAM_CURSOR = "cursor";

}
