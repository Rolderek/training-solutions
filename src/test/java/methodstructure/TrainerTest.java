package methodstructure;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrainerTest {

    @Test
    public void testCreate() {
        Trainer trainer = new Trainer ("Jhon Doe");
        trainer.getName();
    }

    @Test
    public void testAdd() {
        Trainer trainer = new Trainer("Shon Doe");
        trainer.addCourse("Course1");

    }

    @Test
    public void testFind() {
        Trainer trainer = new Trainer("Shon Doe");
        trainer.findCoursesBetween('a', 'z'); //sorrendi kötés van! ctrl+p kiírja hogy melyik melyik
    }
}
