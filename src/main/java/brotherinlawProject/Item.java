package brotherinlawProject;

public class Item {

    private String name;
    private QuantityLists quantity;
    private double howMany;
    private double price;

    public Item(String name, QuantityLists quantity, double howMany, double price) {
        if ( name == null || name == " ") {
            throw new IllegalArgumentException("Hibás név!");
        }
        this.name = name;
        if (quantity == null) {
            throw new IllegalArgumentException("Hibás mennyiségi kategória!");
        }
        this.quantity = quantity;
        if (howMany == 0.0) {
            throw new IllegalArgumentException("Nulla mennyiséggel nem adhatsz meg elemet!");
        }
        this.howMany = howMany;
        if (price == 0.0) {
            throw new IllegalArgumentException("Ár nélkül nem adhatdsz meg elemet!");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public QuantityLists getQuantity() {
        return quantity;
    }

    public double getHowMany() {
        return howMany;
    }

    public double getPrice() {
        return price;
    }
}
