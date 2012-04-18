package com.pgu.books.client.ui.booksMenu;

import com.pgu.books.client.activity.booksMenu.BooksMenuPresenter;
import com.pgu.books.client.ui.utils.HasAdminFeatures;

public interface BooksMenuUI extends HasAdminFeatures {

    void setPresenter(BooksMenuPresenter presenter);

}
