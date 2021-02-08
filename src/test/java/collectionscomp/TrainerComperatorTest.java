package collectionscomp;

import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainerComperatorTest {

    @Test
    public void testSort() {
        List<String> names = Arrays.asList("Joe", "Jack", "Jane");

        Collections.sort(names);

        assertEquals(Arrays.asList("Jack", "Jane", "Joe"), names);
    }

    @Test
    public void testTrainersSort() {
        List<TrainerComperator> trainers = Arrays.asList(
                new TrainerComperator("Joe", 3),
                new TrainerComperator("Jack", 2),
                new TrainerComperator("Jane", 1)
        );
        Collections.sort(trainers);
        assertEquals("Jack", trainers.get(0).name);

        Collections.sort(trainers, new Comparator<TrainerComperator>() {
            //ez is meg a belső soztály is ugyan úgy működik
            @Override
            public int compare(TrainerComperator o1, TrainerComperator o2) {
                return o1.salary - o2.salary;
            }
        });
        assertEquals("Jane", trainers.get(0).getName());

        Collections.sort(trainers, new Comparator<TrainerComperator>() {
            @Override
            public int compare(TrainerComperator o1, TrainerComperator o2) {
                return o1.name.length() - o2.name.length();
            }
        });
        assertEquals("Joe", trainers.get(0).getName());
    }

    //belső soztályként hívta meg csak hogy egyszerűbb legyen
    public class SalaryComparator implements Comparator<TrainerComperator> {

        @Override
        public int compare(TrainerComperator o1, TrainerComperator o2) {
            return o1.salary - o2.salary;
        }
    }

    @Test
    public void testSortWithAccutes() {
        //a betűket a karakter kódjuk alapján rendezi
        List<String> names = Arrays.asList("Joe", "Jack", "Jane", "Ábel", "éva", "jack");

        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));

        assertEquals(Arrays.asList("Ábel", "éva", "jack", "Jack", "Jane", "Joe"), names);
    }

}