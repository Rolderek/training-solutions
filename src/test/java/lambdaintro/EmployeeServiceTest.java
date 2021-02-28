package lambdaintro;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;



class EmployeeServiceTest {

    @Test
    public void testFindFirst() {
        List<Employee> employees = Arrays.asList(
                new Employee("Joh Doe"),
                new Employee("Jane Doe"),
                new Employee("Jack Doe")
        );
        Employee result = new EmployeeService().findFirst(employees, employee -> employee.getName().startsWith("Jane"));
        /*
        ez volt hamarabb és a felsőre cseréltük ki
        Employee result = new EmployeeService().findFirst(employees, new Condition() {
            @Override
            public boolean test(Employee employee) {
                return employee.getName().equals("Jane Doe");
                //return employee.getName().startsWith("Jane Doe"); is lehet
            }
            });
         */

        assertEquals("Jane Doe", result.getName());

        //predicate-es
        Employee rResult = new EmployeeService().fFindFirst(employees, employee -> employee.getName().startsWith("Jane"));

        assertEquals("Jane Doe", rResult.getName());
    }

}