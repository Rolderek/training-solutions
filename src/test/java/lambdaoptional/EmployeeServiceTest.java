package lambdaoptional;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;



class EmployeeServiceTest {

    @Test
    public void testFindFirst() {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe"),
                new Employee("Jane Doe"),
                new Employee("Jack Doe")
        );

        Optional<Employee> result = new EmployeeService().findFirst(employees, employee -> employee.getName().startsWith("Jane"));
        //ha elírsz valamit akkor az isPresent false lesz
        //ha üres a doboz és get-et hívsz rajta akkor nószácselementsz kivételt dob :)
        assertEquals(true,result.isPresent());
        assertEquals("Jane Doe",result.get().getName());
    }

    @Test
    public void testNoFindFirst() {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe"),
                new Employee("Jane Doe"),
                new Employee("Jack Doe")
        );

        new EmployeeService().findFirst(employees, employee -> employee.getName().startsWith("János")).orElseThrow(() -> new IllegalArgumentException("Not found!"));


    }

    @Test
    public void testDefaultFindFirst() {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe"),
                new Employee("Jane Doe"),
                new Employee("Jack Doe")
        );

        Employee result = new EmployeeService().findFirst(employees,
                employee -> employee.getName().startsWith("János")).orElse(new Employee("Anonymous"));
        assertEquals("Anonymous", result.getName());
    }

    @Test
    public void testDefaultGetFindFirst() {
        List<Employee> employees = Arrays.asList(
                new Employee("John Doe"),
                new Employee("Jane Doe"),
                new Employee("Jack Doe")
        );

        Employee result = new EmployeeService().findFirst(employees,
                employee -> employee.getName().startsWith("János")).orElseGet(() -> new Employee("Anonymous"));
        assertEquals("Anonymous", result.getName());
    }
}