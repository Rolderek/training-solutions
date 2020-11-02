package localvariables;

public class Distance {

    private double distanceInKm;

    private boolean exact;

    public Distance(double distanceKm, boolean exact) {
        this.distanceInKm = distanceKm;
        this.exact = exact;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public boolean getexact() {
        return exact;
    }


}
