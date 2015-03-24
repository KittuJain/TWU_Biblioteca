package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void testGetWelcomeMessageShouldGiveTheWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca(new Library());
        StringBuilder expected = new StringBuilder();
        expected.append("*************************");
        expected.append(System.lineSeparator());
        expected.append("**Welcome to Biblioteca**");
        expected.append(System.lineSeparator());
        expected.append("*************************");
        assertEquals(String.valueOf(expected), biblioteca.getWelcomeMessage());
    }

    @Test
    public void testGetBookListShouldGiveTheHeadingWhenNoBooksAreAddedInBookList() {
        Biblioteca biblioteca = new Biblioteca(new Library());
        String bookList = biblioteca.getBookList();
        String expected = "List Of Books";
        assertEquals(expected,bookList);
    }

    @Test
    public void testGetBookListShouldGiveTheBookList() {
        Book book = new Book("Refactoring", "Martin Fowler");
        Library lib = new Library();
        lib.addBook(book);
        Biblioteca biblioteca = new Biblioteca(lib);
        StringBuilder expected = new StringBuilder();
        expected.append("List Of Books");
        expected.append(System.lineSeparator());
        expected.append("Refactoring - Martin Fowler");
        assertEquals(String.valueOf(expected),biblioteca.getBookList());
    }
}
