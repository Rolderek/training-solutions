package properties;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class PropertiesTest {

    @Test
    public void testProperties() {
        Properties p = new Properties();
        p.setProperty("host", "training360.com");
        assertEquals("training360.com", p.getProperty("host"));

        String s = p.getProperty("port");
        assertEquals(null, p.getProperty("port"));
        assertEquals("80", p.getProperty("port", "80"));

    }

    //konfigurációs paraméterek tárolására használjuk
    @Test
    public void testLoad() {
        Properties p = new Properties();
        try (InputStream is = PropertiesTest.class.getResourceAsStream("/wellcome.properties")) {
            p.load(is);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot load file", ioe);
        }

        String value = p.getProperty("wellcome.message");
        assertEquals("Hello word!", value);
    }

    @Test
    public void testSave() {
        Properties p = new Properties();
        p.setProperty("host", "training360.com");
        p.setProperty("port", "80");

        try (Writer w = new FileWriter("config.properties")) {
            p.store(w, null);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot save file!", ioe);
        }

    }
}