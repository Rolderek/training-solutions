package lambdacomparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clouds {

    public CloudStorage alphabeticallyFirst(List<CloudStorage> cloudStorages) {
        //cloudStorages.sort(Comparator.comparing(CloudStorage::getProvider));
        return Collections.min(cloudStorages, Comparator.comparing(CloudStorage::getProvider, String::compareToIgnoreCase));

    }

    public CloudStorage bestPriceForShortestPeriod(List<CloudStorage> cloudStorages) {
        return Collections.min(cloudStorages, Comparator.comparing(CloudStorage::getPayPeriod,
                Comparator.nullsFirst(Comparator.comparing(PayPeriod::getLength))).thenComparing(CloudStorage::getPrice));
    }

    public List<CloudStorage> worstOffers(List<CloudStorage> cloudStorages) {
        List<CloudStorage> firstThree = new ArrayList<>();
        cloudStorages.sort(Comparator.comparing(CloudStorage::getPrice));
        firstThree.add(cloudStorages.get(cloudStorages.size()));
        firstThree.add(cloudStorages.get(cloudStorages.size()-1));
        firstThree.add(cloudStorages.get(cloudStorages.size()-2));
        return firstThree;

    }
}
