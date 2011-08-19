package com.pgu.books.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Books implements EntryPoint {
    private final BookServiceAsync bookService = GWT.create(BookService.class);

    @Override
    public void onModuleLoad() {
        final Button btn = new Button("Generate");
        final ListBox categories = new ListBox();
        RootPanel.get().add(categories);
        RootPanel.get().add(btn);

        btn.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                final String cat = categories.getValue(categories.getSelectedIndex());
                bookService.createBooks(cat, new AsyncCallback<Void>() {

                    @Override
                    public void onFailure(final Throwable caught) {
                    }

                    @Override
                    public void onSuccess(final Void result) {
                        Window.alert("done for " + cat);
                    }
                });
            }
        });

        categories.addItem("Adonais_poesia");
        categories.addItem("Arte_historia_musica");
        categories.addItem("Biblioteca_el_sol");
        categories.addItem("Budismagibrujocult");
        categories.addItem("Errores_de_pegado");
        categories.addItem("Filocont_2");
        categories.addItem("Filoespanola");
        categories.addItem("Filoextranjera");
        categories.addItem("Fsillon");
        categories.addItem("Galicia_ling_miscelanea");
        categories.addItem("Libros_antiguos");
        categories.addItem("Libros_austral");
        categories.addItem("Liternovela_ex_espanola");
        categories.addItem("Losada");
        categories.addItem("Lpuerta");
        categories.addItem("Lradio");
        categories.addItem("Poesia_esp_y_extranjera");
        categories.addItem("Psicologia_y_medicina");
        categories.addItem("Repes_frances_italoport");
        categories.addItem("Restos");
        categories.addItem("Salvat_muy_interesante");
        categories.addItem("Sexmujer");
        categories.addItem("Teoreligion_2");
        categories.addItem("Vallad_castilla_leon");

    }
}
