package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void findDivisiorJunior() {
        assertEquals(1, new DivisorFinder().findDivisiorJunior(425));
    }
}