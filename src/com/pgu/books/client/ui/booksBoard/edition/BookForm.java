package com.pgu.books.client.ui.booksBoard.edition;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.booksBoard.edition.BookFormPresenter;
import com.pgu.books.client.ui.booksBoard.utils.BookValidator;
import com.pgu.books.shared.domain.Book;

public class BookForm extends Composite implements BookFormUI {

    private static BookFormUiBinder uiBinder = GWT.create(BookFormUiBinder.class);

    interface BookFormUiBinder extends UiBinder<Widget, BookForm> {
    }

    @UiField
    VerticalPanel bookForm;

    @UiField
    TextBox       titleInput, authorInput, editorInput, yearInput, categoryInput;

    @UiField
    TextArea      commentInput;

    @UiField
    Button        btnSave;

    public BookForm() {
        initWidget(uiBinder.createAndBindUi(this));
        bookForm.setSpacing(4);
    }

    private BookFormPresenter presenter;

    @Override
    public void setPresenter(final BookFormPresenter presenter) {
        this.presenter = presenter;
    }

    @UiHandler("btnSave")
    public void clickSave(final ClickEvent e) {
        final String title = titleInput.getText();
        final String author = authorInput.getText();
        final String editor = editorInput.getText();
        final String year = yearInput.getText();
        final String comment = commentInput.getText();
        final String category = categoryInput.getText();

        final StringBuilder errors = new StringBuilder();

        if (!BookValidator.isValidTitle(title)) {
            errors.append("Por lo menos 3 caracteres para el título \n");
        }
        if (!BookValidator.isValidAuthor(author)) {
            errors.append("Por lo menos 3 caracteres para el autor \n");
        }
        if (!BookValidator.isValidEditor(editor)) {
            errors.append("Por lo menos 3 caracteres para el editor \n");
        }
        if (!BookValidator.isValidYear(year)) {
            errors.append("El año no es válido \n");
        }
        if (!BookValidator.isValidComment(comment)) {
            errors.append("El comentario no es válido \n");
        }
        if (!BookValidator.isValidCategory(category)) {
            errors.append("Por lo menos 3 caracteres para la categoría \n");
        }

        if (errors.length() > 0) {
            Window.alert(errors.toString());
            return;
        }

        final Book book = new Book();
        book.setAuthor(author);
        book.setCategory(category);
        book.setComment(comment);
        book.setEditor(editor);
        book.setTitle(title);
        book.setYear(year);
        presenter.createBook(book);
    }

}
