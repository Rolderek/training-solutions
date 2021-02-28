package exam03retake01;
import org.junit.Test;

import static org.junit.Assert.*;

class CdvCheckTest {

    @Test
    void check() {
        assertTrue(new CdvCheck().check("8365670003"));
        assertFalse(new CdvCheck().check("8365670004"));
    }
/*
    @Test
    void notNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> new CdvCheck().check("123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new CdvCheck().check("12345a7890"));
    }

 */
}

