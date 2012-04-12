package com.pgu.books.client.ui.books.filters;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellBrowser;
import com.google.gwt.user.client.ui.Button;
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
import com.pgu.books.client.activity.utils.FilterType;

public class BooksFilters extends Composite {

    private static BooksFiltersUiBinder uiBinder = GWT.create(BooksFiltersUiBinder.class);

    interface BooksFiltersUiBinder extends UiBinder<Widget, BooksFilters> {
    }

    @UiField
    Button                            btnApplyFilters;

    @UiField(provided = true)
    StackLayoutPanel                  stackPanel;

    private final CellBrowser         authors;
    private final CellBrowser         editors;
    private final CellBrowser         categories;

    private final FilterTreeViewModel authorTVM   = new FilterTreeViewModel(FilterType.AUTHOR);
    private final FilterTreeViewModel editorTVM   = new FilterTreeViewModel(FilterType.EDITOR);
    private final FilterTreeViewModel categoryTVM = new FilterTreeViewModel(FilterType.CATEGORY);

    private BooksFiltersPresenter     presenter;

    public BooksFilters() {

        stackPanel = new StackLayoutPanel(Unit.EM);
        stackPanel.setPixelSize(200, 550);

        authors = new CellBrowser(authorTVM, null);
        editors = new CellBrowser(editorTVM, null);
        categories = new CellBrowser(categoryTVM, null);

        addFilter(authors, "Autores");
        addFilter(editors, "Editores");
        addFilter(categories, "Categorías");

        initWidget(uiBinder.createAndBindUi(this));

    }

    private void addFilter(final CellBrowser container, final String title) {
        container.setWidth("100%");
        container.setHeight("200px");
        container.setAnimationEnabled(true);

        final Button btnClear = new Button("Clear");

        addBtnClick(false, container, btnClear);

        final HorizontalPanel btns = new HorizontalPanel();
        btns.setWidth("100%");
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

    private void addBtnClick(final boolean isSelected, final CellBrowser container, final Button btn) {
        btn.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                // TODO PGU
                // for (int i = 0; i < container.getWidgetCount(); i++) {
                // final CheckBox cb = (CheckBox) container.getWidget(i);
                // cb.setValue(isSelected);
                // }
            }
        });
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

        final ArrayList<String> selectedAuthors = getSelectedValues(authors);
        final ArrayList<String> selectedEditors = getSelectedValues(editors);
        final ArrayList<String> selectedCategories = getSelectedValues(categories);

        presenter.fetchBooks(selectedAuthors, selectedEditors, selectedCategories);
    }

    private ArrayList<String> getSelectedValues(final CellBrowser container) {
        final ArrayList<String> selecteds = new ArrayList<String>();
        // TODO PGU
        // for (int i = 0; i < container.getWidgetCount(); i++) {
        // final CheckBox cb = (CheckBox) container.getWidget(i);
        // if (cb.getValue()) {
        // selecteds.add(cb.getText());
        // }
        // }
        return selecteds;
    }

    public void setPresenter(final BooksFiltersPresenter presenter) {
        this.presenter = presenter;
        authorTVM.setPresenter(presenter);
        editorTVM.setPresenter(presenter);
        categoryTVM.setPresenter(presenter);
    }

    public void setCounts(final ArrayList<String> countsByLetters, final FilterType filterType) {

        if (FilterType.AUTHOR == filterType) {
            authorTVM.setCounts(countsByLetters);

        } else if (FilterType.EDITOR == filterType) {
            editorTVM.setCounts(countsByLetters);

        } else if (FilterType.CATEGORY == filterType) {
            categoryTVM.setCounts(countsByLetters);

        }
    }

    public void setFilters(final ArrayList<String> filters, final Letter letter, final FilterType filterType) {

        if (FilterType.AUTHOR == filterType) {
            authorTVM.setFilters(letter, filters);

        } else if (FilterType.EDITOR == filterType) {
            editorTVM.setFilters(letter, filters);

        } else if (FilterType.CATEGORY == filterType) {
            categoryTVM.setFilters(letter, filters);

        }
    }

}
