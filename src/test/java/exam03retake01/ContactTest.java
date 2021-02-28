package exam03retake01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactTest {

    @Test
    void create() {
        Contact contact = new Contact("John Doe", "johndoe@example.com");
        assertEquals("John Doe", contact.getName());
        assertEquals("johndoe@example.com", contact.getEmail());
    }
}
