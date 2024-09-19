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
}