package algorithmstransform;

import introexception.TrainerAgeValidator;
import org.junit.jupiter.api.Test;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransformationsTest {

    @Test
    void toNames() {
        List<Trainer> trainer = new ArrayList<>();
        trainer.add(new Trainer("Jhon Doe", 1970));
        trainer.add(new Trainer("Jack Doe", 1980));

        List<String> name = new Transformations().toNames(trainer);
        assertEquals(2, name.size());
        assertEquals("Jhon Doe", name.get(0));
    }

    @Test
    void toNamesYearOfBirthBefore() {
        List<Trainer> trainer = new ArrayList<>();
        trainer.add(new Trainer("Jhon Doe", 1970));
        trainer.add(new Trainer("Jack Doe", 1980));

        List<String> names = new Transformations().toNamesYearOfBirthBefore(trainer, 1975);
            assertEquals(1, names.size());
            assertEquals("Jhon Doe", names.get(0));
        }
    }
