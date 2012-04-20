package com.pgu.books.client.ui.booksBoard.filters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.pgu.books.client.activity.booksBoard.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.utils.FilterType;

public class BooksFilters extends Composite implements BooksFiltersUI {

    private static BooksFiltersUiBinder uiBinder = GWT.create(BooksFiltersUiBinder.class);

    interface BooksFiltersUiBinder extends UiBinder<Widget, BooksFilters> {
    }

    @UiField
    Button                                         btnApplyFilters;

    @UiField(provided = true)
    StackLayoutPanel                               stackPanel;

    private final FilterCellBrowser<String>        authors;
    private final FilterCellBrowser<String>        editors;
    private final FilterCellBrowser<String>        categories;

    private final FilterTreeViewModel              authorTVM              = new FilterTreeViewModel(FilterType.AUTHOR);
    private final FilterTreeViewModel              editorTVM              = new FilterTreeViewModel(FilterType.EDITOR);
    private final FilterTreeViewModel              categoryTVM            = new FilterTreeViewModel(FilterType.CATEGORY);

    private final String                           authorTitle            = "Autores";
    private final String                           editorTitle            = "Editores";
    private final String                           categoryTitle          = "Categorías";

    private final HTML                             authorHeader           = new HTML(authorTitle);
    private final HTML                             editorHeader           = new HTML(editorTitle);
    private final HTML                             categoryHeader         = new HTML(categoryTitle);

    private final MultiSelectionModel<FilterValue> authorSelectionModel   = new MultiSelectionModel<FilterValue>();
    private final MultiSelectionModel<FilterValue> editorSelectionModel   = new MultiSelectionModel<FilterValue>();
    private final MultiSelectionModel<FilterValue> categorySelectionModel = new MultiSelectionModel<FilterValue>();

    private BooksFiltersPresenter                  presenter;

    public BooksFilters() {

        stackPanel = new StackLayoutPanel(Unit.EM);
        stackPanel.setPixelSize(350, 550);

        authors = new FilterCellBrowser<String>(authorTVM, null);
        editors = new FilterCellBrowser<String>(editorTVM, null);
        categories = new FilterCellBrowser<String>(categoryTVM, null);

        addFilter(authors, authorSelectionModel, authorHeader, authorTitle);
        addFilter(editors, editorSelectionModel, editorHeader, editorTitle);
        addFilter(categories, categorySelectionModel, categoryHeader, categoryTitle);

        addSelectionHandler(authorSelectionModel, authorHeader, authorTitle);
        addSelectionHandler(editorSelectionModel, editorHeader, editorTitle);
        addSelectionHandler(categorySelectionModel, categoryHeader, categoryTitle);

        authorTVM.setSelectionModel(authorSelectionModel);
        editorTVM.setSelectionModel(editorSelectionModel);
        categoryTVM.setSelectionModel(categorySelectionModel);

        initWidget(uiBinder.createAndBindUi(this));

    }

    private void addSelectionHandler(final MultiSelectionModel<FilterValue> selectionModel, final HTML header,
            final String title) {

        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {

            @Override
            public void onSelectionChange(final SelectionChangeEvent event) {

                final Set<FilterValue> selectedFVs = selectionModel.getSelectedSet();

                final int nbFilters = selectedFVs.size();
                if (nbFilters == 0) {
                    header.setText(title);
                } else {
                    header.setText(title + " (" + nbFilters + ")");
                }

                final List<FilterValue> selecteds = new ArrayList<FilterValue>(selectedFVs);
                Collections.sort(selecteds);

                final StringBuilder sb = new StringBuilder();
                for (final FilterValue filterValue : selecteds) {
                    sb.append(filterValue.getValue());
                    sb.append("\n");
                }
                header.setTitle(sb.toString());
            }
        });
    }

    private void addFilter(final FilterCellBrowser<String> container,
            final MultiSelectionModel<FilterValue> selectionModel, final HTML header, final String title) {

        container.setWidth("100%");
        container.setHeight("356px");
        container.setAnimationEnabled(true);

        container.setFirstColumnWidth(100);
        container.setDefaultColumnWidth(220);

        final Button btnClear = new Button("Clear");
        btnClear.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(final ClickEvent event) {
                header.setText(title);
                for (final FilterValue filterValue : selectionModel.getSelectedSet()) {
                    selectionModel.setSelected(filterValue, false);
                }
            }
        });

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

        stackPanel.add(new ScrollPanel(vp), createHeader(header), 4);
    }

    private Widget createHeader(final HTML headerText) {

        headerText.getElement().getStyle().setFontSize(1.5, Unit.EM);

        final HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.setHeight("100%");
        hPanel.setWidth("100%");
        hPanel.setSpacing(0);
        hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        hPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        hPanel.add(headerText);

        return new SimplePanel(hPanel);
    }

    @UiHandler("btnApplyFilters")
    public void applyFilters(final ClickEvent e) {

        final ArrayList<String> selectedAuthors = getSelectedValues(authorSelectionModel);
        final ArrayList<String> selectedEditors = getSelectedValues(editorSelectionModel);
        final ArrayList<String> selectedCategories = getSelectedValues(categorySelectionModel);

        presenter.fetchBooks(selectedAuthors, selectedEditors, selectedCategories);
    }

    private ArrayList<String> getSelectedValues(final MultiSelectionModel<FilterValue> selectionModel) {
        final ArrayList<String> selecteds = new ArrayList<String>();
        for (final FilterValue filterValue : selectionModel.getSelectedSet()) {
            selecteds.add(filterValue.getValue());
        }
        return selecteds;
    }

    @Override
    public void setPresenter(final BooksFiltersPresenter presenter) {
        this.presenter = presenter;
        authorTVM.setPresenter(presenter);
        editorTVM.setPresenter(presenter);
        categoryTVM.setPresenter(presenter);
    }

    @Override
    public void setCounts(final ArrayList<String> countsByLetters, final FilterType filterType) {

        if (FilterType.AUTHOR == filterType) {
            authorTVM.setCounts(countsByLetters);

        } else if (FilterType.EDITOR == filterType) {
            editorTVM.setCounts(countsByLetters);

        } else if (FilterType.CATEGORY == filterType) {
            categoryTVM.setCounts(countsByLetters);

        }
    }

    @Override
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
