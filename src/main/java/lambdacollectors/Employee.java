package lambdacollectors;

public class Employee {

    private Long id;
    private String name;
    private int salry;
    private String division;

    public Employee(Long id, String name, int salry, String division) {
        this.id = id;
        this.name = name;
        this.salry = salry;
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salry;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
