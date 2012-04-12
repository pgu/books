package com.pgu.books.client.activity.dashboard;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pgu.books.client.BooksService;
import com.pgu.books.client.BooksServiceAsync;
import com.pgu.books.client.activity.books.board.BooksboardPresenter;
import com.pgu.books.client.activity.books.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.books.search.BooksSearchPresenter;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.activity.utils.FilterType;
import com.pgu.books.client.app.AsyncCallbackApp;
import com.pgu.books.client.ui.Dashboard;
import com.pgu.books.client.ui.books.filters.Letter;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BooksFiltersDTO;

public class DashboardActivity implements //
        DashboardPresenter, //
        BooksImportPresenter, //
        BooksboardPresenter, //
        BooksFiltersPresenter, //
        BooksSearchPresenter //
{

    public static DashboardActivity INSTANCE = new DashboardActivity();

    private DashboardActivity() {
    }

    private final BooksServiceAsync booksService = GWT.create(BooksService.class);

    private Dashboard               dashboardUI;

    // search state
    private final BooksFiltersDTO   filtersDTO   = new BooksFiltersDTO();

    public Dashboard start() {
        if (null == dashboardUI) {
            dashboardUI = new Dashboard();
            dashboardUI.setPresenter(this);
            dashboardUI.getBooksImportUI().setPresenter(this);
            dashboardUI.getBooksboardUI().setPresenter(this);
            dashboardUI.getBooksFiltersUI().setPresenter(this);
            dashboardUI.getBooksSearchUI().setPresenter(this);

            Scheduler.get().scheduleDeferred(new ScheduledCommand() {

                @Override
                public void execute() {
                    dashboardUI.getBooksboardUI().initFetchBooks();
                }
            });
            Scheduler.get().scheduleDeferred(new ScheduledCommand() {

                @Override
                public void execute() {
                    initFetchFilters();
                }
            });
        }
        return dashboardUI;
    }

    @Override
    public void importBooks(final String categoryTitle) {
        booksService.importBooks(categoryTitle, new AsyncCallback<String>() {

            @Override
            public void onFailure(final Throwable caught) {
                dashboardUI.getBooksImportUI().enableImport(categoryTitle);
            }

            @Override
            public void onSuccess(final String importResult) {
                dashboardUI.getBooksImportUI().disableImport(categoryTitle, importResult);
            }
        });

    }

    public void buildCharts() {
        dashboardUI.buildCharts();
    }

    @Override
    public void testImport() {
        booksService.testImport(new AsyncCallbackApp<String>() {

            @Override
            public void onSuccess(final String importResult) {
                Window.alert("success: " + importResult);
            }

        });
    }

    @Override
    public void fetchBooks(final int start, final int length) {
        GWT.log("start -> " + start + ", " + "length -> " + length);

        dashboardUI.getBooksboardUI().initFetch();

        booksService.countBooks(filtersDTO, new AsyncCallbackApp<Integer>() {

            @Override
            public void onSuccess(final Integer count) {
                GWT.log("success count " + count);
                dashboardUI.getBooksboardUI().setNbBooks(count);
            }

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
                dashboardUI.getBooksboardUI().setNbBooks(0);
            }

        });

        booksService.fetchBooks(filtersDTO, start, length, new AsyncCallbackApp<ArrayList<Book>>() {

            @Override
            public void onSuccess(final ArrayList<Book> books) {
                GWT.log("success list " + books.size());
                dashboardUI.getBooksboardUI().showBooks(books);
            }

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
                dashboardUI.getBooksboardUI().showBooks(new ArrayList<Book>());
            }

        });
    }

    @Override
    public void fetchBooks( //
            final ArrayList<String> selectedAuthors, //
            final ArrayList<String> selectedEditors, //
            final ArrayList<String> selectedCategories) {

        filtersDTO //
                .authors(selectedAuthors) //
                .editors(selectedEditors) //
                .categories(selectedCategories);

        fetchBooks(0, dashboardUI.getBooksboardUI().getLength());
    }

    @Override
    public void deleteBooks() {
        booksService.delete(new AsyncCallbackApp<Void>() {

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
                dashboardUI.getBooksSearchUI().setWords(words, text);
            }

        });
    }

    @Override
    public void searchBooks(final String text) {
        filtersDTO.setSearchText(text);
        fetchBooks(0, dashboardUI.getBooksboardUI().getLength());
    }

    private void initFetchFilters() {
        Scheduler.get().scheduleDeferred(new ScheduledCommand() {

            @Override
            public void execute() {
                booksService.countAuthorsByLetters(new AsyncCallbackApp<ArrayList<String>>() {

                    @Override
                    public void onSuccess(final ArrayList<String> countsByLetters) {
                        dashboardUI.getBooksFiltersUI().setCounts(countsByLetters, FilterType.AUTHOR);
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
                        dashboardUI.getBooksFiltersUI().setCounts(countsByLetters, FilterType.EDITOR);
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
                        dashboardUI.getBooksFiltersUI().setCounts(countsByLetters, FilterType.CATEGORY);
                    }

                });
            }
        });
    }

    @Override
    public void fetchFiltersByLetter(final Letter letter, final FilterType filterType) {

        if (FilterType.AUTHOR == filterType) {
            booksService.fetchFilterAuthors(letter.getValue(), new AsyncCallbackApp<ArrayList<String>>() {

                @Override
                public void onSuccess(final ArrayList<String> filters) {
                    dashboardUI.getBooksFiltersUI().setFilters(filters, letter, filterType);
                }

            });

        } else if (FilterType.EDITOR == filterType) {
            booksService.fetchFilterEditors(letter.getValue(), new AsyncCallbackApp<ArrayList<String>>() {

                @Override
                public void onSuccess(final ArrayList<String> filters) {
                    dashboardUI.getBooksFiltersUI().setFilters(filters, letter, filterType);
                }

            });

        } else if (FilterType.CATEGORY == filterType) {
            booksService.fetchFilterCategories(letter.getValue(), new AsyncCallbackApp<ArrayList<String>>() {

                @Override
                public void onSuccess(final ArrayList<String> filters) {
                    dashboardUI.getBooksFiltersUI().setFilters(filters, letter, filterType);
                }

            });
        }
    }

}
