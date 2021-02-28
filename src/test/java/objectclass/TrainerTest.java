package objectclass;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Collections;

public class TrainerTest {

    @Test
    public void testCreate() {
        //Object obj = new Trainer("Jocó", 19);
       // Object[] array = new Object[2];
        //array[0] = "valami";
        //array[1] = new Human("Laci", 20);
        System.out.println(new Trainer("Jhon Doe", 30, Collections.emptyList()));
    }
}
