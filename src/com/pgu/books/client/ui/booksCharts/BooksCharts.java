package com.pgu.books.client.ui.booksCharts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.visualization.client.AbstractDataTable;
import com.google.gwt.visualization.client.AbstractDataTable.ColumnType;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.Selection;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.gwt.visualization.client.events.SelectHandler;
import com.google.gwt.visualization.client.visualizations.corechart.AreaChart;
import com.google.gwt.visualization.client.visualizations.corechart.BarChart;
import com.google.gwt.visualization.client.visualizations.corechart.ColumnChart;
import com.google.gwt.visualization.client.visualizations.corechart.CoreChart;
import com.google.gwt.visualization.client.visualizations.corechart.CoreChart.Type;
import com.google.gwt.visualization.client.visualizations.corechart.LineChart;
import com.google.gwt.visualization.client.visualizations.corechart.Options;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart.PieOptions;
import com.pgu.books.client.activity.booksCharts.BooksChartsPresenter;

public class BooksCharts extends Composite implements BooksChartsUI {

    private static BooksChartsUiBinder uiBinder = GWT.create(BooksChartsUiBinder.class);

    interface BooksChartsUiBinder extends UiBinder<Widget, BooksCharts> {
    }

    @UiField
    HTMLPanel                                              charts;

    @UiField
    RadioButton                                            btnArea, btnBar, btnColumn, btnLine, btnPie;

    private boolean                                        isVisuApiLoaded        = false;
    private boolean                                        isDataLoaded           = false;
    private Timer                                          timerForLoadingVisuApi = null;

    private BooksChartsPresenter                           presenter;
    private final HashMap<CoreChart.Type, HorizontalPanel> type2charts            = new HashMap<CoreChart.Type, HorizontalPanel>();

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

            timerForLoadingVisuApi = new Timer() {
                @Override
                public void run() {
                    initCharts();
                }
            };

            timerForLoadingVisuApi.schedule(500);
            return;

        } else {
            timerForLoadingVisuApi = null;
        }

        if (!isDataLoaded) {
            presenter.fetchData();
            return;
        }

        // TODO PGU review the flow
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
                .headerValue("Nb books") //
                .data(categoryData);

        final ChartConfig editorConfig = new ChartConfig() //
                .title("Books repartition by editors") //
                .headerKey("Editors") //
                .headerValue("Nb books") //
                .data(editorData);

        createAreaCharts(categoryConfig, editorConfig);
        createBarCharts(categoryConfig, editorConfig);
        createColumnCharts(categoryConfig, editorConfig);
        createLineCharts(categoryConfig, editorConfig);
        createPieCharts(categoryConfig, editorConfig);

        isDataLoaded = true;
    }

    private void createLineCharts(final ChartConfig... chartConfigs) {
        final HorizontalPanel hp = new HorizontalPanel();
        hp.setVisible(false);

        for (final ChartConfig chartConfig : chartConfigs) {
            final LineChart chart = new LineChart(createTable(chartConfig), createOptions(chartConfig));
            chart.addSelectHandler(createSelectHandler(chart));
            hp.add(chart);
        }
        charts.add(hp);
        type2charts.put(Type.LINE, hp);
    }

    private void createColumnCharts(final ChartConfig... chartConfigs) {
        final HorizontalPanel hp = new HorizontalPanel();
        hp.setVisible(false);

        for (final ChartConfig chartConfig : chartConfigs) {
            final ColumnChart chart = new ColumnChart(createTable(chartConfig), createOptions(chartConfig));
            chart.addSelectHandler(createSelectHandler(chart));
            hp.add(chart);
        }
        charts.add(hp);
        type2charts.put(Type.COLUMNS, hp);
    }

    private void createBarCharts(final ChartConfig... chartConfigs) {
        final HorizontalPanel hp = new HorizontalPanel();
        hp.setVisible(false);

        for (final ChartConfig chartConfig : chartConfigs) {
            final BarChart chart = new BarChart(createTable(chartConfig), createOptions(chartConfig));
            chart.addSelectHandler(createSelectHandler(chart));
            hp.add(chart);
        }
        charts.add(hp);
        type2charts.put(Type.BARS, hp);
    }

    private void createAreaCharts(final ChartConfig... chartConfigs) {
        final HorizontalPanel hp = new HorizontalPanel();
        hp.setVisible(false);

        for (final ChartConfig chartConfig : chartConfigs) {
            final AreaChart chart = new AreaChart(createTable(chartConfig), createOptions(chartConfig));
            chart.addSelectHandler(createSelectHandler(chart));
            hp.add(chart);
        }
        charts.add(hp);
        type2charts.put(Type.AREA, hp);
    }

    private Options createOptions(final ChartConfig chartConfig) {
        final Options options = Options.create();
        options.setWidth(400);
        options.setHeight(240);
        options.setTitle(chartConfig.getTitle());
        return options;
    }

    private void createPieCharts(final ChartConfig... chartConfigs) {
        final HorizontalPanel hp = new HorizontalPanel();
        hp.setVisible(true);

        for (final ChartConfig chartConfig : chartConfigs) {
            final PieChart chart = new PieChart(createTable(chartConfig), createPieOptions(chartConfig));
            chart.addSelectHandler(createSelectHandler(chart));
            hp.add(chart);
        }
        charts.add(hp);
        type2charts.put(Type.PIE, hp);
    }

    private PieOptions createPieOptions(final ChartConfig chartConfig) {
        final PieOptions options = PieOptions.create();
        options.setWidth(400);
        options.setHeight(240);
        options.set3D(true);
        options.setTitle(chartConfig.getTitle());
        return options;
    }

    private static final int COL_NAME  = 0;
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

    private SelectHandler createSelectHandler(final CoreChart chart) {
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

    @UiHandler("btnArea")
    public void clickBtnArea(final ClickEvent click) {
        clickBtnChart(CoreChart.Type.AREA);
    }

    public void clickBtnChart(final CoreChart.Type chartType) {
        for (final Entry<Type, HorizontalPanel> e : type2charts.entrySet()) {
            e.getValue().setVisible(e.getKey() == chartType);
        }
    }

    @UiHandler("btnBar")
    public void clickBtnBar(final ClickEvent click) {
        clickBtnChart(CoreChart.Type.BARS);
    }

    @UiHandler("btnColumn")
    public void clickBtnColumn(final ClickEvent click) {
        clickBtnChart(CoreChart.Type.COLUMNS);
    }

    @UiHandler("btnLine")
    public void clickBtnLine(final ClickEvent click) {
        clickBtnChart(CoreChart.Type.LINE);
    }

    @UiHandler("btnPie")
    public void clickBtnPie(final ClickEvent click) {
        clickBtnChart(CoreChart.Type.PIE);
    }

}
