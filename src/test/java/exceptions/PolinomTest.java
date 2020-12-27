package exceptions;

import exections.Polinom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PolinomTest {

    @Test
    public void constructorDoubleNullParameterShouldThrowException() throws Exception {
        double[] eh = null;
        Exception ex = assertThrows(NullPointerException.class, () -> new Polinom(eh));
        assertEquals("Az együtthatók tömbje nem lehet üres", ex.getMessage());
    }

    @Test
    public void constructorStringNullParameterShouldThrowException() throws Exception {
        String[] ehStr = null;
        Exception ex = assertThrows(NullPointerException.class, () -> new Polinom(ehStr));
        assertEquals("Az együtthatók tömbje nem lehet üres", ex.getMessage());
    }
}
