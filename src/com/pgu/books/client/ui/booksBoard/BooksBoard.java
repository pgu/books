package com.pgu.books.client.ui.booksBoard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.booksBoard.BooksBoardPresenter;
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
    DockPanel                  booksBoard;

    private final BooksGrid    booksGrid;
    private final BooksFilters booksFilters;
    private final BooksSearch  booksSearch;

    private final TextBox      titleInput    = new TextBox();
    private final TextBox      authorInput   = new TextBox();
    private final TextBox      editorInput   = new TextBox();
    private final TextBox      yearInput     = new TextBox();
    private final TextArea     commentInput  = new TextArea();
    private final TextBox      categoryInput = new TextBox();
    private final Button       btnSave       = new Button("Guardar");
    private final Button       btnDelete     = new Button("Borrar");

    public BooksBoard(final LoginInfo loginInfo) {

        booksBoard = new DockPanel();
        booksBoard.setSpacing(4);
        booksBoard.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        booksSearch = new BooksSearch();
        booksFilters = new BooksFilters();

        booksBoard.add(booksSearch, DockPanel.NORTH);

        final DisclosurePanel disclosurePanelFilters = new DisclosurePanel("Filtrar los libros");
        disclosurePanelFilters.setWidth("100%");
        disclosurePanelFilters.add(booksFilters);

        final DisclosurePanel disclosurePanelForm = new DisclosurePanel("Añadir un libro");
        disclosurePanelForm.setWidth("100%");
        disclosurePanelForm.add(createBookForm());

        final DisclosurePanel disclosurePanelDelete = new DisclosurePanel("Borrar libros");
        disclosurePanelDelete.setWidth("100%");
        disclosurePanelDelete.add(createBookDelete());

        final VerticalPanel westMenu = new VerticalPanel();
        westMenu.setWidth("150px");
        westMenu.add(disclosurePanelFilters);
        westMenu.add(disclosurePanelForm);
        westMenu.add(disclosurePanelDelete);

        booksBoard.add(westMenu, DockPanel.WEST);

        booksGrid = new BooksGrid(loginInfo);
        booksGrid.setHeight("600px");
        booksGrid.setWidth("1000px");
        booksBoard.add(booksGrid, DockPanel.CENTER);

        initWidget(uiBinder.createAndBindUi(this));

        setSaveHandler();
    }

    private VerticalPanel createBookDelete() {
        final VerticalPanel bookForm = new VerticalPanel();
        bookForm.setSpacing(4);
        bookForm.add(btnDelete);

        btnDelete.setWidth("100%");
        return bookForm;
    }

    private VerticalPanel createBookForm() {
        final Label titleLabel = new Label("Título");
        final Label authorLabel = new Label("Autor");
        final Label editorLabel = new Label("Editor");
        final Label yearLabel = new Label("Año");
        final Label commentLabel = new Label("Comentario");
        final Label categoryLabel = new Label("Categoría");

        final VerticalPanel bookForm = new VerticalPanel();
        bookForm.setSpacing(4);
        bookForm.add(titleLabel);
        bookForm.add(titleInput);
        bookForm.add(authorLabel);
        bookForm.add(authorInput);
        bookForm.add(editorLabel);
        bookForm.add(editorInput);
        bookForm.add(yearLabel);
        bookForm.add(yearInput);
        bookForm.add(commentLabel);
        bookForm.add(commentInput);
        bookForm.add(categoryLabel);
        bookForm.add(categoryInput);
        bookForm.add(btnSave);

        setStyleOnLabelsForm(titleLabel, authorLabel, editorLabel, yearLabel, commentLabel, categoryLabel);
        commentInput.setSize("150px", "150px");
        btnSave.setWidth("100%");
        return bookForm;
    }

    private static void setStyleOnLabelsForm(final Label... labels) {
        for (final Label label : labels) {
            label.getElement().getStyle().setPaddingLeft(2, Unit.PX);
        }
    }

    private void setSaveHandler() {
        btnSave.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {

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

    @Override
    public void startFocus() {
        setVisible(true);
    }

    @Override
    public void loseFocus() {
        setVisible(false);
    }

}
