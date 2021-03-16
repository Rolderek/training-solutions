package software;

public class OfficeSoftware extends Software {

    public OfficeSoftware(String name, int price) {
        super(name, price);
    }

    @Override
    public void increasePrice() {
        price = (int) (super.price * 1.05);
    }


}

/*
public OfficeSoftware increasePrice(String name, double price) {
        OfficeSoftware officeSoftware = new OfficeSoftware(name, fivePercentPlusPrice(price));
        System.out.println(officeSoftware.getName());
        System.out.println(officeSoftware.getPrice());
        return officeSoftware;
    }

    private double fivePercentPlusPrice(double price) {
        double result = 0;
        result = price + ((price / 100) * 5);
        return result;
    }


public static void main(String[] args) {
        OfficeSoftware officeSoftware = new OfficeSoftware("próba", 100);
        officeSoftware.increasePrice();
        System.out.println(officeSoftware.getName());
        System.out.println(officeSoftware.getPrice());
    }
 */
