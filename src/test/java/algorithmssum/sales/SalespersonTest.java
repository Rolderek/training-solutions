package algorithmssum.sales;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalespersonTest {

    @Test
    public void testCreateSalesperson() {
        Salesperson salesperson = new Salesperson("Jack", 1500);
        assertEquals("Jack", salesperson.getName());
        assertEquals(1500, salesperson.getAmount());
    }

}