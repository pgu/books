package com.pgu.books.client.ui.booksBoard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
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
import com.pgu.books.client.ui.booksBoard.grid.BooksGrid;
import com.pgu.books.client.ui.booksBoard.grid.BooksGridUI;
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
    private final BooksGrid   booksGrid;

    private final Button      btnDelete = new Button("Borrar");

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

        setDeleteHandler();
    }

    private VerticalPanel createWestMenu(final LoginInfo loginInfo) {

        final DisclosurePanel disclosurePanelFilters = new DisclosurePanel("Filtrar los libros");
        disclosurePanelFilters.setWidth("100%");
        disclosurePanelFilters.add(booksFilters);

        final VerticalPanel westMenu = new VerticalPanel();
        westMenu.setWidth("150px");
        westMenu.add(disclosurePanelFilters);

        if (loginInfo.isLoggedIn()) {
            booksFilters = new BooksFilters();
            bookForm = new BookForm();

            final DisclosurePanel disclosurePanelForm = new DisclosurePanel("Añadir un libro");
            disclosurePanelForm.setWidth("100%");
            disclosurePanelForm.add(bookForm);

            final DisclosurePanel disclosurePanelDelete = new DisclosurePanel("Borrar libros");
            disclosurePanelDelete.setWidth("100%");
            disclosurePanelDelete.add(createBookDelete());

            westMenu.add(disclosurePanelForm);
            westMenu.add(disclosurePanelDelete);
        }

        return westMenu;
    }

    private VerticalPanel createBookDelete() {
        final VerticalPanel bookForm = new VerticalPanel();
        bookForm.setSpacing(4);
        bookForm.add(btnDelete);

        btnDelete.setWidth("100%");
        return bookForm;
    }

    private void setDeleteHandler() {
        btnDelete.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                presenter.deleteBooks(booksGrid.getSelectedBooks());
            }
        });
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

}
