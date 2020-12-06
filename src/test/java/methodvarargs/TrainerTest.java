package methodvarargs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.assertThat;

public class TrainerTest {
    @Test
    public void testAddCourse() {
        Trainer trainer = new Trainer("Jhon Doe");
        trainer.addCourse("Courde1"); // ha több van vesszőverl kell elválasztani

        assertEquals(trainer.getCourses(),equals(1));
    }
}
