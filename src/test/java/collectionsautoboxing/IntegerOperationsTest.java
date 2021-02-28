package collectionsautoboxing;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


class IntegerOperationsTest {

    @Test
    public void testAutoboxing() {
        List<Integer> l = new ArrayList<>();
        l.add(5);

        int i = l.get(0);
        assertEquals(i, 5);

        l.add(8);
       // for (int j: l) {
       //     System.out.println(j);
        // }

        l.add(null);
        assertEquals(l.get(2), null);
    }

    @Test
    public void testMap() {
        Map<Character, Integer> m = new HashMap<>();
        m.put('a', 1);
        //int j = m.get('a') ++; e helyett az alsó
        m.put('a', m.get('a') + 1);
        assertEquals(java.util.Optional.ofNullable(m.get('a')), 2);
    }

    //házi tesztelése

    @Test
    public void testCreateList() {
        IntegerOperations io = new IntegerOperations();
        assertEquals(5, io.createList(6, 5, 4, 5, 3).size());
    }

}