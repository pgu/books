package com.pgu.books.server.access;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;
import com.pgu.books.server.domain.ArchivedBook;
import com.pgu.books.server.domain.AuthorFilter;
import com.pgu.books.server.domain.AuthorLetterFilter;
import com.pgu.books.server.domain.BookId;
import com.pgu.books.server.domain.BookWord;
import com.pgu.books.server.domain.Category2Books;
import com.pgu.books.server.domain.CategoryFilter;
import com.pgu.books.server.domain.CategoryLetterFilter;
import com.pgu.books.server.domain.Editor2Books;
import com.pgu.books.server.domain.EditorFilter;
import com.pgu.books.server.domain.EditorLetterFilter;
import com.pgu.books.server.domain.Word;

public class DAO extends DAOBase {

    static {
        ObjectifyService.register(BookId.class);
        ObjectifyService.register(ArchivedBook.class);

        ObjectifyService.register(AuthorFilter.class);
        ObjectifyService.register(EditorFilter.class);
        ObjectifyService.register(CategoryFilter.class);

        ObjectifyService.register(AuthorLetterFilter.class);
        ObjectifyService.register(EditorLetterFilter.class);
        ObjectifyService.register(CategoryLetterFilter.class);

        ObjectifyService.register(Editor2Books.class);
        ObjectifyService.register(Category2Books.class);

        ObjectifyService.register(BookWord.class);
        ObjectifyService.register(Word.class);

    }

}
