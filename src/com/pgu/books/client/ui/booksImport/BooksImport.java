package com.pgu.books.client.ui.booksImport;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.presenter.booksImport.BooksImportPresenter;

public class BooksImport extends Composite implements BooksImportUI {

    private static List<String>        categoryTitles = new ArrayList<String>();

    static {
        categoryTitles.add("Adonais_poesia");
        categoryTitles.add("Arte_historia_musica");
        categoryTitles.add("Biblioteca_el_sol");
        categoryTitles.add("Budismagibrujocult");
        categoryTitles.add("Errores_de_pegado");
        categoryTitles.add("Filocont_2");
        categoryTitles.add("Filoespanola");
        categoryTitles.add("Filoextranjera");
        categoryTitles.add("Fsillon");
        categoryTitles.add("Galicia_ling_miscelanea");
        categoryTitles.add("Libros_antiguos");
        categoryTitles.add("Libros_austral");
        categoryTitles.add("Liternovela_ex_espanola");
        categoryTitles.add("Losada");
        categoryTitles.add("Lpuerta");
        categoryTitles.add("Lradio");
        categoryTitles.add("Poesia_esp_y_extranjera");
        categoryTitles.add("Psicologia_y_medicina");
        categoryTitles.add("Repes_frances_italoport");
        categoryTitles.add("Restos");
        categoryTitles.add("Salvat_muy_interesante");
        categoryTitles.add("Sexmujer");
        categoryTitles.add("Teoreligion_2");
        categoryTitles.add("Vallad_castilla_leon");
    }

    private static BooksImportUiBinder uiBinder       = GWT.create(BooksImportUiBinder.class);

    interface BooksImportUiBinder extends UiBinder<Widget, BooksImport> {
    }

    @UiField(provided = true)
    Grid                         categories;

    private BooksImportPresenter presenter;

    public BooksImport() {
        final int cols = 6;
        int rows = categoryTitles.size() / cols;
        if (categoryTitles.size() % cols > 0) {
            rows++;
        }

        categories = new Grid(rows, cols);

        initWidget(uiBinder.createAndBindUi(this));

        int i = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                final ToggleButton toggle = new ToggleButton(categoryTitles.get(i++));
                toggle.addClickHandler(new ClickHandler() {

                    @Override
                    public void onClick(final ClickEvent event) {
                        presenter.createBooks(toggle.getText());
                    }
                });
                categories.setWidget(row, col, toggle);
            }
        }

    }

    @Override
    public void setPresenter(final BooksImportPresenter presenter) {
        this.presenter = presenter;
    }

}