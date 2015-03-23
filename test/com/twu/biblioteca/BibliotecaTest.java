package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void testGetWelcomeMessageShouldGiveTheWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();
        StringBuilder expected = new StringBuilder();
        expected.append("*************************");
        expected.append(System.lineSeparator());
        expected.append("**Welcome to Biblioteca**");
        expected.append(System.lineSeparator());
        expected.append("*************************");
        assertEquals(String.valueOf(expected), biblioteca.getWelcomeMessage());
    }
}
