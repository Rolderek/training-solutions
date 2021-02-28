package collectionsset;



import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


class SetTest {

    @Test
    public void testSet() {
        Set<TrainerSet> s = new HashSet<>();
        s.add(new TrainerSet( "Jack"));
        s.add(new TrainerSet( "Jack"));
        assertEquals(s.size(), 1);

        /*
        Collection<String> c = s;
        c.add("John");
        c.add("Jack");
        c.add("John");

        System.out.println(c);

         */
    }

    @Test
    public void testSetLinkedHashSet() {
        Set<TrainerSet> s = new LinkedHashSet<>();
//egymás utániságban járható be igy az objektum
        s.add(new TrainerSet( "Jane"));
        s.add(new TrainerSet( "Jack"));
        System.out.println(s);
        for (TrainerSet t: s) {
            System.out.println(t.getName());
        }

    }

}