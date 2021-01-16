package activity;

public class TrackPoint {


    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getElevation() {
        return elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getDistanceFrom(TrackPoint trackPoint) {
        double latDis = Math.toRadians(trackPoint.getCoordinate().getLatitude() - this.getCoordinate().getLatitude());
        double lonDis = Math.toRadians(trackPoint.getCoordinate().getLongitude() - this.getCoordinate().getLongitude());

        double a = Math.sin(latDis / 2) * Math.sin(latDis / 2)
                + Math.cos(Math.toRadians(this.getCoordinate().getLatitude()))
                * Math.cos(Math.toRadians(trackPoint.getCoordinate().getLatitude()))
                * Math.sin(lonDis / 2) * Math.sin(lonDis / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = 6371 * c * 1000;

        double height = this.getElevation() - trackPoint.getElevation();
        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }

    public boolean higherThan(TrackPoint anotherTrackPoint) {
        return elevation > anotherTrackPoint.elevation;
    }

    public double elevationDifference(TrackPoint anotherTrackPoint) {
        return Math.abs(anotherTrackPoint.getElevation() - elevation) ;
    }

    public boolean lowerThan(TrackPoint anotherTrackPoint) {
        return elevation < anotherTrackPoint.elevation;
    }


}
