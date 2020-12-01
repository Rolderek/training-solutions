package methodstructure;

import java.util.ArrayList;
import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {
        for (int i = 0; i < pendrives.size(); i++) {
            if (pendrives.get(i).comparePricePerCapacity() == 1) {
                pendrives.add(pendrives.get(i));
            }
        }
        return pendrives.get(0);
    }


}
