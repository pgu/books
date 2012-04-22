package com.pgu.books.server.domain;

import com.pgu.books.shared.domain.Book;

public class ArchivedBook extends Book {

    private String archiveDate;
    private Long   bookId;

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

    public String getArchiveDate() {
        return archiveDate;
    }

    public void setArchiveDate(final String archiveDate) {
        this.archiveDate = archiveDate;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(final Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "ArchivedBook [archiveDate=" + archiveDate + ", bookId=" + bookId + "], " + super.toString();
    }

}
