package periodduration;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest extends TestCase {

    @Test
    public void testPeriod() {
        Period period = Period.ofDays(5);
        assertEquals(5, period.getDays());
        
        Period period1 = Period.of(1, 2, 3);
        assertEquals(2, period.getMonths());

    }

    @Test
    public void testParse() {
        String s= "P2Y3M";
        Period period = Period.parse(s);
        //System.out.println(period);
        assertEquals(3, period.getMonths());
    }

    @Test
    public void testBetween() {
        LocalDate localDate = LocalDate.of(2018, 1, 12);
        LocalDate localDate1 = LocalDate.of(2018, 1, 9);
        Period period = Period.between(localDate, localDate1);
        //System.out.println(period.getDays());
        assertEquals(-3, period.getDays());
    }

    @Test
    public void testNormalize() {
        Period period = Period.ofMonths(20).normalized();
        //System.out.println(period);
    }

    @Test
    public void testPlus() {
        LocalDate localDate = LocalDate.of(2018, 1, 12);
        Period period = Period.ofDays(3);
        LocalDate localDate1 = localDate.plus(period);
        //System.out.println(localDate1);
        assertEquals(15, localDate1.getDayOfMonth());
    }

    @Test
    public void testPeriodPLus() {
        Period period = Period.ofDays(2);
        Period period1 = period.plus(Period.ofMonths(2));
        Period period2 = period.plusMonths(2);
        assertEquals(period1.toString(), period2.toString());


    }

}