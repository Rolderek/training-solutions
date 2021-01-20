package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> soldSites = new ArrayList<>();

    public List<Site> getSoldSites() {
        return soldSites;
    }

    /*
ide írni a metódus részletet ami végig megy a Site-ok páros/páratlan attribútumain
és számolja őket majd vissza ad egy listát ami számolja hogy melyik hányszor volt
két változó a for-ba és az egyik az egyiket a másik a másikat számolja majd minden elemnél kiírni
az aktuális házszámot annka függvényében hogy mibél hány darabot számolt addig.
 */

    public List<Site> sellSite(Site site) {
        soldSites.add(site);
        return soldSites;
    }

}
