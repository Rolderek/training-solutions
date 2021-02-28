package algorithmssum.sales;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalesAmountSumCalculatorTest {

    @Test
    public void testSumSalesAmount() {
        SalesAmountSumCalculator test = new SalesAmountSumCalculator();

        List<Salesperson> salespersons = Arrays.asList(
                new Salesperson("John", 600),
                new Salesperson("Bill", 200),
                new Salesperson("Kate", 700),
                new Salesperson("Mary", 700),
                new Salesperson("Karl", 200)
        );

        assertEquals(2400,test.sumSalesAmount(salespersons));

    }

}
