package virtualmethod;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void getGrossLoadWithRealValues() {
        Car car = new Car(1700, 4);

        assertEquals((4 + 1) * Car.getPersonAverageWeight() + 1700, car.getGrossLoad());
    }

    @Test
    public void tostring() {
        Car car = new Car(1700, 4);

        assertEquals("Car{numberOfPassenger=" + 4 + ", vehicleWeight=" + 1700 + '}', car.toString());
    }

}