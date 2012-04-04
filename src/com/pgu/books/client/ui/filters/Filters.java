package com.pgu.books.client.ui.filters;

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

public class Filters extends Composite {

    private static FiltersUiBinder uiBinder = GWT.create(FiltersUiBinder.class);

    interface FiltersUiBinder extends UiBinder<Widget, Filters> {
    }

    @UiField
    Button applyFilters;

    @UiField(provided = true)
    StackLayoutPanel stackPanel;

    public Filters() {

        stackPanel = new StackLayoutPanel(Unit.EM);
        stackPanel.setPixelSize(200, 400);

        final Widget autorFilter = createHeaderWidget("Autores");

        final VerticalPanel authorPanel = new VerticalPanel();
        authorPanel.setSpacing(4);
        for (final String filter : new String[] { "autorA", "autorB" }) {
            authorPanel.add(new CheckBox(filter));
        }
        stackPanel.add(new SimplePanel(authorPanel), autorFilter, 4);

        // ///////
        final Widget titleFilter = createHeaderWidget("Titulos");

        final VerticalPanel titlePanel = new VerticalPanel();
        titlePanel.setSpacing(4);
        for (final String filter : new String[] { "tituloA", "tituloB" }) {
            titlePanel.add(new CheckBox(filter));
        }
        stackPanel.add(new SimplePanel(titlePanel), titleFilter, 4);

        initWidget(uiBinder.createAndBindUi(this));
    }

    private Widget createHeaderWidget(final String text) {
        final HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.setHeight("100%");
        hPanel.setSpacing(0);
        hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        final HTML headerText = new HTML(text);
        hPanel.add(headerText);
        return new SimplePanel(hPanel);
    }

    @UiHandler("applyFilters")
    public void applyFilters(final ClickEvent e) {
        GWT.log("apply filters");
    }

}
