package com.twu.biblioteca;

import java.util.List;

public class Menu {

    public boolean addMenuItem(MenuItem menuItem, List<MenuItem> menuItemList) {
        int numberOfItems = menuItemList.size();
        menuItemList.add(menuItem);
        return (menuItemList.size() > numberOfItems);
    }
}
