package lambdastreams;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamTest extends TestCase {

    List<Employee> employees = Arrays.asList(
            new Employee("John Doe"),
            new Employee("Jane Doe"),
            new Employee("Joe Doe"),
            new Employee("John Smith"));

    @Test
    public void tstCount() {
        // assertEquals(null, Stream.empty().count());

        //assertEquals(2L, Stream.of(new Employee("John Doe"), new Employee("Jack Doe")).count());

        Stream<Employee> s = Stream.of(new Employee("John Doe"), new Employee("Jack Doe"));
        // assertEquals(2, s.count());

        //assertEquals(4L, employees.stream().count());
    }

    @Test
    public void testMin() {
        //Employee employee = employees.stream().min((e1, e2) -> e1.getName().compareTo(e2.getName())).get();
        Employee employee = employees.stream().min(Comparator.comparing(Employee::getName)).get();
        assertEquals("Jane Doe", employee.getName());
    }

    @Test
    public void testFindFirst() {
        Employee employee = employees.stream().findFirst().get();
        assertEquals("John Doe", employee.getName());

    }

    @Test
    public void testMatch() {
        boolean result = employees.stream().allMatch(e -> e.getName().length() > 5);
        assertEquals(true, result);

        assertEquals(false, employees.stream().allMatch(e -> e.getName().startsWith("a")));
    }

    @Test
    public void testForEach() {
        employees.stream().forEach(e -> e.setName(e.getName().toUpperCase()));
        assertEquals("JOHN DOE", employees.get(0).getName());
    }


}