package activity;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActivityWithoutTrackTest {

    ActivityWithoutTrack activityWithoutTrack = new ActivityWithoutTrack(ActivityType.BASKETBALL);

    @Test
    public void testGetDistance() {
        assertEquals(0.0, activityWithoutTrack.getDistance());
    }

    @Test
    public void testGetType() {
        assertEquals(ActivityType.BASKETBALL, activityWithoutTrack.getType());
    }


}