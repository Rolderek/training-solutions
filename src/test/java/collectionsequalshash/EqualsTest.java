package collectionsequalshash;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EqualsTest {

    @Test
    public void testEquals() {
        String s = new String("Jhon");
        String s2 = new String("Jhon");
        //System.out.println(s == s2);
        //assertEquals(s.equals(s2), true);

        TrainerEquals trainer1 = new TrainerEquals("Jhon Doe", 2000);
        TrainerEquals trainer2 = new TrainerEquals("Jhon Doe", 1990);
        assertEquals(trainer1.equals(trainer2), false);

        TrainerEquals trainer3 = new TrainerEquals("Jhon Doe", 2000);
        assertEquals(trainer1.equals(trainer3), true);

        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(1, 2, 3);
// itt a lista tartalmát nézi csak
        assertEquals(l.equals(l2), true);
    }

    @Test
    public void testHashCode() {
        TrainerEquals trainer = new TrainerEquals("John Doe", 1990);
        //System.out.println(trainer);

        //System.out.println(trainer.hashCode());
        //a hashcodo-ot is felül lehet implementáli

        TrainerEquals trainer1 = new TrainerEquals("John Doe", 1990);
        //System.out.println(trainer1);

        assertEquals(trainer.equals(trainer1), true);
        assertEquals(trainer.hashCode() == trainer1.hashCode(), true);

        TrainerEquals trainer2 = new TrainerEquals("John Doe", 2000);
        assertEquals(trainer.equals(trainer2), false);
    }

}