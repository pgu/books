package com.pgu.books.server.domain;

import com.pgu.books.shared.domain.Book;

public class ArchivedBook extends Book {

    public ArchivedBook() {
    }

    public ArchivedBook(final Book book) {
        setAuthor(book.getAuthor());
        setTitle(book.getTitle());
        setEditor(book.getEditor());
        setYear(book.getYear());
        setComment(book.getComment());
        setCategory(book.getCategory());
    }

}
