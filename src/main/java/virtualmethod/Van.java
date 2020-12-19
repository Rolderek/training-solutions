package virtualmethod;

public class Van extends Car{

    private int cargoWeight;

    public Van(int vehicleWeight, int numberOfPassenger, int cargoWeight) {
        super(vehicleWeight, numberOfPassenger);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        int sumWeight = super.getGrossLoad() + cargoWeight;
        return sumWeight;
    }

    @Override
    public String toString() {
        return "Van{" +
                "cargoWeight=" + cargoWeight +
                ", numberOfPassenger=" + super.getNumberOfPassenger() +
                ", vehicleWeight=" + getVehicleWeight() +
                '}';
    }


}
