package lambdaintro;


@FunctionalInterface
public interface Condition {

    boolean test(Employee employee);

    // ezt nem fogja engedi!!!
    // boolean m();
}


