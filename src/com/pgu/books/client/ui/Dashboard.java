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
import com.pgu.books.client.ui.book.BookBoard;
import com.pgu.books.client.ui.filters.Filters;
import com.pgu.books.client.ui.menu.Menu;
import com.pgu.books.client.ui.menuAdmin.MenuAdmin;

public class Dashboard extends Composite {

    private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);

    interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
    }

    @UiField
    MenuAdmin menuAdmin;

    @UiField
    HTMLPanel graphs;

    @UiField(provided = true)
    DockPanel dashboard;

    public Dashboard() {
        buildDashboard();

        initWidget(uiBinder.createAndBindUi(this));
    }

    private void buildDashboard() {
        dashboard = new DockPanel();
        dashboard.setSpacing(4);
        dashboard.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        dashboard.add(new Menu(), DockPanel.NORTH);
        dashboard.add(new Filters(), DockPanel.WEST);

        final BookBoard bookBoard = new BookBoard();
        final ScrollPanel scroller = new ScrollPanel(bookBoard);
        scroller.setSize("800px", "600px");
        dashboard.add(scroller, DockPanel.CENTER);
    }

    public void showBooks() {
        dashboard.setVisible(true);
        graphs.setVisible(false);
    }

    public void showGraphs() {
        dashboard.setVisible(false);
        graphs.setVisible(true);
    }

}
