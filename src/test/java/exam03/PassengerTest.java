package exam03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    @Test
    void create() {
        Passenger passenger = new Passenger("John Doe", CruiseClass.LUXURY);
        assertEquals("John Doe", passenger.getName());
        assertEquals(CruiseClass.LUXURY, passenger.getCruiseClass());
    }
}