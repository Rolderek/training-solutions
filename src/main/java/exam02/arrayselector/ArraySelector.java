package exam02.arrayselector;

import numbers.Numbers;

public class ArraySelector {

    public String selectEvens(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i = i +2 ) {
            sum += numbers[i];
        }
        String s=String.valueOf(sum);
        s = "[" + s + "]";
        return s;
    }


}
