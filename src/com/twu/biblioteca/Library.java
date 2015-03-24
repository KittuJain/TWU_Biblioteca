package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<Book>();
    }

    public boolean addBook(Book book) {
        int numberOfBooks = bookList.size();
        bookList.add(book);
        return (bookList.size()>numberOfBooks);
    }

    public List<Book> getAllBooks() {
        return bookList;
    }
}
