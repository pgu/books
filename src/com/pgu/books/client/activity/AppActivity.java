package com.pgu.books.client.activity;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.pgu.books.client.BooksService;
import com.pgu.books.client.BooksServiceAsync;
import com.pgu.books.client.activity.booksBoard.BooksBoardPresenter;
import com.pgu.books.client.activity.booksBoard.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.booksBoard.grid.BooksGridPresenter;
import com.pgu.books.client.activity.booksBoard.search.BooksSearchPresenter;
import com.pgu.books.client.activity.booksCharts.BooksChartsPresenter;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.activity.utils.FilterType;
import com.pgu.books.client.app.AsyncCallbackApp;
import com.pgu.books.client.ui.AppUI;
import com.pgu.books.client.ui.Dashboard;
import com.pgu.books.client.ui.booksBoard.filters.Letter;
import com.pgu.books.shared.Book;
import com.pgu.books.shared.BooksFiltersDTO;

public class AppActivity implements //
        AppPresenter, //
        //
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

    private final BooksServiceAsync booksService = GWT.create(BooksService.class);

    private AppUI                   dashboard;

    // search state
    private final BooksFiltersDTO   filtersDTO   = new BooksFiltersDTO();

    public IsWidget initView() {
        if (null == dashboard) {
            dashboard = new Dashboard();
            dashboard.setPresenter(this);
            //
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
        booksService.importBooks(categoryTitle, new AsyncCallback<String>() {

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

        dashboard.getBooksGridUI().initFetch();

        booksService.countBooks(filtersDTO, new AsyncCallbackApp<Integer>() {

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

        booksService.fetchBooks(filtersDTO, start, length, new AsyncCallbackApp<ArrayList<Book>>() {

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

        filtersDTO //
                .authors(selectedAuthors) //
                .editors(selectedEditors) //
                .categories(selectedCategories);

        fetchBooks(0, dashboard.getBooksGridUI().getLength());
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
                dashboard.getBooksSearchUI().setWords(words, text);
            }

        });
    }

    @Override
    public void searchBooks(final String text) {
        filtersDTO.setSearchText(text);
        fetchBooks(0, dashboard.getBooksGridUI().getLength());
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
}
