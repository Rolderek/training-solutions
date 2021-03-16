package software;

import junit.framework.TestCase;

public class DeveloperSoftwareTest extends TestCase {

    public void testIncreasePrice() {
        DeveloperSoftware developerSoftware = new DeveloperSoftware("JDK", 10000);
        developerSoftware.increasePrice();
        assertEquals(11000, developerSoftware.getPrice());
    }
}