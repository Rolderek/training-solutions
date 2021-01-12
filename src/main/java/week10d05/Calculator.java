package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr) {
        if (arr.length < 4) {
            throw new IllegalArgumentException("Nem elég hosszú a tömb.");
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
