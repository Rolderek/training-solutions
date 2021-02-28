package virtualmethod;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class VehicleTest {
    @Test
    public void getGrossLoad() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals(1000 + Vehicle.getPersonAverageWeight(), vehicle.getGrossLoad());
    }

    @Test
    public void getVehicleWeight() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals(1000, vehicle.getVehicleWeight());
    }

    @Test
    public void tostring() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals("Vehicle{vehicleWeight=" + 1000 + '}', vehicle.toString());
    }

}