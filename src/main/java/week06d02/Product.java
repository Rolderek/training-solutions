package week06d02;

public class Product {

    private String name;
    private Category category;
    private int price;

    public Product(String name, Category category, int price) {
        if (name == null || "".equals(name)) {
            throw new NullPointerException("A név nem lehet NULL!");
        }
        this.name = name;
        if (category == null) {
            throw new NullPointerException("A kategória nem lehet NULL!");
        }
        this.category = category;
        if (1 > price) {
            throw new IllegalArgumentException("Az ár nem lehet kisebb nullánál vagy egyenlő vele!");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + category + "), " + price;
    }
}
