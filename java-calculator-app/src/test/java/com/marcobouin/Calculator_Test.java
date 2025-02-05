package com.marcobouin;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculator_Test {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        // Set up the Calculator instance before each test method
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        // Test addition
        assertEquals(15, calculator.add(10, 5), "Addition should return correct result");
    }

    @Test
    public void testSubtract() {
        // Test subtraction
        assertEquals(5, calculator.subtract(10, 5), "Subtraction should return correct result");
    }

    @Test
    public void testMultiply() {
        // Test multiplication
        assertEquals(50, calculator.multiply(10, 5), "Multiplication should return correct result");
    }

    @Test
    public void testDivide() {
        // Test division
        assertEquals(2.0, calculator.divide(10, 5), "Division should return correct result");

        // Test division by zero (expecting exception)
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
    }

    @Test
    public void testAddOverflow() {
        // Test handling overflow in addition
        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 1), "Addition overflow should throw ArithmeticException");
    }

    @Test
    public void testSubtractOverflow() {
        // Test handling overflow in subtraction
        assertThrows(ArithmeticException.class, () -> calculator.subtract(Integer.MIN_VALUE, 1), "Subtraction overflow should throw ArithmeticException");
    }

    @Test
    public void testMultiplyOverflow() {
        // Test handling overflow in multiplication
        assertThrows(ArithmeticException.class, () -> calculator.multiply(Integer.MAX_VALUE, 2), "Multiplication overflow should throw ArithmeticException");
    }
}
