package sorting;

import org.junit.jupiter.api.Test;
import searching.Trainer;

import javax.swing.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @Test
    public void testSortArray() {
        int[] i = {3, 1, 6, 9 ,5 ,3};
        Arrays.sort(i);
        assertEquals(3, i[1]);
    }

    @Test
    public void testSortList() {
        List<Integer> i = Arrays.asList(3, 1, 6, 9 ,5 ,3);
        Collections.sort(i);
        assertEquals(5, i.get(3));

        i = Arrays.asList(3, 1, 6, 9 ,5 ,3);
        i.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(i);
    }



    @Test
    public void testSet() {
        Set<Sorting> s = new TreeSet<>(new Comparator<Sorting>() {
            @Override
            public int compare(Sorting o1, Sorting o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        s.add(new Sorting("Jack", 3));
        s.add(new Sorting("Joe", 2));
        s.add(new Sorting("Jane", 1));

    }


}