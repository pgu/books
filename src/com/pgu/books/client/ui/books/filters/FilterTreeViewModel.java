package com.pgu.books.client.ui.books.filters;

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
import com.google.gwt.view.client.SelectionModel;
import com.google.gwt.view.client.TreeViewModel;
import com.pgu.books.client.activity.books.filters.BooksFiltersPresenter;
import com.pgu.books.client.ui.books.filters.BooksFilters.FilterType;

public class FilterTreeViewModel implements TreeViewModel {

    private final FilterType                                filter;
    private BooksFiltersPresenter                           presenter;

    private final Cell<FilterValue>                         filterValueCell;
    private final DefaultSelectionEventManager<FilterValue> selectionManager = DefaultSelectionEventManager
                                                                                     .createCheckboxManager();
    private final SelectionModel<FilterValue>               selectionModel   = new MultiSelectionModel<FilterValue>();

    public FilterTreeViewModel(final FilterType filter) {
        this.filter = filter;

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
            public Boolean getValue(final FilterValue object) {
                return selectionModel.isSelected(object);
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
            sb.appendEscaped(value.getValue());
        }

    }

    public static class FilterCell extends AbstractCell<FilterValue> {

        @Override
        public void render(final com.google.gwt.cell.client.Cell.Context context, final FilterValue value,
                final SafeHtmlBuilder sb) {
            sb.appendEscaped(value.getValue());
        }

    }

    private final HashMap<Letter, ListDataProvider<FilterValue>> cache   = new HashMap<Letter, ListDataProvider<FilterValue>>();
    private final ListDataProvider<Letter>                       letters = new ListDataProvider<Letter>();

    @Override
    public <T> NodeInfo<?> getNodeInfo(final T value) {
        if (value == null) {
            return new DefaultNodeInfo<Letter>(letters, new LetterCell());

        } else if (value instanceof Letter) {

            final Letter letter = (Letter) value;
            if (!letter.hasBeenFetched()) {
                presenter.fetchAuthorsByLetterNew(letter.getValue());
            }
            return new DefaultNodeInfo<FilterValue>(cache.get(letter), filterValueCell, selectionModel,
                    selectionManager, null);

            // } else {
            // final ListDataProvider<FilterValue> filterValues = new ListDataProvider<FilterValue>();
            // updateFilters(filterValues.getList(), (Letter) value);
            // return new DefaultNodeInfo<FilterValue>(filterValues, filterValueCell, selectionModel,
            // selectionManager, null);
            // }

        }
        return null;
    }

    private void updateFilters(final List<FilterValue> values, final Letter letter) {

        if (isAuthor()) {
            presenter.fetchAuthorsByLetter(letter.getValue(), values);

        } else if (isEditor()) {
            presenter.fetchEditorsByLetter(letter.getValue(), values);

        } else if (isCategory()) {
            presenter.fetchCategoriesByLetter(letter.getValue(), values);

        } else {
            throw new UnsupportedOperationException("Filter not handled: " + filter);
        }

    }

    private void updateCountByLetters() {
        if (isAuthor()) {

        } else if (isEditor()) {
            presenter.countEditorsByLetters(letters.getList());

        } else if (isCategory()) {
            presenter.countCategoriesByLetters(letters.getList());

        } else {
            throw new UnsupportedOperationException("Filter not handled: " + filter);
        }
    }

    private boolean isCategory() {
        return FilterType.CATEGORY == filter;
    }

    private boolean isEditor() {
        return FilterType.EDITOR == filter;
    }

    private boolean isAuthor() {
        return FilterType.AUTHOR == filter;
    }

    @Override
    public boolean isLeaf(final Object value) {
        return value instanceof FilterValue;
    }

    public void setCounts(final ArrayList<String> countsByLetters) {
        for (final String count : countsByLetters) {
            final Letter letter = new Letter(count);
            letters.getList().add(letter);
            cache.put(letter, new ListDataProvider<FilterValue>());
        }
    }

    public void setFilters(final String letter, final ArrayList<String> filters) {
        Letter currentLetter = null;
        for (final Letter let : cache.keySet()) {
            if (letter.equals(let.getValue())) {
                currentLetter = let;
                break;
            }
        }

        final List<FilterValue> filterValues = cache.get(currentLetter).getList();
        for (final String filter : filters) {
            filterValues.add(new FilterValue(filter));
        }

        currentLetter.setHasBeenFetched(true);
    }

}
