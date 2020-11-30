package introjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class GentlemanTest {

    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("Jhon Doe");

        String name = trainer.getName();

       assertEquals("Jhon Doe", name);
    }
}
