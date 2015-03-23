package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void testGetWelcomeMessageShouldGiveTheWelcomeMessage() {
        Biblioteca biblioteca = new Biblioteca();
        String expected = "Welcome to Biblioteca";
        assertEquals(expected, biblioteca.getWelcomeMessage());
    }
}
