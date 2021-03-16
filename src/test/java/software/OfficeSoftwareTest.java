package software;

import junit.framework.TestCase;

public class OfficeSoftwareTest extends TestCase {

    public void testIncreasePrice() {
        OfficeSoftware officeSoftware = new OfficeSoftware("excel", 100);
        officeSoftware.increasePrice();
        assertEquals(105, officeSoftware.getPrice());
    }
}