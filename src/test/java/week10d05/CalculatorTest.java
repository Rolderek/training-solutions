package week10d05;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

class CalculatorTest {

    @Test
    void findMinSum() {
        assertEquals(13, new Calculator().findMinSum(new int[]{1, 9, 3, 7, 2}));
        assertEquals(14, new Calculator().findMinSum(new int[]{5, 4, 3, 7, 2}));
    }

/*
    @Test
    void findMinSum2() {
        assertEquals(13, new Calculator().findMinSum2(new int[]{1, 9, 3, 7, 2}));
    }

 */
}