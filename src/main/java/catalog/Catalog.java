package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int over) {
        if (over < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        double sum = 0.0;
        int i = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.numberOfPagesAtOneItem() > over) {
                i++;
                sum += catalogItem.numberOfPagesAtOneItem();
            }
        }
        if (i == 0) {
            throw new IllegalArgumentException("No pages");
        }
        return sum / i;
    }


    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> print = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                print.add(catalogItem);
            }
        }
        return print;
    }

    public int getFullLength() {
        int sum = 0;
        for (CatalogItem catalogItem: catalogItems) {
            sum += catalogItem.fullLengthAtOneItem();
        }
        return sum;
    }

    public void deleteItemByRegistrationNumber(String del) {
        List<CatalogItem> toRemove = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(del)) {
                toRemove.add(catalogItem);
            }
        }
        catalogItems.removeAll(toRemove);
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchByCriteria) {
        List<CatalogItem> item = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            List<String> contributors = catalogItem.getContributors();
            List<String> title = catalogItem.getTitle();
            if (contributors.contains(searchByCriteria.getContributor()) && title.contains(searchByCriteria.getTitle())) {
                item.add(catalogItem);
            }
            if (!searchByCriteria.hasTitle() && contributors.contains(searchByCriteria.getContributor())) {
                item.add(catalogItem);
            }
            if (!searchByCriteria.hasContributor() && title.contains(searchByCriteria.getTitle())) {
                item.add(catalogItem);
            }
        }
        return item;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audio = new ArrayList<>();
        for (CatalogItem catalogItem: catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                audio.add(catalogItem);
            }
        }
        return audio;
    }

    public int getAllPageNumber() {
        int i = 0;
        for (CatalogItem catalogItem : catalogItems) {
            i += catalogItem.fullLengthAtOneItem();
        }
        return i;
    }



}
