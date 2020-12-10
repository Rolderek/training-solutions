package introheritance;

public class Employee extends Human {

    private double salary;

    public Employee(String name, String address, double sallary) {
        //super(name, address);
        this.salary = sallary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(int percent) {
        this.salary += this.salary * (1.0 * percent / 100);
    }
}
