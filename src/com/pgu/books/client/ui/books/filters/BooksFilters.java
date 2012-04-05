package com.pgu.books.client.ui.books.filters;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class BooksFilters extends Composite {

    private static BooksFiltersUiBinder uiBinder = GWT.create(BooksFiltersUiBinder.class);

    interface BooksFiltersUiBinder extends UiBinder<Widget, BooksFilters> {
    }

    @UiField
    Button           btnApplyFilters;

    @UiField(provided = true)
    StackLayoutPanel stackPanel;

    public BooksFilters() {

        stackPanel = new StackLayoutPanel(Unit.EM);
        stackPanel.setPixelSize(200, 400);

        addAuthorsFilter();
        addEditorsFilter();
        addCategoriesFilter();

        initWidget(uiBinder.createAndBindUi(this));
    }

    private void addCategoriesFilter() {
        final Widget titleFilter = createHeaderWidget("Editor");

        final VerticalPanel titlePanel = new VerticalPanel();
        titlePanel.setSpacing(4);
        for (final String filter : new String[] { "tituloA", "tituloB" }) {
            titlePanel.add(new CheckBox(filter));
        }
        stackPanel.add(new SimplePanel(titlePanel), titleFilter, 4);
    }

    private void addEditorsFilter() {
        final Widget titleFilter = createHeaderWidget("Editor");

        final VerticalPanel titlePanel = new VerticalPanel();
        titlePanel.setSpacing(4);
        for (final String filter : new String[] { "tituloA", "tituloB" }) {
            titlePanel.add(new CheckBox(filter));
        }
        stackPanel.add(new SimplePanel(titlePanel), titleFilter, 4);
    }

    private void addAuthorsFilter() {
        final Widget authorFilter = createHeaderWidget("Autores");

        final VerticalPanel authorPanel = new VerticalPanel();
        authorPanel.setSpacing(4);
        for (final String filter : new String[] { "autorA", "autorB" }) {
            authorPanel.add(new CheckBox(filter));
        }
        stackPanel.add(new SimplePanel(authorPanel), authorFilter, 4);
    }

    private Widget createHeaderWidget(final String text) {

        final HTML headerText = new HTML(text);
        headerText.getElement().getStyle().setFontSize(1.5, Unit.EM);

        final HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.setHeight("100%");
        hPanel.setSpacing(0);
        hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        hPanel.add(headerText);

        return new SimplePanel(hPanel);
    }

    @UiHandler("btnApplyFilters")
    public void applyFilters(final ClickEvent e) {
        GWT.log("apply filters");
    }

}
