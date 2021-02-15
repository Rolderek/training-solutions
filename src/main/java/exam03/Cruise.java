package exam03;

import java.time.LocalDate;
import java.util.List;

public class Cruise {

private Boat boat;
private LocalDate sailing;
private double basicPrice;
private List<Passenger> passengers;


    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }


    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
/*
    public boolean bookPassenger(Passenger passenger) {
        if ()
    }
*/


}
