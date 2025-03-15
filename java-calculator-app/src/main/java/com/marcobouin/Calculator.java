package com.marcobouin;

import org.apache.commons.math3.util.ArithmeticUtils;

public class Calculator {

    // Method 1: Addition using commons-math3
    public int add(int a, int b) {
        return ArithmeticUtils.addAndCheck(a, b);  // Handles overflow safely
    }

    // Method 2: Subtraction using commons-math3
    public int subtract(int a, int b) {
        return ArithmeticUtils.addAndCheck(a, b);  // Handles overflow safely
    }

    // Method 3: Multiplication using commons-math3
    public int multiply(int a, int b) {
        return ArithmeticUtils.mulAndCheck(a, b);  // Handles overflow safely
    }

    // Method 4: Division (manual, as commons-math3 does not have a direct method for division)
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Main method for testing
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition (10 + 5): " + calculator.add(10, 5));
        System.out.println("Subtraction (10 - 5): " + calculator.subtract(10, 5));
        System.out.println("Multiplication (10 * 5): " + calculator.multiply(10, 5));
        System.out.println("Division (10 / 5): " + calculator.divide(10, 5));

        // Uncomment to test overflow handling
        // System.out.println("Addition Overflow: " + calculator.add(Integer.MAX_VALUE, 1));
    }
}
