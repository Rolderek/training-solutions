package virtualmethod;

public class Vehicle {

    private static final int PERSON_AVERAGE_WEIGHT = 75;

    private int vehicleWeight;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getGrossLoad() {
         int sumWeight = vehicleWeight + PERSON_AVERAGE_WEIGHT;
        return sumWeight;
    }

    public int getVehicleWeight() {
        return vehicleWeight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleWeight=" + vehicleWeight +
                '}';
    }

    public static int getPersonAverageWeight() {
        return PERSON_AVERAGE_WEIGHT;
    }
}
