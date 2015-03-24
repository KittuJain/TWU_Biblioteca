package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    Biblioteca biblioteca;
    @Before
    public void setUp() throws Exception {
        biblioteca = new Biblioteca();
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
        String bookList = biblioteca.getBookList(new ArrayList<Book>());
        String expected = "*************List Of Books*************";
        assertEquals(expected,bookList);
    }

    @Test
    public void testGetBookListShouldGiveTheBookList() {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book("Refactoring", "Martin Fowler");
        Library lib = new Library();
        lib.addBook(book, bookList);
        StringBuilder expected = new StringBuilder();
        expected.append("*************List Of Books*************");
        expected.append(System.lineSeparator());
        expected.append("Refactoring - Martin Fowler");
        assertEquals(String.valueOf(expected),biblioteca.getBookList(bookList));
    }

    @Test
    public void testGetMenuGivesAllTheMenuItemsPresentInLibraryApp() {
        Menu menu = new Menu();
        List<MenuItem> menuItemList = new ArrayList<MenuItem>();
        menu.addMenuItem(new MenuItem("List Books"), menuItemList);
        String menuItem = biblioteca.getMenu(menuItemList);
        String expected = "********** List Of Options **********"+ System.lineSeparator()+"1: List Books";
        assertEquals(expected, menuItem);
    }
}
