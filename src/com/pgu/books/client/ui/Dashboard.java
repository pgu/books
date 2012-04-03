package com.pgu.books.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.pgu.books.client.ui.book.BookBoard;
import com.pgu.books.client.ui.menu.Menu;

public class Dashboard extends Composite {

    private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);

    interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
    }

    @UiField(provided = true)
    DockPanel dashboard;

    public Dashboard() {
        dashboard = new DockPanel();
        dashboard.setSpacing(4);
        dashboard.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        dashboard.add(new HTML("Libros Harriet"), DockPanel.NORTH);
        dashboard.add(new Menu(), DockPanel.WEST);

        // final HTML contents = new HTML("center");
        final BookBoard bookBoard = new BookBoard();
        final ScrollPanel scroller = new ScrollPanel(bookBoard);
        scroller.setSize("800px", "600px");
        dashboard.add(scroller, DockPanel.CENTER);

        initWidget(uiBinder.createAndBindUi(this));
    }

    public void showBooks() {
    }

    public void showAdmin() {
    }

}
