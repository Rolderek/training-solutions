package week11d03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

class WordFilterTest {

    @Test
    void wordWithChar() {
        WordFilter wordFilter = new WordFilter();
        List<String> list = new ArrayList<>();
        list.add("egyedem");
        list.add("begyedem");
        list.add("tengertánc");
        list.add("tenger");
        list.add("elem");
        list.add("emelet");

        assertEquals(Arrays.asList("egyedem", "begyedem", "elem", "emelet"), wordFilter.wordWithChar(list, 'm'));
        assertEquals(Arrays.asList("tengertánc"), wordFilter.wordWithChar(list, 'á'));
    }
}