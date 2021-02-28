package lambdacomparator;

public class CloudStorage {

    private String provider;
    private int space;
    private PayPeriod payPeriod;
    private double price;

    public CloudStorage(String provider, int space, PayPeriod payPeriod, double price) {
        this.provider = provider;
        this.space = space;
        this.payPeriod = payPeriod;
        this.price = price;
    }

    public CloudStorage(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public PayPeriod getPayPeriod() {
        return payPeriod;
    }

    public double getPrice() {
        return price;
    }

}
