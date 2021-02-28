package lambdastreams;

import junit.framework.TestCase;
import org.junit.Test;

import javax.naming.Name;
import java.util.Arrays;
import java.util.List;

public class ReduceTest extends TestCase {

    List<Employee> employees = Arrays.asList(
            new Employee("John Doe"),
            new Employee("Jane Jane Doe"),
            new Employee("Joe Doe"),
            new Employee("John John Smith"));

    @Test
    public void testReduce() {
        int length = employees.stream().reduce(
                0,
                (i, e) -> i+e.getName().length(),
                (i1, i2) -> i1 + i2
        );
        //System.out.println(length);
        assertEquals(33, length);
    }

    @Test
    public void testNameCounter() {
        NameCounter nameCounter = employees.stream().reduce(
                new NameCounter(),
                (nc, e) -> nc.add(e),
                (nc1, nc2) -> nc1.add(nc2)
        );
        assertEquals(2, nameCounter.getThreePartNeme());
        assertEquals(2, nameCounter.getTwoPartName());
    }

    @Test
    public void testNameCounterCollect() {
        NameCounterMod nameCounterMod = employees.stream().collect(
                NameCounterMod::new,
                (counter, employee) -> counter.add(employee),
                (c1, c2) -> c1.add(c2)
        );
        assertEquals( 2, nameCounterMod.getTwoPartName());
        assertEquals( 2, nameCounterMod.getThreePartNeme());
    }
}