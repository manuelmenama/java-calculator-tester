package org.lessons.calculator.tester;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest implements Calculator {

    @Test
    @DisplayName("Test addizione")
    void testAdd() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.add(-1,-1), "Nessuna exception lanciata.");
    }

    @Test
    @DisplayName("Test sottrazione")
    void testSubtract() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.subtract(-1,1), "Nessuna exception sollevata.");
        assertThrows(ArithmeticException.class, () -> Calculator.subtract(2,3), "Nessuna eccezione aritmetica sollevata.");
    }

    @Test
    @DisplayName("Test divisione")
    void testDivide() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(-2, -1), "Nessuna eccezione sollevata");
        assertThrows(ArithmeticException.class, () -> Calculator.divide(4,5), "Neesuna eccezione aritmentica sollevata.");
    }

    @Test
    @DisplayName("Test moltiplicazione")
    void testMultiply() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.multiply(1,-2), "Nessuna eccezione sollevata.");
    }
}