package week07d03;


import java.util.Arrays;
import java.util.List;

public class NumberList {

    public static boolean isIncreasing(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new NullPointerException("A lista nem lehet üres!");
        } else if (list.size() < 2) {
            throw new IllegalArgumentException("Minimum két elemű lista kell!");
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
