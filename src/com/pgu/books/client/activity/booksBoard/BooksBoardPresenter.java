package com.pgu.books.client.activity.booksBoard;

import java.util.ArrayList;

import com.pgu.books.shared.domain.Book;

public interface BooksBoardPresenter {

    void deleteBooks(ArrayList<Book> selectedBooks);

}
