package com.pgu.books.client.ui.books.filters;

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
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.pgu.books.client.activity.books.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.utils.FilterType;

public class BooksFilters extends Composite {

    private static BooksFiltersUiBinder uiBinder = GWT.create(BooksFiltersUiBinder.class);

    interface BooksFiltersUiBinder extends UiBinder<Widget, BooksFilters> {
    }

    @UiField
    Button btnApplyFilters;

    @UiField(provided = true)
    StackLayoutPanel stackPanel;

    private final FilterCellBrowser<String> authors;
    private final FilterCellBrowser<String> editors;
    private final FilterCellBrowser<String> categories;

    private final FilterTreeViewModel authorTVM = new FilterTreeViewModel(FilterType.AUTHOR);
    private final FilterTreeViewModel editorTVM = new FilterTreeViewModel(FilterType.EDITOR);
    private final FilterTreeViewModel categoryTVM = new FilterTreeViewModel(FilterType.CATEGORY);

    private final String authorTitle = "Autores";
    private final String editorTitle = "Editores";
    private final String categoryTitle = "Categorías";

    private final HTML authorHeader = new HTML(authorTitle);
    private final HTML editorHeader = new HTML(editorTitle);
    private final HTML categoryHeader = new HTML(categoryTitle);

    private BooksFiltersPresenter presenter;

    public BooksFilters() {

        stackPanel = new StackLayoutPanel(Unit.EM);
        stackPanel.setPixelSize(350, 550);

        authors = new FilterCellBrowser<String>(authorTVM, null);
        editors = new FilterCellBrowser<String>(editorTVM, null);
        categories = new FilterCellBrowser<String>(categoryTVM, null);

        addFilter(authors, authorHeader);
        addFilter(editors, editorHeader);
        addFilter(categories, categoryHeader);

        final MultiSelectionModel<FilterValue> authorSelectionModel = new MultiSelectionModel<FilterValue>();
        final MultiSelectionModel<FilterValue> editorSelectionModel = new MultiSelectionModel<FilterValue>();
        final MultiSelectionModel<FilterValue> categorySelectionModel = new MultiSelectionModel<FilterValue>();

        authorSelectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {

            @Override
            public void onSelectionChange(final SelectionChangeEvent event) {

                final Set<FilterValue> selectedFVs = authorSelectionModel.getSelectedSet();

                final int nbFilters = selectedFVs.size();
                if (nbFilters == 0) {
                    authorHeader.setText(authorTitle);
                } else {
                    authorHeader.setText(authorTitle + " (" + nbFilters + ")");
                }

                final List<FilterValue> selecteds = new ArrayList<FilterValue>(selectedFVs);
                Collections.sort(selecteds);

                final StringBuilder sb = new StringBuilder();
                for (final FilterValue filterValue : selecteds) {
                    sb.append(filterValue.getValue());
                    sb.append("\n");
                }
                authorHeader.setTitle(sb.toString());
            }
        });

        authorTVM.setSelectionModel(authorSelectionModel);
        editorTVM.setSelectionModel(editorSelectionModel);
        categoryTVM.setSelectionModel(categorySelectionModel);

        initWidget(uiBinder.createAndBindUi(this));

    }

    private void addFilter(final FilterCellBrowser<String> container, final HTML header) {
        container.setWidth("100%");
        container.setHeight("356px");
        container.setAnimationEnabled(true);

        container.setFirstColumnWidth(60);
        container.setDefaultColumnWidth(250);

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

        stackPanel.add(new ScrollPanel(vp), createHeader(header), 4);
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

    private Widget createHeader(final HTML headerText) {

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
