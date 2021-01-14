package week11d04;

public class ÓraiMunka {

    public void printNumber(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Must be > 0");
        }
    }

    //kérdésre válasz
    public void print() {
        try {
            printNumber(-1);
        }
        catch (IllegalArgumentException iae) {
            //direkt hagytam üresen mert akkor mehet tovább a program

            System.out.println("Hiba!"); //vagy kiírom a konzolra

            throw iae; //vagy tovább dobom őt magát

        }
    }
}
