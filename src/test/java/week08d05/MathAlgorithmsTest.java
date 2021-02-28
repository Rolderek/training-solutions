package week08d05;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

class MathAlgorithmsTest {

    @Test
    void greatestCommonDivisorFirst() {
        assertEquals(41, new MathAlgorithms().greatestCommonDivisorFirst(41, 82));
        assertEquals(3, new MathAlgorithms().greatestCommonDivisorFirst(6, 3));
        assertEquals(1, new MathAlgorithms().greatestCommonDivisorFirst(1, 1));
    }

    @Test
    void greatestCommonDivisorSecond() {
        assertEquals(6, new MathAlgorithms().greatestCommonDivisorSecond(6, 12));
        assertEquals(3, new MathAlgorithms().greatestCommonDivisorSecond(3, 9));
    }

    @Test
    void greatestCommonDivisorThird() {
        assertEquals(1, new MathAlgorithms().greatestCommonDivisorThird(1, 3));
        assertEquals(8, new MathAlgorithms().greatestCommonDivisorThird(8, 16));
    }

    @Test
    void greatestCommonDivisorFouth() {
        assertEquals(5, new MathAlgorithms().greatestCommonDivisorFouth(5, 25));
        assertEquals(2, new MathAlgorithms().greatestCommonDivisorFouth(2, 4));
    }
}