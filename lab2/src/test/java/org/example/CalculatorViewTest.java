package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorViewTest {

    private CalculatorViewClass calculatorView;

    @BeforeEach
    void setUp() {
        calculatorView = new CalculatorViewClass("5", "10");
    }

    @Test
    void testPrintResult() {
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        calculatorView.printResult(3.0);

        String expected = "Результат вычисления: 3.0";
        String actual = outContent.toString();

        assertEquals(expected.trim(), actual.trim());
    }

    @Test
    void testDisplayError() {
        final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        calculatorView.displayError("Деление на ноль");

        String expected = "Полученная ошибка: Деление на ноль";
        String actual = outContent.toString();

        assertEquals(expected.trim(), actual.trim());
    }

    @Test
    void testGetFirstArgumentAsString() {
        assertEquals("5", calculatorView.getFirstArgumentAsString());
    }

    @Test
    void testGetSecondArgumentAsString() {
        assertEquals("10", calculatorView.getSecondArgumentAsString());
    }
}
