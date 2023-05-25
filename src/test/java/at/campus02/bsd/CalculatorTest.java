package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void testAdd1() {
        Assertions.assertEquals(10, calc.add(4,6));
    }
    @Test
    public void testAdd2() {
        Assertions.assertEquals(200, calc.add(199,1));
    }
    @Test
    public void testAdd3() {
        Assertions.assertEquals(2, calc.add(1,1));
    }
    @Test
    public void testMinus1() {
        Assertions.assertEquals(4, calc.minus(8,4));
    }
    @Test
    public void testMinus2() {
        Assertions.assertEquals(-4, calc.minus(4,8));
    }
    @Test
    public void testMinus3() {
        Assertions.assertEquals(-1, calc.minus(0,1));
    }
    @Test
    public void testDivide1() {
        Assertions.assertEquals(4, calc.divide(8,2));
    }
    @Test
    public void testDivide2() {
        Assertions.assertEquals(-4, calc.divide(-8,2));
    }
    @Test
    public void testDivide3() {
        Assertions.assertEquals(-8, calc.divide(16,-2));
    }
    @Test
    public void testMultiply1() {
        Assertions.assertEquals(4, calc.multiply(2,2));
    }
    @Test
    public void testMultiply2() {
        Assertions.assertEquals(0, calc.multiply(200,0));
    }
    @Test
    public void testMultiply3() {
        Assertions.assertEquals(42, calc.multiply(4,10.5));
    }
}
