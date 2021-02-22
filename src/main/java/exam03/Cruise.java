package exam03;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

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

    public void addPassenger(Cruise c, Passenger p) {
        c.passengers.add(p);
    }


    public void bookPassenger(Passenger passenger) {
            if (boat.getMaxPassengers() > passengers.size()) {
                passengers.add(passenger);
            } else {
                throw new IllegalArgumentException("The boat is full, sorry.");
            }
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().getPrice() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger passenger: passengers) {
            if (passenger.getName().equals(name) ) {
                return passenger;
            }
        }
        throw new IllegalStateException("There is no passenger with this name: " + name);
    }

    /*
    public Passenger findPassengerByNameFor(String name) {
        Passenger p = new Passenger("a", CruiseClass.SECOND);
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i).getName().equals(name)) {
                p.setName(passengers.get(i).getName());
                p.setCruiseClass(passengers.get(i).getCruiseClass());
            }
        }
        return p;
    }

     */

    public List<String> getPassengerNamesOrdered() {
        List<String> s = new ArrayList<>();
        for (Passenger passenger: passengers) {
            s.add(passenger.getName());
        }
        s.sort(Comparator.naturalOrder());
        return s;
    }

    public double sumAllBookingsCharged() {
        double income = 0.0;
        for (Passenger passenger : passengers) {
            income += getPriceForPassenger(passenger);
        }
        return income;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> sum = new HashMap<>();
        for (Passenger passenger: passengers) {
            if (!sum.containsKey(passenger.getCruiseClass())) {
                sum.put(passenger.getCruiseClass(), 0);
            }
            sum.put(passenger.getCruiseClass(), sum.get(passenger.getCruiseClass()) +1 );
        }
        return sum;
    }




    public static void main(String[] args) {
        Cruise c = new Cruise((new Boat("Titanic", 3)),(LocalDate.of(2020, Month.FEBRUARY, 15)), 10000);
        c.passengers.add((new Passenger("Laci", CruiseClass.LUXURY)));
        Passenger p = new Passenger("Pisti", CruiseClass.SECOND);
        c.bookPassenger(p);

    }



}
