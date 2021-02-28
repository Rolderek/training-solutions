package isahasa;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TrainerTest {

    @Test
    public void testWorkHasCalled() {
        WorkStub workStub = new WorkStub();
        Trainer trainer = new Trainer(workStub);
        trainer.doWork();
        //assertThat(workStub.isCalled(), is(true));
    }

    @Test
    public void testHasNoWork() {
        Trainer trainer = new Trainer(new HasNoWork());
        assertEquals(trainer.doWork(), "");
    }

    //és a többi
}
