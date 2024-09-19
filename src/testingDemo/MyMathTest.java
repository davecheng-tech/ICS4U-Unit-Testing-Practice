package testingDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    @Test
    public void shouldReturnSum_whenAddingTwoNumbers() {
        assertEquals(5, MyMath.add(2, 3));
    }

    @Test
    public void shouldGiveError_whenAddingTwoNumbers() {
        assertEquals(50, MyMath.add(25, 25));
    }

    @Test
    public void shouldReturnPowerWithPositiveExponent() {
        assertEquals(1, MyMath.power(10, 0));
    }
    @Test
    public void shouldReturnPowerWithNegativeExponent() {
        assertEquals(1/10000, MyMath.power(10, -5));
    }
}
