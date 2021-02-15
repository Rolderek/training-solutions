package exam03;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Cruise {

private Boat boat;
private LocalDate sailing;
private double basicPrice;
private List<Passenger> passengers = new ArrayList<>();


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
        Cruise c = new Cruise((new Boat("Titanic", 3)),(LocalDate.of(2020, Month.FEBRUARY, 15)), 10000);
            if (c.passengers.size() < c.boat.getMaxPassengers()) {
                c.passengers.add(passenger);
                System.out.println(c.passengers.size());
                return c;
            }
            return c;
    }



    public static void main(String[] args) {
        Cruise c = new Cruise((new Boat("Titanic", 3)),(LocalDate.of(2020, Month.FEBRUARY, 15)), 10000);
        c.passengers.add((new Passenger("Laci", CruiseClass.LUXURY)));
        Passenger p = new Passenger("Pisti", CruiseClass.SECOND);
        //c.bookPassenger(c.bookPassenger(p));
    }



}
