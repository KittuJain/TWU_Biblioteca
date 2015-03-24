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
        assertTrue(menu.addMenuItem(new MenuItem("List Books")));
    }

    @Test
    public void testGiveMenuItemsGivesEmptyMenuItemsListInitially() {
        List<MenuItem> menuItems = menu.giveMenuItems();
        List<MenuItem> expected = new ArrayList<MenuItem>();
        assertEquals(expected, menuItems);
    }

    @Test
    public void testGiveMenuItemsGivesAListOfItemsAddedInTheList() {
        menu.addMenuItem(new MenuItem("List Books"));
        List<MenuItem> menuItems = menu.giveMenuItems();
        List<MenuItem> expected = new ArrayList<MenuItem>();
        expected.add(new MenuItem("List Books"));
        assertTrue(expected.equals(menuItems));
    }
}