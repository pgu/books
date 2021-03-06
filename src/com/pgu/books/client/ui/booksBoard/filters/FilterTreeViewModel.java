package com.pgu.books.client.ui.booksBoard.filters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.cell.client.CompositeCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.HasCell;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.view.client.DefaultSelectionEventManager;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.TreeViewModel;
import com.pgu.books.client.activity.booksBoard.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.utils.FilterType;

public class FilterTreeViewModel implements TreeViewModel {

    private FilterType filterType;
    private BooksFiltersPresenter presenter;

    private final Cell<FilterValue> filterValueCell;

    private final DefaultSelectionEventManager<FilterValue> selectionManager = DefaultSelectionEventManager
            .createCheckboxManager();
    private MultiSelectionModel<FilterValue> selectionModel;

    public FilterTreeViewModel(final FilterType filterType) {
        this.filterType = filterType;

        final List<HasCell<FilterValue, ?>> hasCells = new ArrayList<HasCell<FilterValue, ?>>();
        hasCells.add(new HasCell<FilterValue, Boolean>() {

            private final CheckboxCell cell = new CheckboxCell(true, false);

            @Override
            public Cell<Boolean> getCell() {
                return cell;
            }

            @Override
            public FieldUpdater<FilterValue, Boolean> getFieldUpdater() {
                return null;
            }

            @Override
            public Boolean getValue(final FilterValue filterValue) {
                return selectionModel.isSelected(filterValue);
            }
        });
        hasCells.add(new HasCell<FilterValue, FilterValue>() {

            @Override
            public Cell<FilterValue> getCell() {
                return new FilterCell();
            }

            @Override
            public FieldUpdater<FilterValue, FilterValue> getFieldUpdater() {
                return null;
            }

            @Override
            public FilterValue getValue(final FilterValue object) {
                return object;
            }
        });
        filterValueCell = new CompositeCell<FilterValue>(hasCells) {
            @Override
            public void render(final Context context, final FilterValue value, final SafeHtmlBuilder sb) {
                sb.appendHtmlConstant("<table><tbody><tr>");
                super.render(context, value, sb);
                sb.appendHtmlConstant("</tr></tbody></table>");
            }

            @Override
            protected Element getContainerElement(final Element parent) {
                // Return the first TR element in the table.
                return parent.getFirstChildElement().getFirstChildElement().getFirstChildElement();
            }

            @Override
            protected <X> void render(final Context context, final FilterValue value, final SafeHtmlBuilder sb,
                    final HasCell<FilterValue, X> hasCell) {

                final Cell<X> cell = hasCell.getCell();
                sb.appendHtmlConstant("<td>");

                cell.render(context, hasCell.getValue(value), sb);
                sb.appendHtmlConstant("</td>");
            }
        };
    }

    public void setPresenter(final BooksFiltersPresenter presenter) {
        this.presenter = presenter;
    }

    public static class LetterCell extends AbstractCell<Letter> {

        @Override
        public void render(final com.google.gwt.cell.client.Cell.Context context, final Letter value,
                final SafeHtmlBuilder sb) {
            sb.appendEscaped(value.getLabel());
        }

    }

    public static class FilterCell extends AbstractCell<FilterValue> {

        @Override
        public void render(final com.google.gwt.cell.client.Cell.Context context, final FilterValue value,
                final SafeHtmlBuilder sb) {
            sb.appendEscaped(value.getValue());
        }

    }

    private final HashMap<Letter, ListDataProvider<FilterValue>> cache = new HashMap<Letter, ListDataProvider<FilterValue>>();
    private final ListDataProvider<Letter> letters = new ListDataProvider<Letter>();

    @Override
    public <T> NodeInfo<?> getNodeInfo(final T value) {
        if (value == null) {
            return new DefaultNodeInfo<Letter>(letters, new LetterCell());

        } else if (value instanceof Letter) {

            final Letter letter = (Letter) value;
            if (!letter.hasBeenFetched()) {
                presenter.fetchFiltersByLetter(letter, filterType);
            }
            return new DefaultNodeInfo<FilterValue>(cache.get(letter), filterValueCell, selectionModel,
                    selectionManager, null);

        }
        return null;
    }

    @Override
    public boolean isLeaf(final Object value) {
        return value instanceof FilterValue;
    }

    public void setCounts(final ArrayList<String> countsByLetters) {
        for (final String count : countsByLetters) {
            final Letter letter = new Letter().label(count);
            letters.getList().add(letter);
            cache.put(letter, new ListDataProvider<FilterValue>());
        }
    }

    public void setFilters(final Letter letter, final ArrayList<String> filters) {

        final List<FilterValue> filterValues = cache.get(letter).getList();
        for (final String filter : filters) {
            filterValues.add(new FilterValue(filter));
        }

        letter.setHasBeenFetched(true);
    }

    public void setSelectionModel(final MultiSelectionModel<FilterValue> selectionModel) {
        this.selectionModel = selectionModel;
    }

}
