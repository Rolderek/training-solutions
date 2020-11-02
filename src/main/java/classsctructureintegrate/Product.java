package classsctructureintegrate;

public class Product {

     private String name ;
     private int price ;
     private int increaseP ;
     private int decreaseP ;
     private int sumPrice ;

    public void setIncreaseP(int increaseP) {
        this.increaseP = increaseP;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIncreaseP() {
        return increaseP;
    }

    public void setIncraseP(int increaseP) {
        this.increaseP = increaseP;
    }

    public int getDecreaseP() {
        return decreaseP;
    }

    public void setDecreaseP(int decreaseP) {
        this.decreaseP = decreaseP;
    }

    public void setsumPrice(int sumPrice) {
        this.sumPrice = price + increaseP - decreaseP;
    }
    // Ezt lehet kettő függvénybe kellene írnom? //

}
