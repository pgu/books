package com.pgu.books.client.ui.books.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CellPanel;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.activity.books.filters.BooksFiltersPresenter;

public class BooksFilters extends Composite {

    private static BooksFiltersUiBinder uiBinder = GWT.create(BooksFiltersUiBinder.class);

    interface BooksFiltersUiBinder extends UiBinder<Widget, BooksFilters> {
    }

    @UiField
    Button btnApplyFilters;

    @UiField(provided = true)
    StackLayoutPanel stackPanel;

    private final VerticalPanel authors = new VerticalPanel();
    private final VerticalPanel editors = new VerticalPanel();
    private final VerticalPanel categories = new VerticalPanel();

    private BooksFiltersPresenter presenter;

    public BooksFilters() {

        stackPanel = new StackLayoutPanel(Unit.EM);
        stackPanel.setPixelSize(200, 550);

        addFilter(authors, "Autores");
        addFilter(editors, "Editores");
        addFilter(categories, "Categorías");

        initWidget(uiBinder.createAndBindUi(this));

        fillFilter(Arrays.asList( //
                "Angel Crespo", "MiguelTorga", "Pierre Emmanuel", "Saint John Perse", "AutorA", "AutorB", //
                "AutorA", "AutorB", "AutorA", "AutorB", "AutorA", "AutorB", //
                "AutorA", "AutorB", "AutorA", "AutorB", "AutorA", "AutorB", //
                "AutorA", "AutorB", "AutorA", "AutorB", "AutorA", "AutorB", //
                "AutorA", "AutorB", "AutorA", "AutorB", "AutorA", "AutorB", //
                "AutorA", "AutorB", "AutorA", "AutorB", "AutorA", "AutorB" //
        ), authors);
        fillFilter(Arrays.asList("EditorA", "EditorB"), editors);
        fillFilter(Arrays.asList("CategoríaA", "CategoríaB"), categories);
    }

    private void addFilter(final CellPanel container, final String title) {
        container.setWidth("100%");
        container.setSpacing(4);

        final Button btnAll = new Button("Todos");
        final Button btnClear = new Button("Clear");

        addBtnClick(true, container, btnAll);
        addBtnClick(false, container, btnClear);

        final HorizontalPanel btns = new HorizontalPanel();
        btns.setWidth("100%");
        btns.add(btnAll);
        btns.add(btnClear);

        final DisclosurePanel dp = new DisclosurePanel("selección");
        dp.setWidth("100%");
        dp.add(btns);

        final VerticalPanel vp = new VerticalPanel();
        vp.setWidth("100%");
        vp.add(dp);
        vp.add(container);

        stackPanel.add(new ScrollPanel(vp), createHeader(title), 4);
    }

    private void addBtnClick(final boolean isSelected, final CellPanel container, final Button btn) {
        btn.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                for (int i = 0; i < container.getWidgetCount(); i++) {
                    final CheckBox cb = (CheckBox) container.getWidget(i);
                    cb.setValue(isSelected);
                }
            }
        });
    }

    private void fillFilter(final List<String> values, final CellPanel container) {
        for (final String v : values) {
            final CheckBox cb = new CheckBox(v);
            container.add(cb);
        }
    }

    private Widget createHeader(final String text) {

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

        final ArrayList<String> selectedAuthors = new ArrayList<String>();
        final ArrayList<String> selectedEditors = new ArrayList<String>();
        final ArrayList<String> selectedCategories = new ArrayList<String>();
        // TODO PGU
        presenter.fetchBooks(selectedAuthors, selectedEditors, selectedCategories);
    }

    public void setPresenter(final BooksFiltersPresenter presenter) {
        this.presenter = presenter;
    }

}
