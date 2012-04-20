package com.pgu.books.client.activity;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.client.activity.booksBoard.BooksBoardPresenter;
import com.pgu.books.client.activity.booksBoard.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.booksBoard.grid.BooksGridPresenter;
import com.pgu.books.client.activity.booksBoard.search.BooksSearchPresenter;
import com.pgu.books.client.activity.booksCharts.BooksChartsPresenter;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.activity.booksMenu.BooksMenuPresenter;
import com.pgu.books.client.activity.utils.FilterType;
import com.pgu.books.client.app.AsyncCallbackApp;
import com.pgu.books.client.rpc.AdminBooksService;
import com.pgu.books.client.rpc.AdminBooksServiceAsync;
import com.pgu.books.client.rpc.BooksService;
import com.pgu.books.client.rpc.BooksServiceAsync;
import com.pgu.books.client.ui.AppUI;
import com.pgu.books.client.ui.Dashboard;
import com.pgu.books.client.ui.booksBoard.filters.Letter;
import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.dto.BooksQueryParameters;
import com.pgu.books.shared.dto.LoginInfo;
import com.pgu.books.shared.utils.SortField;

public class AppActivity implements //
        AppPresenter, //
        //
        BooksMenuPresenter, //
        BooksBoardPresenter, //
        BooksChartsPresenter, //
        BooksImportPresenter, //
        //
        BooksGridPresenter, //
        BooksFiltersPresenter, //
        BooksSearchPresenter //
{

    private static AppActivity INSTANCE = new AppActivity();

    private AppActivity() {
    }

    public static AppActivity get() {
        return INSTANCE;
    }

    private final BooksServiceAsync      booksService      = GWT.create(BooksService.class);
    private final AdminBooksServiceAsync adminBooksService = GWT.create(AdminBooksService.class);

    private AppUI                        dashboard;

    // search state
    private final BooksQueryParameters   queryParameters   = new BooksQueryParameters();

    public AppUI initView(final LoginInfo loginInfo) {

        if (null == dashboard) {
            // TODO PGU Move rpc to admin/rpc: grid -> edition
            // TODO PGU Move rpc to admin/rpc: graph -> piles
            dashboard = new Dashboard(loginInfo);
            dashboard.setPresenter(this);
            //
            dashboard.getBooksMenuUI().setPresenter(this);
            dashboard.getBooksBoardUI().setPresenter(this);
            dashboard.getBooksChartsUI().setPresenter(this);
            dashboard.getBooksImportUI().setPresenter(this);
            //
            dashboard.getBooksGridUI().setPresenter(this);
            dashboard.getBooksFiltersUI().setPresenter(this);
            dashboard.getBooksSearchUI().setPresenter(this);

            Scheduler.get().scheduleDeferred(new ScheduledCommand() {

                @Override
                public void execute() {
                    dashboard.getBooksGridUI().initFetchBooks();
                }
            });
            Scheduler.get().scheduleDeferred(new ScheduledCommand() {

                @Override
                public void execute() {
                    initFetchFilters();
                }
            });

        }

        return dashboard;
    }

    @Override
    public void importBooks(final String categoryTitle) {
        adminBooksService.importBooks(categoryTitle, new AsyncCallback<String>() {

            @Override
            public void onFailure(final Throwable caught) {
                dashboard.getBooksImportUI().enableImport(categoryTitle);
            }

            @Override
            public void onSuccess(final String importResult) {
                dashboard.getBooksImportUI().disableImport(categoryTitle, importResult);
            }
        });

    }

    @Override
    public void testImport() {
        adminBooksService.testImport(new AsyncCallbackApp<String>() {

            @Override
            public void onSuccess(final String importResult) {
                Window.alert("success: " + importResult);
            }

        });
    }

    @Override
    public void fetchBooks(final int start, final int length, final SortField sortField, final boolean isAscending) {
        queryParameters.setSortField(sortField);
        queryParameters.setAscending(isAscending);
        fetchBooksInternal(start, length);
    }

    private void fetchBooksInternal(final int start, final int length) {
        GWT.log("---" + //
                "start -> " + start + ", " + //
                "length -> " + length + ", " + //
                "sortField -> " + queryParameters.getSortField() + ", " + //
                "isAscending -> " + queryParameters.isAscending() + ", " //
        );

        dashboard.getBooksGridUI().initFetchFlags();

        booksService.countBooks(queryParameters, new AsyncCallbackApp<Integer>() {

            @Override
            public void onSuccess(final Integer count) {
                GWT.log("success count " + count);
                dashboard.getBooksGridUI().setNbBooks(count);
            }

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
                dashboard.getBooksGridUI().setNbBooks(0);
            }

        });

        booksService.fetchBooks(queryParameters, start, length, new AsyncCallbackApp<ArrayList<Book>>() {

            @Override
            public void onSuccess(final ArrayList<Book> books) {
                GWT.log("success list " + books.size());
                dashboard.getBooksGridUI().showBooks(books);
            }

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
                dashboard.getBooksGridUI().showBooks(new ArrayList<Book>());
            }

        });
    }

    @Override
    public void fetchBooks( //
            final ArrayList<String> selectedAuthors, //
            final ArrayList<String> selectedEditors, //
            final ArrayList<String> selectedCategories) {

        queryParameters //
                .authors(selectedAuthors) //
                .editors(selectedEditors) //
                .categories(selectedCategories);

        fetchBooksInternal(0, dashboard.getBooksGridUI().getLength());
    }

    @Override
    public void deleteBooks() {
        adminBooksService.deleteAll(new AsyncCallbackApp<Void>() {

            @Override
            public void onSuccess(final Void result) {
                Window.alert("Done");
            }

        });
    }

    @Override
    public void getSuggestions(final String text) {
        booksService.fetchWords(text, new AsyncCallbackApp<ArrayList<String>>() {

            @Override
            public void onSuccess(final ArrayList<String> words) {
                dashboard.getBooksSearchUI().setWords(words, text);
            }

        });
    }

    @Override
    public void searchBooks(final String text) {
        queryParameters.setSearchText(text);
        fetchBooksInternal(0, dashboard.getBooksGridUI().getLength());
    }

    private void initFetchFilters() {
        Scheduler.get().scheduleDeferred(new ScheduledCommand() {

            @Override
            public void execute() {
                booksService.countAuthorsByLetters(new AsyncCallbackApp<ArrayList<String>>() {

                    @Override
                    public void onSuccess(final ArrayList<String> countsByLetters) {
                        dashboard.getBooksFiltersUI().setCounts(countsByLetters, FilterType.AUTHOR);
                    }

                });
            }
        });
        Scheduler.get().scheduleDeferred(new ScheduledCommand() {

            @Override
            public void execute() {
                booksService.countEditorsByLetters(new AsyncCallbackApp<ArrayList<String>>() {

                    @Override
                    public void onSuccess(final ArrayList<String> countsByLetters) {
                        dashboard.getBooksFiltersUI().setCounts(countsByLetters, FilterType.EDITOR);
                    }

                });
            }
        });
        Scheduler.get().scheduleDeferred(new ScheduledCommand() {

            @Override
            public void execute() {
                booksService.countCategoriesByLetters(new AsyncCallbackApp<ArrayList<String>>() {

                    @Override
                    public void onSuccess(final ArrayList<String> countsByLetters) {
                        dashboard.getBooksFiltersUI().setCounts(countsByLetters, FilterType.CATEGORY);
                    }

                });
            }
        });
    }

    @Override
    public void fetchFiltersByLetter(final Letter letter, final FilterType filterType) {

        if (FilterType.AUTHOR == filterType) {
            booksService.fetchFilterAuthors(letter.getLetter(), new AsyncCallbackApp<ArrayList<String>>() {

                @Override
                public void onSuccess(final ArrayList<String> filters) {
                    dashboard.getBooksFiltersUI().setFilters(filters, letter, filterType);
                }

            });

        } else if (FilterType.EDITOR == filterType) {
            booksService.fetchFilterEditors(letter.getLetter(), new AsyncCallbackApp<ArrayList<String>>() {

                @Override
                public void onSuccess(final ArrayList<String> filters) {
                    dashboard.getBooksFiltersUI().setFilters(filters, letter, filterType);
                }

            });

        } else if (FilterType.CATEGORY == filterType) {
            booksService.fetchFilterCategories(letter.getLetter(), new AsyncCallbackApp<ArrayList<String>>() {

                @Override
                public void onSuccess(final ArrayList<String> filters) {
                    dashboard.getBooksFiltersUI().setFilters(filters, letter, filterType);
                }

            });
        }
    }

    public void showBooks() {
        dashboard.showBooks();
    }

    public void showCharts() {
        dashboard.showCharts();
    }

    public void showImport() {
        dashboard.showImport();
    }

    public void showUnknownTag(final String tag) {
        dashboard.showUnknownTag(tag);
    }

    @Override
    public void fetchData() {
        // TODO PGU make a service for getting charts data
        dashboard.getBooksChartsUI().showCharts();

    }
}
