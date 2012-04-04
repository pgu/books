package com.pgu.books.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.ui.books.board.BooksBoard;
import com.pgu.books.client.ui.books.filters.BooksFilters;
import com.pgu.books.client.ui.books.menu.BooksMenu;
import com.pgu.books.client.ui.menuAdmin.MenuAdmin;

public class Dashboard extends Composite {

    private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);

    interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
    }

    @UiField
    MenuAdmin menuAdmin;

    @UiField
    HTMLPanel graphs, booksImport;

    @UiField(provided = true)
    DockPanel booksBoard;

    public Dashboard() {
        buildDashboard();

        initWidget(uiBinder.createAndBindUi(this));
    }

    private void buildDashboard() {
        booksBoard = new DockPanel();
        booksBoard.setSpacing(4);
        booksBoard.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        booksBoard.add(new BooksMenu(), DockPanel.NORTH);
        booksBoard.add(new BooksFilters(), DockPanel.WEST);

        final BooksBoard bookBoard = new BooksBoard();
        final ScrollPanel scroller = new ScrollPanel(bookBoard);
        scroller.setSize("800px", "600px");
        booksBoard.add(scroller, DockPanel.CENTER);
    }

    public void showBooks() {
        show(booksBoard);
    }

    public void showGraphs() {
        show(graphs);
    }

    public void showImport() {
        show(booksImport);
    }

    private final Widget[] widgetCenters = new Widget[] { booksBoard, graphs };

    private void show(final Widget widgetToShow) {
        for (final Widget w : widgetCenters) {
            w.setVisible(w.equals(widgetToShow));
        }
    }

}
