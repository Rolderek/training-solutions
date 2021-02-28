package collectionslist;



import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;


class CollectionslistTest {

    @Test
    public void testList() {
        List<String> l = new LinkedList<>(); //arrayList-el is működik itt attól függ mit akarunk csinálni
        l.add("John");
        l.add("Jack");
        assertEquals(l, Arrays.asList("John", "Jack"));


        Collection<String> c = l;
        c.add("Jane");
        assertEquals(c, Arrays.asList("John", "Jack", "Jane"));

        c.remove("Jack");
        assertEquals(c, Arrays.asList("John", "Jane"));
        assertEquals(c.isEmpty(), false);
        assertEquals(c.size(), 2);
        assertEquals(c.contains("Jack"), false);
        assertEquals(c.contains("Jane"), true);

        c.clear();
        assertEquals(l.isEmpty(), true);

        l.add(0, "Jack");
        assertEquals(l.get(0), "Jack");
        l.add("Jane");
        assertEquals(l.indexOf("Jane"), 1);
        l.add("Jack");
        assertEquals(l.lastIndexOf("Jack"), 2);
        l.set(1, "Joe");
        assertEquals(l.get(1), "Joe");
    }

}