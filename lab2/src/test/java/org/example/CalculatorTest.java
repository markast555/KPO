package org.example;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    CalculatorClass calculator = new CalculatorClass();

    @Test
    void testSum() {
        assertEquals(2222.0, calculator.sum(2200.0, 22.0));
        assertEquals(-1.0, calculator.sum(-2.0, 1.0));
    }

    @Test
    void testSubtract() {
        assertEquals(3500.0, calculator.subtract(3502.0, 2.0));
        assertEquals(-3.0, calculator.subtract(-2.0, 1.0));
    }

    @Test
    void testMultiply() {
        assertEquals(88.0, calculator.multiply(44.0, 2.0));
        assertEquals(-2.0, calculator.multiply(-2.0, 1.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0));
        assertEquals(-2.0, calculator.divide(-6.0, 3.0));
    }

    @Test
    void testDivideThrowsException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(1.0, 1e-9);
        });
        assertEquals("Значение b слишком мало: |b| < 10e-8", exception.getMessage());
    }
}
