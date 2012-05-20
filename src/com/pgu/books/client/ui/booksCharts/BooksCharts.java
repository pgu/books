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
import com.google.gwt.visualization.client.visualizations.corechart.AxisOptions;
import com.google.gwt.visualization.client.visualizations.corechart.BarChart;
import com.google.gwt.visualization.client.visualizations.corechart.ColumnChart;
import com.google.gwt.visualization.client.visualizations.corechart.ComboChart;
import com.google.gwt.visualization.client.visualizations.corechart.CoreChart;
import com.google.gwt.visualization.client.visualizations.corechart.CoreChart.Type;
import com.google.gwt.visualization.client.visualizations.corechart.LineChart;
import com.google.gwt.visualization.client.visualizations.corechart.Options;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart.PieOptions;
import com.google.gwt.visualization.client.visualizations.corechart.Series;
import com.pgu.books.client.activity.booksCharts.BooksChartsPresenter;
import com.pgu.books.shared.dto.LoginInfo;

public class BooksCharts extends Composite implements BooksChartsUI {

    private static BooksChartsUiBinder uiBinder = GWT.create(BooksChartsUiBinder.class);

    interface BooksChartsUiBinder extends UiBinder<Widget, BooksCharts> {
    }

    @UiField
    HTMLPanel                                              container, charts;

    @UiField
    RadioButton                                            btnArea, btnBar, btnColumn, btnLine, btnPie;

    private boolean                                        isVisuApiLoaded             = false;
    private boolean                                        isNbBooksByCategoriesLoaded = false;
    private boolean                                        isNbBooksByEditorsLoaded    = false;
    private boolean                                        isDataLoaded                = false;
    private Timer                                          timerForLoadingVisuApi      = null;

    private BooksChartsPresenter                           presenter;
    private final HashMap<CoreChart.Type, HorizontalPanel> type2charts                 = new HashMap<CoreChart.Type, HorizontalPanel>();

    @Override
    public void setPresenter(final BooksChartsPresenter presenter) {
        this.presenter = presenter;
    }

    public BooksCharts(final LoginInfo loginInfo) {

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
    private void showCharts() {

        isDataLoaded = isNbBooksByCategoriesLoaded //
                && isNbBooksByEditorsLoaded;
        if (!isDataLoaded) {
            return;
        }

        if (!isVisuApiLoaded) {

            timerForLoadingVisuApi = new Timer() {
                @Override
                public void run() {
                    showCharts();
                }
            };

            timerForLoadingVisuApi.schedule(500);
            return;

        } else {
            timerForLoadingVisuApi = null;
        }

        // TODO PGU bar chart : nb books / author (<!> lots of data or not? for authors with nb books > 1)
        // TODO PGU if get books prices then piles of money, available only for logged admin
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

        createPieCharts(categoryConfig, editorConfig);
        createAreaCharts(categoryConfig, editorConfig);
        createBarCharts(categoryConfig, editorConfig);
        createColumnCharts(categoryConfig, editorConfig);
        createLineCharts(categoryConfig, editorConfig);

        addExtraCharts();
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
        options.setWidth(500);
        options.setHeight(400);
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
                    message += i == 0 ? "" : "<br/>";

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

                GWT.log(message);
            }
        };
    }

    @Override
    public void startFocus() {
        setVisible(true);

        if (!isDataLoaded) {
            presenter.fetchData();
        }
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

    // http://code.google.com/p/gwt-google-apis/source/browse/trunk/visualization/visualization/test/com/google/gwt/visualization/client/CoreComboChartTest.java?r=1958&spec=svn1958
    private void addExtraCharts() {
        // //
        final com.google.gwt.visualization.client.visualizations.corechart.ComboChart.Options options = ComboChart
                .createComboOptions();
        options.setTitle("title...");
        options.setWidth(400);
        options.setHeight(240);

        final AxisOptions vAxisOpts = AxisOptions.create();
        vAxisOpts.setTitle("Nb books");
        options.setVAxisOptions(vAxisOpts);

        final AxisOptions hAxisOpts = AxisOptions.create();
        hAxisOpts.setTitle("Years");
        options.setHAxisOptions(hAxisOpts);

        options.setSeriesType(Series.Type.BARS);

        final Series average = Series.create();
        average.setColor("blue");
        average.setLineWidth(1);
        average.setPointSize(2);
        average.setType(Series.Type.LINE);
        options.setSeries(4, average);

        // //
        final DataTable table = DataTable.create();
        table.addColumn(ColumnType.STRING, "Year");
        table.addColumn(ColumnType.NUMBER, "Category A");
        table.addColumn(ColumnType.NUMBER, "Category B");
        table.addColumn(ColumnType.NUMBER, "Category C");
        table.addColumn(ColumnType.NUMBER, "Category D");
        table.addColumn(ColumnType.NUMBER, "Average");

        table.addRows(5);
        table.setValue(0, 0, "1970"); // row, col
        table.setValue(0, 1, 10);
        table.setValue(0, 2, 20);
        table.setValue(0, 3, 30);
        table.setValue(0, 4, 40);
        table.setValue(0, 5, 25);
        //
        table.setValue(1, 0, "1980"); // row, col
        table.setValue(1, 1, 15);
        table.setValue(1, 2, 25);
        table.setValue(1, 3, 35);
        table.setValue(1, 4, 45);
        table.setValue(1, 5, 30);
        //
        table.setValue(2, 0, "1990"); // row, col
        table.setValue(2, 1, 5);
        table.setValue(2, 2, 15);
        table.setValue(2, 3, 25);
        table.setValue(2, 4, 35);
        table.setValue(2, 5, 20);

        // //
        final ComboChart chart = new ComboChart(table, options);
        container.add(chart);
    }

    private TreeMap<String, Integer> categoryData;
    private TreeMap<String, Integer> editorData;

    @Override
    public void initFetchData() {
        isNbBooksByCategoriesLoaded = false;
        isNbBooksByEditorsLoaded = false;
    }

    @Override
    public void setNbBooksByCategories(final TreeMap<String, Integer> result) {
        isNbBooksByCategoriesLoaded = true;
        categoryData = result;
        showCharts();
    }

    @Override
    public void setNbBooksByEditors(final TreeMap<String, Integer> result) {
        isNbBooksByEditorsLoaded = true;
        editorData = result;
        showCharts();
    }
}
