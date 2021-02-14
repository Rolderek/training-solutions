package lambdaintro;

import java.util.List;
import java.util.function.Predicate;


public class EmployeeService {

    public Employee findFirst(List<Employee> employees, Condition condition) {
        for (Employee employee: employees) {
            if (condition.test(employee)) {
                return employee;
            }
        }
        throw new IllegalArgumentException("Employee not found");
    }
//Predicate-el
    public Employee fFindFirst(List<Employee> employees, Predicate<Employee> condition) {
        for (Employee employee: employees) {
            if (condition.test(employee)) {
                return employee;
            }
        }
        throw new IllegalArgumentException("Employee not found");
    }
}
