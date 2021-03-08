package datenewtypes;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class JavaTimeTest extends TestCase {

    @Test
    public void testLocalDateTime() {
        LocalDate localDate = LocalDate.now();
        //System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        //System.out.println(localDateTime);

        LocalTime localTime = LocalTime.now();
        //System.out.println(localTime);

        //konkrét érték átadása
        LocalDate localDate1 = LocalDate.of(2018, 1, 12);
        assertEquals("2018-01-12", localDate1.toString());

        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 1, 12, 16, 00);
        assertEquals("2018-01-12T16:00", localDateTime1.toString());
        //ez mindig az adott rendszer időzónájában értelmezett

        LocalTime localTime1 = LocalTime.of(16, 0);
        assertEquals("16:00", localTime1.toString());

        //hozzáadás és egyéb
        //System.out.println(localDateTime1.plusDays(1).plusHours(1));
        assertEquals("2018-01-13T17:00", localDateTime1.plusDays(1).plusHours(1).toString());

        assertEquals(true, localDateTime.isAfter(localDateTime1));
    }

    @Test
    public void testConvert() {
        //át konvertálva és aztán vissza alakítva
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 12, 16, 00);
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        assertEquals("2018-01-12", localDate.toString());
        assertEquals("16:00", localTime.toString());

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        assertEquals("2018-01-12T16:00", localDateTime1.toString());
    }

    @Test
    public void testJavaUtilDate() {
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        //System.out.println(localDateTime);

        Date date1 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        //ennek a formátuma függ az op rendszer beállításaitól!
        //System.out.println(date1);
    }

    @Test
    public void testChronoUnit() {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 12, 16, 00);
        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 1, 16, 16, 00);
        //kiírja a különbségeket most a napokban
        //System.out.println(ChronoUnit.DAYS.between(localDateTime, localDateTime1));
        assertEquals(4L, ChronoUnit.DAYS.between(localDateTime, localDateTime1));
    }

    @Test
    public void testField() {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 12, 16, 00);
        assertEquals(12, localDateTime.getDayOfMonth());
    }

    @Test
    public void testFormat() {
        //formázási variációk
        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 12, 16, 00);
        //DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        //DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        //DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MMMM dd. hh:mm");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MMMM dd. hh:mm").withLocale(Locale.ENGLISH);
        String s = localDateTime.format(formatter);
        //System.out.println(s);
        assertEquals("2018. January 12. 04:00", s);
    }

    @Test
    public void testParse() {
        DateTimeFormatter formatter =
                //itt a anagy H az óránál azt jelenti hogy 24 órából írjuk ki délután 4 -> 16 óra
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String s = "2018-01-12 16:00";
        LocalDateTime localDateTime = LocalDateTime.parse(s, formatter);
        //System.out.println(localDateTime);
        assertEquals(12, localDateTime.getDayOfMonth());
    }
}