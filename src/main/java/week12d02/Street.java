package week12d02;

    /*
ide írni a metódus részletet ami végig megy a Site-ok páros/páratlan attribútumain
és számolja őket majd vissza ad egy listát ami számolja hogy melyik hányszor volt
két változó a for-ba és az egyik az egyiket a másik a másikat számolja majd minden elemnél kiírni
az aktuális házszámot annka függvényében hogy mibél hány darabot számolt addig.
 */

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public void sellSite(Site site) {
        sites.add(site);
    }

    public List<FenceStat> fenceStatistics() {
        List<FenceStat> result = new ArrayList<>();
        for (Site site: sites) {
            FenceStat returned = returnFenceIfContains(result, site.getFenceType());
            if ( returned.getCount() == 1) {
                result.add(returned);
            }  else {
                returned.incrase();
            }
        }
        return result;
    }

    public FenceStat returnFenceIfContains(List<FenceStat> fenceStats, Fence fenceType) {
        for (FenceStat fenceStat: fenceStats) {
            if (fenceStat.getFenceType() == fenceType) {
                return fenceStat;
            }
        }
        return new FenceStat(fenceType);
    }

}
