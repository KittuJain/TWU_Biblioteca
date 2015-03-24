package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MenuTest {
    Menu menu;
    @Before
    public void setUp() throws Exception {
        menu = new Menu();
    }

    @Test
    public void testAddMenuItemsAddsAnItemAndReturnTrueOnAdding() {
        assertTrue(menu.addMenuItem(new MenuItem("List Books"), new ArrayList<MenuItem>()));
    }

    @Test
    public void testGiveMenuItemsGivesAListOfItemsAddedInTheList() {
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        menu.addMenuItem(new MenuItem("List Books"), menuItems);
        List<MenuItem> expected = new ArrayList<MenuItem>();
        expected.add(new MenuItem("List Books"));
        assertEquals(expected, menuItems);
    }
}