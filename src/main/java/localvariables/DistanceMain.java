package localvariables;

public class DistanceMain {
    public static void main(String[] args) {

        Distance distance = new Distance(3.147, false);
        System.out.println(distance.getDistanceInKm() + " " + distance.getexact());
        int i;
        i = (int) distance.getDistanceInKm();
        System.out.println(i);
    }
}
