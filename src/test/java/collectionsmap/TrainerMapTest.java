package collectionsmap;

import introjunit.Trainer;
import org.junit.Test;


import java.util.*;
import java.util.Map;

import static org.junit.Assert.assertEquals;


class TrainerMapTest {

    @Test
    public void TestTrainer() {
        List<TrainerMap> trainers = Arrays.asList(
                new TrainerMap(1L, "John"),
                new TrainerMap(2L, "John"),
                new TrainerMap(3L, "Jane"),
                new TrainerMap(4L, "Joe")
        );
        Map<Long, TrainerMap> m = new HashMap<>();
        for (TrainerMap t: trainers) {
            m.put(t.getId(), t);
        }

        TrainerMap t = m.get(3L);
        assertEquals(t.getName(), "Jane");
    }

}