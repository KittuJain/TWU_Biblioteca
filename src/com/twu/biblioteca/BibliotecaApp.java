package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    private final Library lib;
    private Biblioteca biblioteca;
    private Menu menu;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();
    List<Book> bookList = new ArrayList<Book>();


    public BibliotecaApp(Library lib, Biblioteca biblioteca) {
        this.lib = lib;
        this.biblioteca = biblioteca;
        menu = new Menu();
    }

    public void run() {
        boolean KEEP_RUNNING = true;
        System.out.println(biblioteca.getWelcomeMessage());
        lib.addBook(new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle"),bookList);
        lib.addBook(new Book("Wings of Fire", "A. P. J. Abdul Kalam"), bookList);
        lib.addBook(new Book("Ramayana", "Valmiki"), bookList);
        lib.addBook(new Book("Five Point Someone", "Chetan Bhagat"), bookList);
        System.out.println("---------------------------------------");
        menu.addMenuItem(new MenuItem("List Books"), menuItems);
        while (KEEP_RUNNING) {
            System.out.println(System.lineSeparator() + biblioteca.getMenu(menuItems));
            System.out.println("Enter option number:");
            Scanner scan = new Scanner(System.in);
            biblioteca.optionHandler(scan.nextInt());
        }
    }
}