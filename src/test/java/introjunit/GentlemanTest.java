package introjunit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class GentlemanTest {

    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("Jhon Doe");

        String name = trainer.getName();

       assertEquals("Jhon Doe", name);
    }
}
