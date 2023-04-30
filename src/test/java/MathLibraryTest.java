import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MathLibraryTest {
    @Test
    public void testPlus() {
        Assertions.assertEquals(10.0, MathLibrary.plus(4, 6));
    }
    @Test
    public void testPlusWithManyComponents() {
        Assertions.assertEquals(6.0, MathLibrary.plus(1, 2, 3));
    }
    @Test
    public void testMinus() {
        Assertions.assertEquals(3.0, MathLibrary.minus(10, 7));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(25.0, MathLibrary.multiply(5.0, 5.0));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(4.0, MathLibrary.divide(12.0, 3.0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathLibrary.divide(1.0, 0.0));
    }
}