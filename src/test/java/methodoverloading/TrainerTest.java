package methodoverloading;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TrainerTest {

    @Test
    public void addCourse() {
        Trainer trainer = new Trainer();
        trainer.addCourse("Course1");
        trainer.addCourse(new Course("Course2"));

        assertEquals("Course1", trainer.getCourses().get(0).getName());
    }
}
