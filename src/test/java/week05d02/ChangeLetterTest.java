package week05d02;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class ChangeLetterTest {
    @Test
    void testVhangeLetters() {
        assertEquals("*p*c*k*f*nd*l*k*c*c*l*l*", new ChangeLetter().changeVowels("apacukafundalukacocalola"));
    }
}
