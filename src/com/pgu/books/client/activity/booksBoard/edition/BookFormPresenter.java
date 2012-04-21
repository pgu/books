package com.pgu.books.client.activity.booksBoard.edition;

import com.pgu.books.shared.domain.Book;

public interface BookFormPresenter {

    void createBook(Book book);

    void showFormErrors(String string);

}
