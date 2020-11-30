package week05d02;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {
    @Test
    void testVhangeLetters() {
        assertEquals("*p*c*k*f*nd*l*k*c*c*l*l*", new ChangeLetter().changeVowels("apacukafundalukacocalola"));
    }
}
