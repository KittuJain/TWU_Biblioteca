package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {
        Library lib = new Library();
        Biblioteca biblioteca = new Biblioteca(lib);
        System.out.println(biblioteca.getWelcomeMessage());
        System.out.println(biblioteca.getBookList());
    }
}
