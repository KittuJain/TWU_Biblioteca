package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {
    private Library lib;

    public Biblioteca(Library lib) {
        this.lib = lib;
    }

    public void run() {
        System.out.println(getWelcomeMessage());
        lib.addBook(new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle"));
        lib.addBook(new Book("Wings of Fire", "A. P. J. Abdul Kalam"));
        lib.addBook(new Book("Ramayana", "Valmiki"));
        lib.addBook(new Book("Five Point Someone", "Chetan Bhagat"));
        System.out.println(getBookList());
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
        sb.append("List Of Books");
        for (Book book : bookList){
            sb.append(System.lineSeparator());
            sb.append(book);
        }
        return String.valueOf(sb);
    }
}
