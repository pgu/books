package com.pgu.books.client.activity.booksBoard.list;

import java.util.ArrayList;

import com.pgu.books.shared.domain.Book;

public interface BooksDeletePresenter {

    void deleteBooks(ArrayList<Book> selectedBooks);

}
