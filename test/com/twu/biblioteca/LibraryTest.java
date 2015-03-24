package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testAddBookAddsABookInTheLibrary() {
        Library library = new Library();
        assertTrue(library.addBook(new Book("Refactoring", "Martin Fowler")));
    }
}