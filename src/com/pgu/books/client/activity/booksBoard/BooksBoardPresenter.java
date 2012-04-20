package com.pgu.books.client.activity.booksBoard;

import java.util.ArrayList;

import com.pgu.books.shared.domain.Book;

public interface BooksBoardPresenter {

    void createBook(Book book);

    void deleteBooks(ArrayList<Book> selectedBooks);

}
