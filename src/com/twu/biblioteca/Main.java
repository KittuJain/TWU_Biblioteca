package com.twu.biblioteca;


public class Main {

    public static void main(String[] args) {
        Library lib = new Library();
        BibliotecaApp biblioteca = new BibliotecaApp(lib, new Biblioteca());
        biblioteca.run();
    }
}
