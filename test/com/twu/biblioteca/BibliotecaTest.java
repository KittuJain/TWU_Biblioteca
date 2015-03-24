package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    Biblioteca biblioteca;
    @Before
    public void setUp() throws Exception {
        biblioteca = new Biblioteca(new Library());
    }

    @Test
    public void testGetWelcomeMessageShouldGiveTheWelcomeMessage() {
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
        String bookList = biblioteca.getBookList();
        String expected = "*************List Of Books*************";
        assertEquals(expected,bookList);
    }

    @Test
    public void testGetBookListShouldGiveTheBookList() {
        Book book = new Book("Refactoring", "Martin Fowler");
        Library lib = new Library();
        lib.addBook(book);
        Biblioteca biblioteca = new Biblioteca(lib);
        StringBuilder expected = new StringBuilder();
        expected.append("*************List Of Books*************");
        expected.append(System.lineSeparator());
        expected.append("Refactoring - Martin Fowler");
        assertEquals(String.valueOf(expected),biblioteca.getBookList());
    }

    @Test
    public void testGetMenuGivesEmptyWhenNoMenuItemsArePresentInLibraryApp() {
        Menu menu = new Menu();
        String menuItem = biblioteca.getMenu(menu);
        String expected = "********** List Of Options **********";
        assertEquals(expected,menuItem);
    }

    @Test
    public void testGetMenuGivesAllTheMenuItemsPresentInLibraryApp() {
        Menu menu = new Menu();
        menu.addMenuItem(new MenuItem("List Books"));
        String menuItem = biblioteca.getMenu(menu);
        String expected = "********** List Of Options **********"+ System.lineSeparator()+"1: List Books";
        assertEquals(expected, menuItem);
    }
}
