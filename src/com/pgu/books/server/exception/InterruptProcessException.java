package com.pgu.books.server.exception;

@SuppressWarnings("serial")
public class InterruptProcessException extends Exception {

    public InterruptProcessException(final String message, final long startTime) {
        super(message + " (" + (System.currentTimeMillis() - startTime) + " ms)");
    }

}
