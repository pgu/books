package com.pgu.books.client.ui.books.filters;

import java.util.HashMap;
import java.util.List;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.TreeViewModel;
import com.pgu.books.client.activity.books.filters.BooksFiltersPresenter;
import com.pgu.books.client.ui.books.filters.BooksFilters.FilterType;

public class FilterTreeViewModel implements TreeViewModel {

    private final ListDataProvider<Letter> letters = new ListDataProvider<Letter>();

    private final FilterType               filter;
    private BooksFiltersPresenter          presenter;

    public void setPresenter(final BooksFiltersPresenter presenter) {
        this.presenter = presenter;
    }

    public FilterTreeViewModel(final FilterType filter) {
        this.filter = filter;

        final List<Letter> letters = this.letters.getList();
        for (char i = 'A'; i <= 'Z'; i++) {
            letters.add(new Letter(Character.toString(i)));
        }
    }

    public static class LetterCell extends AbstractCell<Letter> {

        @Override
        public void render(final com.google.gwt.cell.client.Cell.Context context, final Letter value,
                final SafeHtmlBuilder sb) {
            sb.appendEscaped(new CheckBox(value.getValue()).getHTML());
        }

    }

    public static class FilterCell extends AbstractCell<FilterValue> {

        @Override
        public void render(final com.google.gwt.cell.client.Cell.Context context, final FilterValue value,
                final SafeHtmlBuilder sb) {
            // TODO PGU composite cell with a checkboxcell
            sb.appendEscaped(value.getValue());
        }

    }

    private final HashMap<Letter, ListDataProvider<FilterValue>> cache = new HashMap<Letter, ListDataProvider<FilterValue>>();

    @Override
    public <T> NodeInfo<?> getNodeInfo(final T value) {
        if (value == null) {
            updateCountByLetters();
            return new DefaultNodeInfo<Letter>(letters, new LetterCell());

        } else if (value instanceof Letter) {

            if (cache.containsKey(value)) {
                return new DefaultNodeInfo<FilterValue>(cache.get(value), new FilterCell());

            } else {
                final ListDataProvider<FilterValue> filterValues = new ListDataProvider<FilterValue>();
                updateFilters(filterValues.getList(), (Letter) value);
                return new DefaultNodeInfo<FilterValue>(filterValues, new FilterCell());
            }

        } else if (value instanceof FilterValue) {
            return null;
        }
        return null;
    }

    private void updateFilters(final List<FilterValue> values, final Letter letter) {

        if (FilterType.AUTHOR == filter) {
            presenter.fetchAuthorsByLetter(letter.getValue(), values);

        } else if (FilterType.EDITOR == filter) {
            presenter.fetchEditorsByLetter(letter.getValue(), values);

        } else if (FilterType.CATEGORY == filter) {
            presenter.fetchCategoriesByLetter(letter.getValue(), values);

        } else {
            throw new UnsupportedOperationException("Filter not handled: " + filter);
        }

    }

    private void updateCountByLetters() {
        if (FilterType.AUTHOR == filter) {
            presenter.countAuthorsByLetters();

        } else if (FilterType.EDITOR == filter) {
            presenter.countEditorsByLetters();

        } else if (FilterType.CATEGORY == filter) {
            presenter.countCategoriesByLetters();

        } else {
            throw new UnsupportedOperationException("Filter not handled: " + filter);
        }
    }

    @Override
    public boolean isLeaf(final Object value) {
        if (value instanceof FilterValue) {
            return true;
        }

        return false;
    }

}
