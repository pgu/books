package com.pgu.books.client.ui.booksBoard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.booksBoard.BooksBoardPresenter;
import com.pgu.books.client.ui.booksBoard.edition.BookForm;
import com.pgu.books.client.ui.booksBoard.edition.BookFormUI;
import com.pgu.books.client.ui.booksBoard.filters.BooksFilters;
import com.pgu.books.client.ui.booksBoard.filters.BooksFiltersUI;
import com.pgu.books.client.ui.booksBoard.list.BooksDelete;
import com.pgu.books.client.ui.booksBoard.list.BooksDeleteUI;
import com.pgu.books.client.ui.booksBoard.list.BooksGrid;
import com.pgu.books.client.ui.booksBoard.list.BooksGridUI;
import com.pgu.books.client.ui.booksBoard.search.BooksSearch;
import com.pgu.books.client.ui.booksBoard.search.BooksSearchUI;
import com.pgu.books.shared.dto.LoginInfo;

public class BooksBoard extends Composite implements BooksBoardUI {

    private static BooksBoardUiBinder uiBinder = GWT.create(BooksBoardUiBinder.class);

    interface BooksBoardUiBinder extends UiBinder<Widget, BooksBoard> {
    }

    @UiField(provided = true)
    DockPanel                 booksBoard;

    private final BooksSearch booksSearch;
    private BooksFilters      booksFilters;
    private BookForm          bookForm;
    private BooksDelete       booksDelete;
    private final BooksGrid   booksGrid;

    public BooksBoard(final LoginInfo loginInfo) {

        booksSearch = new BooksSearch();
        booksGrid = new BooksGrid(loginInfo);

        booksBoard = new DockPanel();
        booksBoard.setSpacing(4);
        booksBoard.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        booksBoard.add(booksSearch, DockPanel.NORTH);
        booksBoard.add(createWestMenu(loginInfo), DockPanel.WEST);
        booksBoard.add(booksGrid, DockPanel.CENTER);

        initWidget(uiBinder.createAndBindUi(this));
    }

    private VerticalPanel createWestMenu(final LoginInfo loginInfo) {

        booksFilters = new BooksFilters();

        final DisclosurePanel disclosurePanelFilters = new DisclosurePanel("Filtrar los libros");
        disclosurePanelFilters.setWidth("100%");
        disclosurePanelFilters.add(booksFilters);

        final VerticalPanel westMenu = new VerticalPanel();
        westMenu.setWidth("150px");
        westMenu.add(disclosurePanelFilters);

        if (loginInfo.isLoggedIn()) {
            bookForm = new BookForm();
            booksDelete = new BooksDelete(booksGrid);

            final DisclosurePanel disclosurePanelForm = new DisclosurePanel("Añadir un libro");
            disclosurePanelForm.setWidth("100%");
            disclosurePanelForm.add(bookForm);

            final DisclosurePanel disclosurePanelDelete = new DisclosurePanel("Borrar libros");
            disclosurePanelDelete.setWidth("100%");
            disclosurePanelDelete.add(booksDelete);

            westMenu.add(disclosurePanelForm);
            westMenu.add(disclosurePanelDelete);
        }

        return westMenu;
    }

    private BooksBoardPresenter presenter;

    @Override
    public void setPresenter(final BooksBoardPresenter presenter) {
        this.presenter = presenter;
    }

    public BooksFiltersUI getBooksFilters() {
        return booksFilters;
    }

    public BooksSearchUI getBooksSearch() {
        return booksSearch;
    }

    public BooksGridUI getBooksGrid() {
        return booksGrid;
    }

    public BookFormUI getBookForm() {
        return bookForm;
    }

    @Override
    public void startFocus() {
        setVisible(true);
    }

    @Override
    public void loseFocus() {
        setVisible(false);
    }

    public BooksDeleteUI getBooksDelete() {
        return booksDelete;
    }

}
