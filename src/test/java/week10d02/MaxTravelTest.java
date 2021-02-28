package week10d02;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

class MaxTravelTest {

    @Test
    void getMaxIndex() {
        int max = new MaxTravel().getMaxIndex(List.of(3, 3,12,12,0,3,4,4,12 ));
        assertEquals(3, max);
    }
}