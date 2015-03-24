package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {
    private Library lib;

    public Biblioteca(Library lib) {

        this.lib = lib;
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
