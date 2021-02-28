package exam03retake01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class OwlCounterTest {

    @Test
    void load() throws IOException {
        OwlCounter owlCounter = new OwlCounter();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(OwlCounterTest.class.getResourceAsStream("owls.txt")))) {
            owlCounter.readFromFile(reader);
        }
        assertEquals(java.util.Optional.of(1000), owlCounter.getNumberOfOwls("Bács-Kiskun"));
        assertEquals(java.util.Optional.of(893), owlCounter.getNumberOfOwls("Somogy"));
        assertEquals(java.util.Optional.of(135), owlCounter.getNumberOfOwls("Zala"));
    }


}