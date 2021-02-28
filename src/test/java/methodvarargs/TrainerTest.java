package methodvarargs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertThat;

public class TrainerTest {
    @Test
    public void testAddCourse() {
        Trainer trainer = new Trainer("Jhon Doe");
        trainer.addCourse("Courde1"); // ha több van vesszőverl kell elválasztani

        assertEquals(trainer.getCourses(),equals(1));
    }
}
