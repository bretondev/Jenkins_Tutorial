const Calculator = require("../src/calculator");

describe("Calculator Tests", () => {
    let calculator;

    beforeEach(() => {
        calculator = new Calculator();
    });

    test("Addition of 10 + 5 should return 15", () => {
        expect(calculator.add(10, 5)).toBe(15);
    });

    test("Subtraction of 10 - 5 should return 5", () => {
        expect(calculator.subtract(10, 5)).toBe(5);
    });

    test("Multiplication of 10 * 5 should return 50", () => {
        expect(calculator.multiply(10, 5)).toBe(50);
    });

    test("Division of 10 / 5 should return 2", () => {
        expect(calculator.divide(10, 5)).toBe(2);
    });

    test("Division by zero should throw an error", () => {
        expect(() => calculator.divide(10, 0)).toThrow("Cannot divide by zero");
    });
});
