package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItems;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        if (!menuItems.equals(menu.menuItems)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return menuItems.hashCode();
    }

    public Menu() {
        this.menuItems = new ArrayList<MenuItem>();
    }

    public boolean addMenuItem(MenuItem menuItem) {
        int numberOfItems = menuItems.size();
        menuItems.add(menuItem);
        return (menuItems.size() > numberOfItems);
    }

    public List<MenuItem> giveMenuItems() {
        return menuItems;
    }
}
