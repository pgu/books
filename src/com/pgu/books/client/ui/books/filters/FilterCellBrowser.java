package com.pgu.books.client.ui.books.filters;

import com.google.gwt.user.cellview.client.CellBrowser;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.view.client.TreeViewModel;

public class FilterCellBrowser<T> extends CellBrowser {

    public FilterCellBrowser(final TreeViewModel viewModel, final T rootValue) {
        super(viewModel, rootValue);
    }

    @Override
    public void setDefaultColumnWidth(final int width) {
        super.setDefaultColumnWidth(width);
    }

    public void setFirstColumnWidth(final int width) {
        final SplitLayoutPanel splitPanel = (SplitLayoutPanel) getWidget();
        splitPanel.setWidgetSize(splitPanel.getWidget(0), width);
    }
}
