package com.twu.biblioteca;

public class MenuItem {

    private String menuItem;

    public MenuItem(String menuItem) {

        this.menuItem = menuItem;
    }

    @Override
    public String toString() {
        return menuItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem1 = (MenuItem) o;

        if (!menuItem.equals(menuItem1.menuItem)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return menuItem.hashCode();
    }
}
