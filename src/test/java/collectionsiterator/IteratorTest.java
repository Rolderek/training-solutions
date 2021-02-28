package collectionsiterator;



import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;


class IteratorTest {

    /*ez hibára fut és azért mert miközben bejárjuka  tömböt ki is akarunk belőle venni elemeket
    @Test
    public void testRemouve() {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        for (int i: l) {
            if (i % 2 == 0) {
                l.remove(Integer.valueOf(i));
            }
        }
    }

     */

    //fontos hogy az i-n kell a remove-ot meghívni és nem az l-en mert akor ugyan az a hiba lesz
    @Test
    public void testRemouve2() {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> i = l.iterator();
        while (i.hasNext()) {
            int j = i.next();
            if (j % 2 == 0) {
                i.remove();
            }
        }
        assertEquals(l, Arrays.asList(1, 3, 5, 7));
    }

}