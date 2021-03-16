package week09d03;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testOverFourTeen() {
        Person p = new Person("Jhon Doe", 16);
        p.setPresent();
        //assertFalse(null, p.getPresent().toString());
        //assertNotEquals(Present.TOY, p.getPresent());
    }

}
