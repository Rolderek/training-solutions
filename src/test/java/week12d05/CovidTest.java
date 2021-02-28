package week12d05;

import org.junit.Test;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

class CovidTest {

    @Test
    public void testWordCounter() {
        Covid covid = new Covid();
        Path file = Path.of("index.html");
        int counter = covid.wordCounter("koronavírus", file);
        assertEquals(11, counter);
    }

    /*
    @Test
    public void testWordCounterGetResWithStream() {
        Covid covid = new Covid();
        InputStream is = CovidTest.class.getResourceAsStream("/testCovid.txt");
        int counter = covid.wordCounterInputStreammel("koronavírus", new BufferedReader(new InputStreamReader(is)));
        assertEquals(2, counter);
    }

     */
}