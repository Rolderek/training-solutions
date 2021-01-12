package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinSum() {
        assertEquals(13, new Calculator().findMinSum(new int[]{1, 9, 3, 7, 2}));
        assertEquals(14, new Calculator().findMinSum(new int[]{5, 4, 3, 7, 2}));
    }
}