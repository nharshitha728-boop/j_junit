package com.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Logic Experiment")
class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    @DisplayName("Basic Addition")
    void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    @DisplayName("Addition with Zero")
    void testAddZero() {
        assertEquals(5, calc.add(5, 0));
    }

    @Test
    @DisplayName("Basic Multiplication")
    void testMultiply() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    @DisplayName("Multiply by Zero")
    void testMultiplyZero() {
        assertEquals(0, calc.multiply(10, 0));
    }

    @Test
    @DisplayName("Multiply by One")
    void testMultiplyOne() {
        assertEquals(10, calc.multiply(10, 1));
    }
}
