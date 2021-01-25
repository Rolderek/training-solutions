package ioreadwritebytes;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double average = 0;
        for (byte temperatures : data) {
            average += temperatures;
        }
        return (average / 365);
    }

    public double getMonthAverage() {
        double average = 0;
        if (data.length == 31) {
            averageThirty();
        }
        if (data.length == 30) {
            averageThirtyOne();
        } else {
            throw new IllegalArgumentException("To many days in the data.");
        }
        return average;
    }

    public double averageThirty() {
        double average = 0;
            for (byte temperatures : data) {
                average += temperatures;
            }
            average = (average / 30);
            return average;
        }

    public double averageThirtyOne() {
        double average = 0;
        for (byte temperatures : data) {
            average += temperatures;
        }
        average = (average / 31);
        return average;
    }
}