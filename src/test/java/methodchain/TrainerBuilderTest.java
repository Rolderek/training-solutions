package methodchain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrainerBuilderTest {

    @Test
    public void build() {
        TrainerBuilder trainerBuilder = new TrainerBuilder().withName("Jhon Doe").withAge(30);
        Trainer trainer = trainerBuilder.build();

        Trainer trainer1 = new TrainerBuilder()
                .withName("Jhon Doe")
                .withAge(30)
                .build();

        assertEquals(trainer.getName(), ("Jhon Doe"));
        assertEquals(trainer1.getName(), ("Jhon Doe"));
    }
}
