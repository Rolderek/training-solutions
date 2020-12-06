package methodchain;

import algorithmssum.transactions.Transaction;
import org.junit.jupiter.api.Test;
//import static org.junit.Assert.assertThat; a francért nem működik már megint!!!!!!

public class TrainerBuilderTest {

    @Test
    public void build() {
        TrainerBuilder trainerBuilder = new TrainerBuilder().withName("Jhon Doe").withAge(30);
        Trainer trainer = trainerBuilder.build();
        //vagy így még szebben néz ki
        Trainer trainer1 = new TrainerBuilder()
                .withName("Jhon Doe")
                .withAge(30)
                .build();

        //assertThat(traner.getName(), equalTo("Jhon Doe"));
    }
}
