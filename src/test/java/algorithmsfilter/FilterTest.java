package algorithmsfilter;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class FilterTest {

    @Test
    void filterByName() {
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("Jhon Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1970));
        trainers.add(new Trainer("Jhon Smith", 1970));

        List<Trainer> filteredTrainers = new Filter().filterByName(trainers, "Doe");

        assertEquals(2, filteredTrainers.size());
        assertEquals("Jhon Doe", filteredTrainers.get(0).getName());
        assertEquals("Jack Doe", filteredTrainers.get(1).getName());
    }
}