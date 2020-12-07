import org.junit.jupiter.api.Test;
import training.EmployeeService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceTest {

    @Test
    public void testTryChangeValues() {
        int originalYearOfBirth = 1980;
        String originalName = "Jack";
        List<String> originalCourses = new ArrayList<>();
        new EmployeeService().tryChangeValues(originalYearOfBirth, originalName, originalCourses);


        assertEquals(1, originalCourses.size());

    }
}
