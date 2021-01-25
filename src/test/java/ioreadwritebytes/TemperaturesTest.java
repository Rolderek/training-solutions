package ioreadwritebytes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesTest {

    public byte[] data = new byte[365];

    @Test
    public void testGetYearAverage() {
        Temperatures temperatures = new Temperatures(data);
        double average = temperatures.getYearAverage();
        assertEquals(1, average, 1);
    }

}