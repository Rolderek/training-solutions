package controliteration.pi;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PiTest {

    @Test
    public void getPi() {
        assertEquals("3.141592653589793238462643383279", new Pi().getPi());
    }
}

