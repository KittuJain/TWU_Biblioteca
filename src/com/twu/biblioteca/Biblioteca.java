package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private Library lib;
    private Menu menu;
    private boolean keepRunning;

    public Biblioteca(Library lib) {
        this.lib = lib;
        menu = new Menu();
        keepRunning = true;
    }

    public void run() {
        System.out.println(getWelcomeMessage());
        lib.addBook(new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle"));
        lib.addBook(new Book("Wings of Fire", "A. P. J. Abdul Kalam"));
        lib.addBook(new Book("Ramayana", "Valmiki"));
        lib.addBook(new Book("Five Point Someone", "Chetan Bhagat"));
        System.out.println("---------------------------------------");
        menu.addMenuItem(new MenuItem("List Books"));
        while(keepRunning) {
            System.out.println(System.lineSeparator()+getMenu(menu));
            System.out.println("Enter option number:");
            Scanner scan = new Scanner(System.in);
            optionHandler(scan.nextInt());
        }
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

    public void optionHandler(int menuItemCode) {
        if(menuItemCode == 1){
            System.out.println(getBookList());
        }else
            System.out.println("Invalid Option");
    }
}
