package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPointList = new ArrayList<>();


    public void addTrackPoint(TrackPoint trackPoint) {
        trackPointList.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPointList;
    }

    public Coordinate findMaximumCoordinate() {
        double maxLo = trackPointList.get(0).getCoordinate().getLongitude();
        double maxLa = trackPointList.get(0).getCoordinate().getLatitude();
        for (TrackPoint trackp: trackPointList) {
            if (trackp.getCoordinate().getLatitude() > maxLa) {
                maxLa = trackp.getCoordinate().getLatitude();
            }
            if (trackp.getCoordinate().getLongitude() > maxLo) {
                maxLo = trackp.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLa, maxLo);
    }

    public Coordinate findMinimumCoordinate() {
        double minLo = trackPointList.get(0).getCoordinate().getLongitude();
        double minLa = trackPointList.get(0).getCoordinate().getLatitude();
        for ( TrackPoint trackPoints : trackPointList) {
            double lo = trackPoints.getCoordinate().getLongitude();
            double la = trackPoints.getCoordinate().getLatitude();
            if (la < minLa) {
                minLa = la;
            }
            if (lo < minLo) {
                minLo = lo;
            }
        }
        return new Coordinate(minLa, minLo);
    }

    public double getRectangleArea() {
        double rectangleArea = (findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude())
                * (findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude());
        return rectangleArea;
    }

    public double getFullElevation() {
        double elevationSum = 0;

        for (int i = 0; i < trackPointList.size() - 1; i++) {
            if (trackPointList.get(i + 1).getElevation() > trackPointList.get(i).getElevation()) {
                elevationSum += (trackPointList.get(i + 1).getElevation() - trackPointList.get(i).getElevation());
            }

        }
        return elevationSum;

        //foreach-el
        /*
        TrackPoint prev = trackPointList.get(0);
        for (TrackPoint actual = tracPointList) {
        if (actual.higherTan(prev))  {
        elevationSum += actual.elevationDifference(prev);
        }
        prev = actual;
        }
        return elevationSum;
        }

        //lásfd alábbi metódus


        for (int i = 0; i < trackPointList.size() - 1; i++) {
            TrackPoint actual = trackPointList.get(i);
            TrackPoint next = trackPointList.get(i + 1);
            if (actual.higherThan(next)) {
                elevationSum += actual.elevationDifference(next);
            }
        }
        */
    }

    public double getFullDecrease() {
        double decreaseSum = 0;
        TrackPoint prev = trackPointList.get(0);
        for (TrackPoint actual: trackPointList) {
            if (actual.lowerThan(prev)) {
                decreaseSum += actual.elevationDifference(prev);
            }
            prev = actual;
        }
        return decreaseSum;
    }

    public double getDistance() {
        double result = 0.0;
        for (int i = 1; i < trackPointList.size(); i++) {
            result += trackPointList.get(i).getDistanceFrom(trackPointList.get(i - 1));
        }
        return result;
    }



    /* itt majd ki kell cserél ni mindent trackpointlist-re
    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoint.add(trackPoint);
    }



    public Coordinate findMaximumCoordinate() {
        double maxLo = trackPoint.get(0).getCoordinate().getLongitude();
        double maxLa = trackPoint.get(0).getCoordinate().getLatitude();
        for (TrackPoint trackpoints: trackPoint) {
            double lo = trackpoints.getCoordinate().getLongitude();
            double la = trackpoints.getCoordinate().getLatitude();
            if (la < maxLa) {
                maxLa = la;
            }
            if (lo > maxLo) {
                maxLo = lo;
            }
        }
        return new Coordinate(maxLa, maxLo);
    }


    public List<TrackPoint> getTrackPoint() {
        return trackPoint;
    }

    public double getDistance() {
        double sum = 0.0;
        for (int i = 1; i < trackPoint.size(); i++) {
            sum += trackPoint.get(i).getDistanceFrom(trackPoint.get(i-1));
        }
        return sum;
    }

    public Coordinate findMinimumCoordinate() {
        double minLo = trackPoint.get(0).getCoordinate().getLongitude();
        double minLa = trackPoint.get(0).getCoordinate().getLatitude();
        for ( TrackPoint trackPoints : trackPoint) {
            double lo = trackPoints.getCoordinate().getLongitude();
            double la = trackPoints.getCoordinate().getLatitude();
            if (la < minLa) {
                minLa = la;
            }
            if (lo < minLo) {
                minLo = lo;
            }
        }
        return new Coordinate(minLa, minLo);
    }

    public double getFullDecrease() {
        double sum = 0.0;
        for (int i = 1; i < trackPoint.size(); i++) {
            if (trackPoint.get(i).getElevation() < trackPoint.get(i-1).getElevation()) {
                sum += trackPoint.get(i-1).getElevation()-trackPoint.get(i).getElevation();
            }
        }
        return sum;
    }

    public double getFullElevation() {
        double sum = 0.0;
        for (int i = 1; i < trackPoint.size(); i++) {
            if (trackPoint.get(i).getElevation() > trackPoint.get(i).getElevation()) {
                sum += trackPoint.get(i).getElevation()-trackPoint.get(i-1).getElevation();
            }
        }
        return sum;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoint;
    }


     */

}
