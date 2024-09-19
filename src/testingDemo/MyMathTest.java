package testingDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    @Test
    public void shouldReturnSum_whenAddingTwoNumbers() {
        assertEquals(5, MyMath.add(2, 3));
    }

    @Test
    public void shouldReturnWrongSum_whenAddingTwoNumbers() {
        assertEquals(9, MyMath.add(6, 3));
        assertEquals(9, MyMath.power(3, 2));
    }

    @Test
    public void shouldReturnCorrectPower_whenUsingPositiveExponent() {
        assertEquals(9, MyMath.power(3, 2));
    }

    @Test
    public void shouldReturnCorrectPower_whenBaseOfZero() {
        assertEquals(0, MyMath.power(0, 2));
    }

    @Test
    public void shouldReturnCorrectPower_whenNegativeBaseAndPositiveExponent() {
        assertEquals(-27, MyMath.power(-3, 3));
        assertEquals(9, MyMath.power(-3, 2));
    }

    @Test
    public void shouldReturnCorrectPower_whenNegativeBaseAndNegativeExponent() {
        assertEquals(Math.pow(-2, -3), MyMath.power(-2, -3));
        assertEquals(Math.pow(-3, -2), MyMath.power(-3, -2));
    }

    @Test
    public void shouldReturnCorrectPower_whenUsingNegativeExponent() {
        assertEquals(0.125, MyMath.power(2, -3));
    }

    @Test
    public void shouldReturnCorrectPower_whenExponentIs_negative1() {
        assertEquals(0.5, MyMath.power(2, -1));
    }

}