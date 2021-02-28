package immutableobject;

import immutable.ÓraiAnyag;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;


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
