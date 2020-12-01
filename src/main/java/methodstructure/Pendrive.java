package methodstructure;

import com.sun.nio.sctp.NotificationHandler;

public class Pendrive {

    private String name;
    private double capacity;
    private double price;

    public Pendrive(String name, double capacity, double price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", " + capacity + ", " + price;
    }

    public void risePrice(int percent) {
        this.price += this.price * (percent/100.0);
    }

    public double pricePerCapatity() {
        return price/capacity;
    }

    public int comparePricePerCapacity(Pendrive this) {
        double pPerC = pricePerCapatity();
        double thisPPerC = this.pricePerCapatity();
        if (pPerC > thisPPerC) {
            return 1;
        }
        if (pPerC < thisPPerC) {
        }
        return -1;
    }

    public boolean cheaperThan(Pendrive p) {
        return this.price < p.price;
    }

}
