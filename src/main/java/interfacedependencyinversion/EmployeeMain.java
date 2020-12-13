package interfacedependencyinversion;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee(10000, new PercentBonusCalculator());
        System.out.println(employee.getBonus());

        Employee anotherEmployee = new Employee(10000,  new FixdBonusCalculator());
        System.out.println(anotherEmployee.getBonus());
    }
}
