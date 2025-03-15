const math = require("mathjs");

class Calculator {
    add(a, b) {
        return math.add(a, b);
    }

    subtract(a, b) {
        return math.subtract(a, b);
    }

    multiply(a, b) {
        return math.multiply(a, b);
    }

    divide(a, b) {
        if (b === 0) {
            throw new Error("Cannot divide by zero");
        }
        return math.divide(a, b);
    }
}

module.exports = Calculator;
