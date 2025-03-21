package example;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int sum = Calculator.add(1, 2);
        assertEquals(3, sum, "1 + 2 should equal 3");
    }

    @Test
    public void testMultiply() {
        int p = Calculator.multiply(3, 4);
        assertEquals(12, p, "3 * 4 should equal 12");
    }
}
