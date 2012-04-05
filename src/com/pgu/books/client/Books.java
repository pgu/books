package com.pgu.books.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.gwt.visualization.client.visualizations.corechart.CoreChart;
import com.pgu.books.client.activity.dashboard.DashboardActivity;
import com.pgu.books.client.ui.Dashboard;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Books implements EntryPoint {

    public static final String TAG_BOOKS  = "books";
    public static final String TAG_CHARTS = "charts";
    public static final String TAG_IMPORT = "import";

    @Override
    public void onModuleLoad() {

        //
        // UI
        final Dashboard dashboard = DashboardActivity.INSTANCE.start();
        RootPanel.get().add(dashboard);

        //
        // history
        final String initToken = History.getToken();
        if (initToken.isEmpty()) {
            History.newItem(TAG_BOOKS);
        }

        History.addValueChangeHandler(new ValueChangeHandler<String>() {

            @Override
            public void onValueChange(final ValueChangeEvent<String> event) {
                final String tag = event.getValue();

                if (TAG_BOOKS.equals(tag)) {
                    dashboard.showBooks();

                } else if (TAG_CHARTS.equals(tag)) {
                    dashboard.showCharts();

                } else if (TAG_IMPORT.equals(tag)) {
                    dashboard.showImport();

                } else {
                    GWT.log("other tag [" + tag + "]");
                }
            }
        });
        History.fireCurrentHistoryState();

        //
        // charts
        final Runnable onLoadCallback = new Runnable() {
            @Override
            public void run() {
                DashboardActivity.INSTANCE.buildCharts();
            }
        };

        VisualizationUtils.loadVisualizationApi(onLoadCallback, CoreChart.PACKAGE);
    }
}
