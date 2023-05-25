# CalculatorTest

The `CalculatorTest` class contains unit tests for the `Calculator` class. It uses the JUnit 5 testing framework to verify the functionality of the calculator's methods.

## Test Cases

### Addition Tests

1. `testAdd1()`: Tests the `add` method of the calculator by adding 4 and 6. It expects the result to be 10.
2. `testAdd2()`: Tests the `add` method of the calculator by adding 199 and 1. It expects the result to be 200.
3. `testAdd3()`: Tests the `add` method of the calculator by adding 1 and 1. It expects the result to be 2.

### Subtraction Tests

1. `testMinus1()`: Tests the `minus` method of the calculator by subtracting 4 from 8. It expects the result to be 4.
2. `testMinus2()`: Tests the `minus` method of the calculator by subtracting 8 from 4. It expects the result to be -4.
3. `testMinus3()`: Tests the `minus` method of the calculator by subtracting 1 from 0. It expects the result to be -1.

### Division Tests

1. `testDivide1()`: Tests the `divide` method of the calculator by dividing 8 by 2. It expects the result to be 4.
2. `testDivide2()`: Tests the `divide` method of the calculator by dividing -8 by 2. It expects the result to be -4.
3. `testDivide3()`: Tests the `divide` method of the calculator by dividing 16 by -2. It expects the result to be -8.

### Multiplication Tests

1. `testMultiply1()`: Tests the `multiply` method of the calculator by multiplying 2 and 2. It expects the result to be 4.
2. `testMultiply2()`: Tests the `multiply` method of the calculator by multiplying 200 and 0. It expects the result to be 0.
3. `testMultiply3()`: Tests the `multiply` method of the calculator by multiplying 4 and 10.5. It expects the result to be 42.

Each test case uses the `Assertions.assertEquals(expected, actual)` method to verify that the actual result matches the expected result.
