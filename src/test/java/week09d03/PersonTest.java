package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testOverFourTeen() {
        Person p = new Person("Jhon Doe", 16);
        p.setPresent();
        assertNotEquals(null, p.getPresent());
        assertNotEquals(Present.TOY, p.getPresent());
    }

}
