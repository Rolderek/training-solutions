package abstractclass;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class TrainerTest {

    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("Jhon Doe", 30, Arrays.asList(new Course("Course1")));
        trainer.work();
    }
}
