package week08d05;

import java.util.List;

public class MathAlgorithms {

    public int greatestCommonDivisorFirst(int one, int two) {
        if (one < 1 || two < 1) {
            throw new IllegalArgumentException("Nem lehet nulla vagy nagatív.");
        }
        int div = 1;
        for (int i = 2; i <= one && i <= two; i++) {
            if (one % i == 0 && two % i == 0) {
                div = i;
            }
        }
        return div;
    }

    public int greatestCommonDivisorSecond(int a, int b) {
        int result = 1;
        for (int i = 2; i <= a && a <= b; i++) {
            if (a % i == 0 && b % i ==0) {
                result = i;
            }
        }
            return result;
    }

    //visszafelé számolva így gyorsabb
    public int greatestCommonDivisorThird (int a, int b) {
        int min = a;
        if (b < min) {
            min = b;
        }
        for (int i = min; i >= 2; i--) {
            if (a % i == 0 && b % i ==0){
                return i;
            }
        }
        return 1;
    }


}
