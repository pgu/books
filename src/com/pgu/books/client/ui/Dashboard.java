package com.pgu.books.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.visualization.client.AbstractDataTable;
import com.google.gwt.visualization.client.AbstractDataTable.ColumnType;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.Selection;
import com.google.gwt.visualization.client.events.SelectHandler;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart;
import com.google.gwt.visualization.client.visualizations.corechart.PieChart.PieOptions;
import com.pgu.books.client.activity.dashboard.DashboardPresenter;
import com.pgu.books.client.ui.books.board.BooksBoard;
import com.pgu.books.client.ui.books.filters.BooksFilters;
import com.pgu.books.client.ui.books.menu.BooksMenu;
import com.pgu.books.client.ui.booksImport.BooksImport;
import com.pgu.books.client.ui.booksImport.BooksImportUI;
import com.pgu.books.client.ui.menuAdmin.MenuAdmin;

public class Dashboard extends Composite {

    private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);

    interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
    }

    @UiField
    MenuAdmin          menuAdmin;

    @UiField
    HTMLPanel          charts;

    @UiField
    BooksImport        booksImport;

    @UiField(provided = true)
    DockPanel          booksDock;

    private BooksBoard booksBoard;

    public Dashboard() {
        buildBooksBoard();

        initWidget(uiBinder.createAndBindUi(this));
    }

    private void buildBooksBoard() {
        booksDock = new DockPanel();
        booksDock.setSpacing(4);
        booksDock.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        booksDock.add(new BooksMenu(), DockPanel.NORTH);
        booksDock.add(new BooksFilters(), DockPanel.WEST);

        booksBoard = new BooksBoard();
        booksBoard.setHeight("600px");
        booksBoard.setWidth("800px");
        booksDock.add(booksBoard, DockPanel.CENTER);
    }

    public void showBooks() {
        show(booksDock);
    }

    public void showCharts() {
        show(charts);
    }

    public void showImport() {
        show(booksImport);
    }

    private void show(final Widget widgetToShow) {
        for (final Widget w : new Widget[] { booksDock, charts, booksImport }) {
            if (w == null) {
                continue;
            }
            w.setVisible(w.equals(widgetToShow));
        }
    }

    private DashboardPresenter dashboardPresenter;

    public void setPresenter(final DashboardPresenter dashboardPresenter) {
        this.dashboardPresenter = dashboardPresenter;
    }

    public BooksImportUI getBooksImportUI() {
        return booksImport;
    }

    //    http://code.google.com/p/gwt-google-apis/wiki/VisualizationGettingStarted
    public void buildCharts() {
        final PieChart pie = new PieChart(createTable(), createOptions());

        pie.addSelectHandler(createSelectHandler(pie));
        charts.add(pie);
    }

    private PieOptions createOptions() {
        final PieOptions options = PieOptions.create();
        options.setWidth(400);
        options.setHeight(240);
        options.set3D(true);
        options.setTitle("My Daily Activities");
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

    private AbstractDataTable createTable() {
        final DataTable data = DataTable.create();
        data.addColumn(ColumnType.STRING, "Task");
        data.addColumn(ColumnType.NUMBER, "Hours per Day");
        data.addRows(2);
        data.setValue(0, 0, "Work");
        data.setValue(0, 1, 14);
        data.setValue(1, 0, "Sleep");
        data.setValue(1, 1, 10);
        return data;
    }

    public BooksBoard getBooksBoardUI() {
        return booksBoard;
    }
}
