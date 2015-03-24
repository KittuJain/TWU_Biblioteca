package com.twu.biblioteca;

import java.util.List;

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

    public String getBookList(List<Book> bookList) {
        StringBuilder sb = new StringBuilder();
        sb.append("*************List Of Books*************");
        for (Book book : bookList){
            sb.append(System.lineSeparator());
            sb.append(book);
        }
        return String.valueOf(sb);
    }

    public String getMenu(List<MenuItem> menuItemsList) {
        int menuItemCode = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("********** List Of Options **********");
        for (MenuItem menuItem : menuItemsList) {
            sb.append(System.lineSeparator());
            sb.append(++menuItemCode);
            sb.append(": ");
            sb.append(menuItem);
        }
        return String.valueOf(sb);
    }

    public void optionHandler(int menuItemCode) {
        if(menuItemCode == 1){
//            System.out.println(getBookList(bookList));
        }else
            System.out.println("Invalid Option");
    }
}
