package exam03;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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


    public Cruise bookPassenger(Passenger passenger) {
        Cruise c;

            if (c.getPassengers().size() < c.getBoat().getMaxPassengers()) {

                return p;
            }
            return p;
    }

    public static void main(String[] args) {
        Cruise c = new Cruise((new Boat("Titanic", 3)),(LocalDate.of(2020, Month.FEBRUARY, 15)), 10000);
        c.bookPassenger((new Passenger("Laci", CruiseClass.LUXURY)));
    }



}
