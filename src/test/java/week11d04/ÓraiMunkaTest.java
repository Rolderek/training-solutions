package week11d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ÓraiMunkaTest {

    //JUnit4-ben volt a @ExpectedException(Illegalblablabla...)
    //JUnit5-ben

    @Test
    void printNumber() {
        assertThrows(IllegalArgumentException.class, () -> new ÓraiMunka().printNumber(-6));
    }
}