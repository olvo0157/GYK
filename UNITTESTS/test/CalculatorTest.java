import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Assertions.assertEquals(5, calculator.addition(2, 3));
    }

    @Test
    public void testSubtraction() {
        Assertions.assertEquals(5, calculator.subtraction(7, 2));
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(6, calculator.multiplication(2, 3));
    }

    @Test
    public void testDivisionWhenSecondArgumentIsNotZero() throws IllegalArgumentException {

        Assertions.assertEquals(5, calculator.division(15, 3));
    }

    @Test
    public void testDivisionWhenSecondArgumentIsZero() throws IllegalArgumentException {

        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.division(15, 0));
    }

    @Test
    public void testCalculationOfRemainderAfterDivision() {
        Assertions.assertEquals(5, calculator.remainderAfterDivision(17, 6));
    }
}
