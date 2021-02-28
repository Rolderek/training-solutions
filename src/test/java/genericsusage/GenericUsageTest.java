package genericsusage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



class GenericUsageTest {

    @Test
    public void testGenericsUsage() {
        List<String> l = new ArrayList();
        // ha nincs <> ilyenkor bármit bele tudok tenni ebbe a listába
        //l.add(10);
        //ez autoboxingol int-re
        l.add("Jhon Doe");
        l.add("Jane Doe");

        Object c = l.get(0);
        assertEquals(c, "Jhon Doe");

        List<String> l2 = new ArrayList<>();
        Collection<String> l3 = l2;
        //csak akkor működik az értékadás ha egy fentebbi ősét hívom meg
    }

}