package virtualmethod;

public class Car extends Vehicle{

    private int numberOfPassenger;

    public Car(int vehicleWeight, int numberOfPassenger) {
        super(vehicleWeight);
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public int getGrossLoad() {
        int sumWeight = getVehicleWeight() + (numberOfPassenger * 75);
        return sumWeight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfPassenger=" + numberOfPassenger +
                ", vehicleWeight=" + getVehicleWeight() +
                '}';
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }
}
