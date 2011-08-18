package com.pgu.books.shared;

import java.io.Serializable;

import javax.persistence.Id;

public class Book implements Serializable {

    private static final long serialVersionUID = -8092579229454462886L;

    public Book() {
        super();
    }

    public Book(final String author, final String editor, final int year, final String title, final String comment) {
        super();
        this.author = author;
        this.editor = editor;
        this.year = year;
        this.title = title;
        this.comment = comment;
    }

    @Id
    private Long id;

    private String author;
    private String editor;
    private int year;
    private String title;
    private String comment;

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

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
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

}
