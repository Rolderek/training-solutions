package activity;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrackPointTest {


    TrackPoint trackPoint = new TrackPoint(new Coordinate(12.5, 34.89), 123);
    TrackPoint trackPoint2 = new TrackPoint(new Coordinate(12.6, 34.123), 200);

    @Test
    public void testCreateTrackPoint() {

        assertEquals(34.89, trackPoint.getCoordinate().getLongitude());
        assertEquals(12.5, trackPoint.getCoordinate().getLatitude());
        assertEquals(123.0, trackPoint.getElevation());

    }

    @Test
    public void testGetDistance() {
        assertTrue(trackPoint.getDistanceFrom(trackPoint2) > 83988.01 && trackPoint.getDistanceFrom(trackPoint2) < 83988.11);
    }


}
