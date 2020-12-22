package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibCalculatorTest {

    @Test
    public void fibcalculatorTest() {
        FibCalculator fibCalculator = new FibCalculator();
        assertEquals(10, fibCalculator.sumEvens(10));
    }
}
