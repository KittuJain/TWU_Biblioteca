package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {
    private Library lib;
    private Menu menu;

    public Biblioteca(Library lib) {
        this.lib = lib;
        menu = new Menu();
    }

    public void run() {
        System.out.println(getWelcomeMessage());
        lib.addBook(new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle"));
        lib.addBook(new Book("Wings of Fire", "A. P. J. Abdul Kalam"));
        lib.addBook(new Book("Ramayana", "Valmiki"));
        lib.addBook(new Book("Five Point Someone", "Chetan Bhagat"));
        System.out.println("---------------------------------------");
        menu.addMenuItem(new MenuItem("List Books"));
        System.out.println(getMenu(menu));
    }

    public String getWelcomeMessage() {
        StringBuilder welcomeMessage = new StringBuilder();
        welcomeMessage.append("*************************");
        welcomeMessage.append(System.lineSeparator());
        welcomeMessage.append("**Welcome to Biblioteca**");
        welcomeMessage.append(System.lineSeparator());
        welcomeMessage.append("*************************");
        return String.valueOf(welcomeMessage);
    }

    public String getBookList() {
        List<Book> bookList = lib.getAllBooks();
        StringBuilder sb = new StringBuilder();
        sb.append("*************List Of Books*************");
        for (Book book : bookList){
            sb.append(System.lineSeparator());
            sb.append(book);
        }
        return String.valueOf(sb);
    }

    public String getMenu(Menu menu) {
        int menuItemCode = 0;
        List<MenuItem> menuItems = menu.giveMenuItems();
        StringBuilder sb = new StringBuilder();
        sb.append("********** List Of Options **********");
        for (MenuItem menuItem : menuItems) {
            sb.append(System.lineSeparator());
            sb.append(++menuItemCode);
            sb.append(": ");
            sb.append(menuItem);
        }
        return String.valueOf(sb);
    }
}
