package com.pgu.books.client.ui.booksCharts;

import java.util.Map.Entry;
import java.util.TreeMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.visualization.client.AbstractDataTable;
import com.google.gwt.visualization.client.AbstractDataTable.ColumnType;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.Selection;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.gwt.visualization.client.events.SelectHandler;
import com.google.gwt.visualization.client.visualizations.corechart.CoreChart;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart.PieOptions;
import com.pgu.books.client.activity.booksCharts.BooksChartsPresenter;

public class BooksCharts extends Composite implements BooksChartsUI {

    private static BooksChartsUiBinder uiBinder = GWT.create(BooksChartsUiBinder.class);

    interface BooksChartsUiBinder extends UiBinder<Widget, BooksCharts> {
    }

    @UiField
    HTMLPanel charts;

    private boolean isVisuApiLoaded = false;
    private boolean isDataLoaded = false;

    private BooksChartsPresenter presenter;

    @Override
    public void setPresenter(final BooksChartsPresenter presenter) {
        this.presenter = presenter;
    }

    public BooksCharts() {

        final Runnable onLoadCallback = new Runnable() {
            @Override
            public void run() {
                isVisuApiLoaded = true;
            }
        };

        VisualizationUtils.loadVisualizationApi(onLoadCallback, CoreChart.PACKAGE);

        initWidget(uiBinder.createAndBindUi(this));
    }

    // http://code.google.com/p/gwt-google-apis/wiki/VisualizationGettingStarted
    private void initCharts() {
        if (!isVisuApiLoaded) {
            Window.alert("Visu api is still not loaded :-/");
            return;
        }

        if (!isDataLoaded) {
            presenter.fetchData();
            return;
        }

        buildCharts();
    }

    @Override
    public void buildCharts() {

        if (isDataLoaded) {
            return;
        }

        final TreeMap<String, Integer> categoryData = new TreeMap<String, Integer>();
        categoryData.put("Category A", 10);
        categoryData.put("Category B", 20);
        categoryData.put("Category C", 15);

        final TreeMap<String, Integer> editorData = new TreeMap<String, Integer>();
        editorData.put("Editor A", 100);
        editorData.put("Editor B", 200);
        editorData.put("Editor C", 150);

        final ChartConfig categoryConfig = new ChartConfig() //
                .title("Books repartition by categories") //
                .headerKey("Categories") //
                .headerValue("Books per category") //
                .data(categoryData);

        final ChartConfig editorConfig = new ChartConfig() //
                .title("Books repartition by editors") //
                .headerKey("Editors") //
                .headerValue("Books per editor") //
                .data(editorData);

        createPieCharts(categoryConfig, editorConfig);

        isDataLoaded = true;
    }

    private void createPieCharts(final ChartConfig... chartConfigs) {
        final HorizontalPanel chartsContainer = new HorizontalPanel();

        for (final ChartConfig chartConfig : chartConfigs) {

            final PieChart pieChart = new PieChart(createTable(chartConfig), createOptions(chartConfig));
            pieChart.addSelectHandler(createSelectHandler(pieChart));

            chartsContainer.add(pieChart);
        }
        charts.add(chartsContainer);
    }

    private static final int COL_NAME = 0;
    private static final int COL_VALUE = 1;

    private AbstractDataTable createTable(final ChartConfig chartConfig) {

        final DataTable table = DataTable.create();
        table.addColumn(ColumnType.STRING, chartConfig.getHeader1());
        table.addColumn(ColumnType.NUMBER, chartConfig.getHeader2());

        final TreeMap<String, Integer> data = chartConfig.getData();
        table.addRows(data.size());

        int row = 0;
        for (final Entry<String, Integer> e : data.entrySet()) {
            table.setValue(row, COL_NAME, e.getKey());
            table.setValue(row, COL_VALUE, e.getValue());
            row++;
        }
        return table;
    }

    private PieOptions createOptions(final ChartConfig chartConfig) {
        final PieOptions options = PieOptions.create();
        options.setWidth(400);
        options.setHeight(240);
        options.set3D(true);
        options.setTitle(chartConfig.getTitle());
        return options;
    }

    private SelectHandler createSelectHandler(final PieChart chart) {
        return new SelectHandler() {
            @Override
            public void onSelect(final SelectEvent event) {
                String message = "";

                // May be multiple selections.
                final JsArray<Selection> selections = chart.getSelections();

                for (int i = 0; i < selections.length(); i++) {
                    // add a new line for each selection
                    message += i == 0 ? "" : "\n";

                    final Selection selection = selections.get(i);

                    if (selection.isCell()) {
                        // isCell() returns true if a cell has been selected.

                        // getRow() returns the row number of the selected cell.
                        final int row = selection.getRow();
                        // getColumn() returns the column number of the selected cell.
                        final int column = selection.getColumn();
                        message += "cell " + row + ":" + column + " selected";
                    } else if (selection.isRow()) {
                        // isRow() returns true if an entire row has been selected.

                        // getRow() returns the row number of the selected row.
                        final int row = selection.getRow();
                        message += "row " + row + " selected";
                    } else {
                        // unreachable
                        message += "Pie chart selections should be either row selections or cell selections.";
                        message += "  Other visualizations support column selections as well.";
                    }
                }

                Window.alert(message);
            }
        };
    }

    @Override
    public void startFocus() {
        initCharts();
        setVisible(true);
    }

    @Override
    public void loseFocus() {
        setVisible(false);
    }

}
