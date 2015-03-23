package com.twu.biblioteca;

public class Biblioteca {
    public String getWelcomeMessage() {
        StringBuilder welcomeMessage = new StringBuilder();
        welcomeMessage.append("*************************");
        welcomeMessage.append(System.lineSeparator());
        welcomeMessage.append("**Welcome to Biblioteca**");
        welcomeMessage.append(System.lineSeparator());
        welcomeMessage.append("*************************");
        return String.valueOf(welcomeMessage);
    }
}
