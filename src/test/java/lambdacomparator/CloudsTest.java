package lambdacomparator;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CloudsTest extends TestCase {

    private List<CloudStorage> cloudStorages = Collections.unmodifiableList(Arrays.asList(
            new CloudStorage("Google", 1, PayPeriod.MONTHLY, 5000.0),
            new CloudStorage("Mega Inc", 3, PayPeriod.MONTHLY, 6750.0),
            new CloudStorage("Microsoft", 2, PayPeriod.ANNUAL, 12500.0),
            new CloudStorage("Chip Cloud", 5, PayPeriod.LIFETIME, 68750.0),
            new CloudStorage("McDownload", 3, PayPeriod.LIFETIME, 42570.0),
            new CloudStorage("MyCloud", 5, PayPeriod.ANNUAL, 25480.0),
            new CloudStorage("Free Space", 7, PayPeriod.ANNUAL, 38500.0),
            new CloudStorage("Free for all", 7, PayPeriod.ANNUAL, 0.0)
    ));

    @Test
    public void testAlphabeticallyFirst() {
        Clouds clouds = new Clouds();

        CloudStorage cloudStorage = clouds.alphabeticallyFirst(cloudStorages);

        assertEquals("Chip Cloud", cloudStorage.getProvider());
    }

    @Test
    public void testBestPriceForShortestPeriod() {
        Clouds clouds = new Clouds();

        CloudStorage cloudStorage = clouds.bestPriceForShortestPeriod(cloudStorages);

        assertEquals(5000.0, cloudStorage.getPrice());
    }
/*
    @Test
    public void testWorstOffers() {
        Clouds clouds = new Clouds();

        List<CloudStorage> worstStorages = clouds.worstOffers(cloudStorages);

        assertEquals(3, worstStorages.size());

    }


 */

}