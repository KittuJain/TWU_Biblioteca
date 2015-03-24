package com.twu.biblioteca;

import java.util.List;

public class Library {
    public boolean addBook(Book book, List<Book> bookList) {
        int numberOfBooks =bookList.size();
        bookList.add(book);
        return bookList.size() > numberOfBooks;
    }
}
