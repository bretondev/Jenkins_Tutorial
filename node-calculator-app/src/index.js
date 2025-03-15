const Calculator = require("./calculator");

const calculator = new Calculator();

console.log("Addition: 10 + 5 =", calculator.add(10, 5));
console.log("Subtraction: 10 - 5 =", calculator.subtract(10, 5));
console.log("Multiplication: 10 * 5 =", calculator.multiply(10, 5));
console.log("Division: 10 / 5 =", calculator.divide(10, 5));
