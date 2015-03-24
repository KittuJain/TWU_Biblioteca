package com.twu.biblioteca;

public class Book {
    private String bookName;
    private String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!author.equals(book.author)) return false;
        if (!bookName.equals(book.bookName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookName.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  bookName + " - " +author;
    }
}
