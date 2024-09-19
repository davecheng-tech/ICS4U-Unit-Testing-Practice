import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    @Test
    public void shouldReturnSum_whenAddingTwoNumbers() {
        assertEquals(8, MyMath.power(2, 3));
    }
    @Test
    public void shouldReturnNegativeExponentAnswer() {
        assertEquals(0.125, MyMath.power(2, -3));
    }
}