package com.pgu.books.shared.domain;

import javax.persistence.Id;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Book implements IsSerializable {

    public Book() {
    }

    public Book(final String author, //
            final String title, //
            final String editor, //
            final String year, //
            final String comment, //
            final String category) {
        this.author = author;
        this.title = title;
        this.editor = editor;
        this.year = year;
        this.comment = comment;
        this.category = category;
    }

    @Id
    private Long id;

    private String author;
    private String editor;
    private String year;
    private String title;
    private String comment;
    private String category;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (id == null ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", author=" + author + ", editor=" + editor + ", year=" + year + ", title=" + title
                + ", comment=" + comment + ", category=" + category + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(final String editor) {
        this.editor = editor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(final String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

}