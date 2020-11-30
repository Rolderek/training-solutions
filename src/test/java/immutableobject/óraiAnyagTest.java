package immutableobject;

import immutable.ÓraiAnyag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class óraiAnyagTest {

    @Test
    public void testÓraiAnyag() {
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        ÓraiAnyag óraianyag = new ÓraiAnyag("Jhon Doe", 1970, courses);

        óraianyag.getCourses().add("C#");

        assertEquals(2, óraianyag.getCourses().size());
    }
}
