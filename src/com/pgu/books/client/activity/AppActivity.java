package com.pgu.books.client.activity;

import java.util.ArrayList;
import java.util.TreeMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.pgu.books.client.activity.booksBoard.BooksBoardPresenter;
import com.pgu.books.client.activity.booksBoard.edition.BookFormPresenter;
import com.pgu.books.client.activity.booksBoard.filters.BooksFiltersPresenter;
import com.pgu.books.client.activity.booksBoard.list.BooksDeletePresenter;
import com.pgu.books.client.activity.booksBoard.list.BooksGridPresenter;
import com.pgu.books.client.activity.booksBoard.search.BooksSearchPresenter;
import com.pgu.books.client.activity.booksCharts.BooksChartsPresenter;
import com.pgu.books.client.activity.booksImport.BooksImportPresenter;
import com.pgu.books.client.activity.booksMenu.BooksMenuPresenter;
import com.pgu.books.client.activity.utils.FilterType;
import com.pgu.books.client.app.AsyncCallbackApp;
import com.pgu.books.client.app.AsyncCallbackAppLoading;
import com.pgu.books.client.rpc.AdminBooksService;
import com.pgu.books.client.rpc.AdminBooksServiceAsync;
import com.pgu.books.client.rpc.BooksService;
import com.pgu.books.client.rpc.BooksServiceAsync;
import com.pgu.books.client.ui.AppUI;
import com.pgu.books.client.ui.Dashboard;
import com.pgu.books.client.ui.booksBoard.filters.Letter;
import com.pgu.books.client.ui.utils.Notification;
import com.pgu.books.shared.domain.Book;
import com.pgu.books.shared.dto.BooksQueryParameters;
import com.pgu.books.shared.dto.BooksResult;
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
        BookFormPresenter, //
        BooksDeletePresenter, //
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
            dashboard = new Dashboard(loginInfo);
            dashboard.setPresenter(this);
            //
            dashboard.getBooksMenuUI().setPresenter(this);
            dashboard.getBooksBoardUI().setPresenter(this);
            dashboard.getBooksChartsUI().setPresenter(this);
            //
            dashboard.getBooksGridUI().setPresenter(this);
            dashboard.getBooksSearchUI().setPresenter(this);
            dashboard.getBooksFiltersUI().setPresenter(this);

            if (loginInfo.isLoggedIn()) {
                dashboard.getBooksImportUI().setPresenter(this);
                dashboard.getBookFormUI().setPresenter(this);
                dashboard.getBooksDeleteUI().setPresenter(this);
            }

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
    public void importBooks(final int start, final int length) {
        Notification.loadingStart();
        adminBooksService.importBooks(start, length, new AsyncCallbackAppLoading<String>() {

            @Override
            public void onFailure(final Throwable caught) {
                super.onFailure(caught);
            }

            @Override
            public void onSuccessApp(final String importResult) {
                fetchBooksInternal(0, dashboard.getBooksGridUI().getLength());
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
        dashboard.getBooksGridUI().initFetchFlags();

        booksService.fetchBooks(queryParameters, start, length, new AsyncCallbackApp<BooksResult>() {

            @Override
            public void onSuccess(final BooksResult booksResult) {
                dashboard.getBooksGridUI().setNbBooks(booksResult.getNbFound());
                dashboard.getBooksGridUI().showBooks(booksResult.getBooks());
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
    public void deleteAllBooks() {
        Notification.loadingStart();
        adminBooksService.deleteAll(new AsyncCallbackAppLoading<Void>() {

            @Override
            public void onSuccessApp(final Void result) {
                fetchBooksInternal(0, dashboard.getBooksGridUI().getLength());
                Notification.validation("Successful deletion");
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

    @Override
    public void showUnknownTag(final String tag) {
        dashboard.showUnknownTag(tag);
    }

    @Override
    public void fetchData() {
        dashboard.getBooksChartsUI().initFetchData();

        Notification.loadingStart();
        booksService.fetchNbBooksByCategories(new AsyncCallbackApp<TreeMap<String, Integer>>() {

            @Override
            public void onSuccess(final TreeMap<String, Integer> result) {
                Notification.loadingStop();
                dashboard.getBooksChartsUI().setNbBooksByCategories(result);
            }

        });

        Notification.loadingStart();
        booksService.fetchNbBooksByEditors(new AsyncCallbackApp<TreeMap<String, Integer>>() {

            @Override
            public void onSuccess(final TreeMap<String, Integer> result) {
                Notification.loadingStop();
                dashboard.getBooksChartsUI().setNbBooksByEditors(result);
            }

        });
    }

    @Override
    public void updateBook(final Book book) {
        Notification.loadingStart();
        adminBooksService.saveBook(book, new AsyncCallbackAppLoading<Void>() {

            @Override
            public void onSuccessApp(final Void result) {
                Notification.validation("El libro ha sido modificado con éxito");
            }

        });
    }

    @Override
    public void createBook(final Book book) {
        Notification.loadingStart();
        adminBooksService.saveBook(book, new AsyncCallbackAppLoading<Void>() {

            @Override
            public void onSuccessApp(final Void result) {
                dashboard.getBooksGridUI().refreshGrid();
                Notification.validation("El libro ha sido creado con éxito");
            }

        });
    }

    @Override
    public void deleteBooks(final ArrayList<Book> selectedBooks) {
        Notification.loadingStart();
        adminBooksService.deleteBooks(selectedBooks, new AsyncCallbackAppLoading<Void>() {

            @Override
            public void onSuccessApp(final Void result) {
                dashboard.getBooksGridUI().refreshGrid();
                Notification.validation("Los libros han sido borrados con éxito");
            }

        });
    }

}
