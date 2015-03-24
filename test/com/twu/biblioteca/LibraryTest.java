package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testAddBookAddsABookInTheLibrary() {
        Library library = new Library();
        assertTrue(library.addBook(new Book("Refactoring", "Martin Fowler"), new ArrayList<Book>()));
    }

    @Test
    public void testAddBookAddsBookToModifyExistingList() {
        Library library = new Library();
        List<Book> bookList = new ArrayList<Book>();
        library.addBook(new Book("Refactoring", "Martin Fowler"),bookList);
        List<Book> expected = new ArrayList<Book>();
        expected.add(new Book("Refactoring", "Martin Fowler"));
        assertTrue(expected.equals(bookList));
    }
}