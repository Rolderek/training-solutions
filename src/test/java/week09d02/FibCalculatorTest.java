package week09d02;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FibCalculatorTest {

    @Test
    public void fibcalculatorTest() {
        FibCalculator fibCalculator = new FibCalculator();
        assertEquals(10, fibCalculator.sumEvens(10));
    }
}
