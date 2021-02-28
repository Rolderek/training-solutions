package week11d01;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

class DivisorFinderTest {

    @Test
    void findDivisiorJunior() {
        assertEquals(1, new DivisorFinder().findDivisiorJunior(425));
    }
}