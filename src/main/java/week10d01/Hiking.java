package week10d01;

import java.util.List;

public class Hiking {

    public double getPulsElevation(List<Position> elevation) {
        if (elevation == null || elevation.isEmpty()) {
            throw new NullPointerException("Nem lehet üres értékkel számolni");
        }
        else if (elevation.size() <= 1) {
            throw new IllegalArgumentException("Kettő érték kell minimum!");
        }
        double up = 0.0;
        for (int i = 0; i < elevation.size(); i++) {
            if (elevation.get(i).getZ() > elevation.get(i).getZ()) {
                up += elevation.get(i).getZ() - elevation.get(i).getZ();
            }
        }
        return up;
    }
}
