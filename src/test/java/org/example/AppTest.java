package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAddme() {
        // Test adding two positive numbers
        assertEquals("Adding two positive numbers should be correct", 16, App.addme(11, 5));

        // Test adding two negative numbers
        assertEquals("Adding two negative numbers should be correct", -16, App.addme(-11, -5));

        // Test adding a positive and a negative number
        assertEquals("Adding a positive and a negative number should be correct", 6, App.addme(11, -5));

        // Test adding zero
        assertEquals("Adding zero should not change the number", 11, App.addme(11, 0));
    }

    @Test
    public void testSubtractme() {
        // Test subtracting two positive numbers
        assertEquals("Subtracting smaller from bigger number should be correct", 6, App.subtractme(11, 5));

        // Test subtracting two negative numbers
        assertEquals("Subtracting two negative numbers should be correct", -6, App.subtractme(-11, -5));

        // Test subtracting a negative number from a positive number
        assertEquals("Subtracting a negative from a positive should increase the number", 16, App.subtractme(11, -5));

        // Test subtracting zero
        assertEquals("Subtracting zero should not change the number", 11, App.subtractme(11, 0));
    }
}
