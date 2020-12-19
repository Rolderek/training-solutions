package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private final String registrationNumber;
    private final int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationnumber, int price, Feature... feature) {
        this.registrationNumber = registrationnumber;
        this.price = price;
        features.addAll(List.of(feature));
    }

    public int fullLengthAtOneItem() {
        int temp = 0;
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                temp += ((AudioFeatures) feature).getLength();
            }
        }
        return temp;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature: features) {
            contributors.addAll(feature.getContributors());
        }
        return contributors;
    }

    public List<String> getTitle() {
        List<String > titles = new ArrayList<>();
        for (Feature feature: features) {
            titles.add(feature.getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature feature: features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature: features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int i = 0;
        for (Feature feature: features) {
            if (feature instanceof PrintedFeatures) {
                i += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return i;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<Feature> getFeatures() {
        return features;
    }

}
