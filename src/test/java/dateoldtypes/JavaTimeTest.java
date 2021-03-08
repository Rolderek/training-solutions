package dateoldtypes;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JavaTimeTest extends TestCase {

    @Test
    public void testZoneId() {
        //System.out.println(ZoneId.getAvailableZoneIds()); -> le lehet kérdezni az összes időzónát
        //System.out.println(ZoneId.systemDefault()); -> a sajátot adja vissza
        ZoneId zoneId = ZoneId.of("Europe/Budapest");
        // ez string set-et ad vissza ezért boolean
        assertEquals(true, ZoneId.getAvailableZoneIds().contains(zoneId.toString()));
    }

    @Test
    public void testZonedDateTime() {
        LocalDateTime localDateTime = LocalDateTime.of(2018,1,12,16,0);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Budapest"));
        //System.out.println(zonedDateTime);
        assertEquals("2018-01-12T16:00+01:00[Europe/Budapest]", zonedDateTime.toString());
    }

    @Test
    public void testChange() {
        LocalDateTime localDateTime = LocalDateTime.of(2018,1,12,16,0);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Europe/Budapest"));
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        //System.out.println(zonedDateTime1);
        assertEquals("2018-01-12T15:00Z[UTC]", zonedDateTime1.toString());
    }

    @Test
    public void testDaylightSaving() {
        ZonedDateTime zonedDateTime =
                ZonedDateTime.of(LocalDateTime.of(2017,3,26,1,59), ZoneId.of("Europe/Budapest"));
        ZonedDateTime zonedDateTime1 = zonedDateTime.plusMinutes(1);
       //System.out.println(zonedDateTime1);
        assertEquals("2017-03-26T03:00+02:00[Europe/Budapest]", zonedDateTime1.toString());
    }

}