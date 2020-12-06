package methodchain;

public class Robot {

    private int distance;
    private int azimut;

    public Robot(int distance, int azimut) {
        this.distance = distance;
        this.azimut = azimut;
    }

    public Robot go(int meter) {
        this.distance = distance;
        return this;
    }

    public Robot rotate(int angle) {
        this.azimut = azimut;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }
}
