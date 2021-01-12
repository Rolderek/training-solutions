package week10d05;

import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
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

    /*rendezés nélküli megoldás tudom hogy sok a három a for majd áttervezem
    public int findMinSum2(int[] arr2) {
        if (arr2.length < 4) {
            throw new IllegalArgumentException("Nem elég hosszú a tömb.");
        }
        int biggest = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > biggest) {
                biggest = arr2[i];
            }
            return biggest;
        }
        int e = 0;
        ArrayList<Integer> f = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < biggest) {
                f.add(arr2[i]);
                for (int j = 0; j < f.size(); j++) {
                    e += f.get(j);
                }
                return e;
            }
            return e;
        }
        return e;
    }

     */
}
