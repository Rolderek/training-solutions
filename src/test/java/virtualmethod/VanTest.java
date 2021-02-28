package virtualmethod;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;


public class VanTest {
    @Test
    public void getGrossLoad() throws Exception {
        Van van = new Van(1, 1200, 200);

        assertEquals((1 + 1) * Car.getPersonAverageWeight() + 1200 + 200, van.getGrossLoad());
    }

    @Test
    public void tostring() {
        Van van = new Van(1, 1200, 200);

        assertEquals("Van{cargoWeight=" + 200 + ", numberOfPassenger=" + 1 + ", vehicleWeight=" + 1200 + '}', van.toString());

    }

}
