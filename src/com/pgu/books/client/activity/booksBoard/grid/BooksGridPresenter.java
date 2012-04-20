package com.pgu.books.client.activity.booksBoard.grid;

import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.utils.SortField;

public interface BooksGridPresenter {

    void fetchBooks(int start, int length, SortField sortField, boolean isAscending);

    void saveBook(Book book);

}
