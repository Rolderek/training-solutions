package collectionsclass;



import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;


class CollesctionTest {

    @Test
    public void testCollections() {
        //List<Integer> l = Collections.EMPTY_LIST;
        //List<Integer> l = new ArrayList<>();
        //List<Integer> l = Collections.emptyList();
        //List<Integer> l = Collections.singletonList(1);
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        List<Integer> l = Collections.unmodifiableList(elements);

        elements.add(3);
//ez elements re mutat az l és az elementsen kerestül lehet módosítani
        assertEquals(3, l.size());
    }

    @Test
    public void testReverse() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        Collections.reverse(l);
        System.out.println(l);
    }

    @Test
    public void testShuffle() {
        List<Integer> l = new ArrayList<>();
        Random random = new Random(5);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        Collections.shuffle(l, random);
        System.out.println(l);
        assertEquals(Optional.of(4), l.get(0));
        assertEquals(Optional.of(1), l.get(1));
        assertEquals(Optional.of(2), l.get(2));
        assertEquals(Optional.of(3), l.get(3));
    }

}