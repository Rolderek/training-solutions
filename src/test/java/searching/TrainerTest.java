package searching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testArraySearch() {
        int[] i = {1, 3, 5, 6, 7, 9, 12, 4};
        Arrays.sort(i);

        int index = Arrays.binarySearch(i, 5);
        assertEquals(3, Arrays.binarySearch(i, 5));
        assertEquals(-9, Arrays.binarySearch(i, 20));
    }

    @Test
    public void testListSearch() {
        List<Integer> i = Arrays.asList(1, 3, 5, 6, 7, 9, 12);
        assertEquals(3, Collections.binarySearch(i, 6));

        assertEquals(true, (i.contains(6)));
        assertEquals(false, (i.contains(20)));

        assertEquals(true, (i.containsAll(Arrays.asList(1, 7))));
        assertEquals(false, (i.containsAll(Arrays.asList(1, 20))));

        assertEquals(3, (i.indexOf(6)));
        assertEquals(-1, (i.indexOf(20)));

        assertEquals(1, (Collections.min(i)));
        assertEquals(12, (Collections.max(i)));

        List<Trainer> trainers = Arrays.asList(new Trainer("Jhon", 3),
                new Trainer("Jack", 2),
                new Trainer("Jane", 1));

        assertEquals("Jane", Collections.min(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.getSalary() - o2.getSalary();
            }
        }).getName());
        //ide kell a get name ha így csinálom mert különben a tömb memória címét adja vissza vagy mit
    }
}


