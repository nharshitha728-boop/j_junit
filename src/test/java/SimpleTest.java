package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        // We expect 10 + 5 to be 15
        assertEquals(15, calc.add(10, 5), "Addition logic is broken!");
    }

    @Test
    void testMultiplication() {
        // We expect 2 * 3 to be 6
        assertEquals(6, calc.multiply(2, 3));
    }
}
