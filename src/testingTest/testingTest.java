package testingTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testingTest {

    @Test
    public void shouldReturnSum_whenAddingTwoNumbers() {
        assertEquals(5, MyMath.add(2, 3));
    }

    @Test void shouldReturnExponent_whenAddingTwoNumbers(){
        assertEquals(Math.pow(2.0,-3.0), MyMath.power(2.0,-3.0) );
    }
}