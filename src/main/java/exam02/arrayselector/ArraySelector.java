package exam02.arrayselector;

import numbers.Numbers;


public class ArraySelector {
    // javítás bele írva
    public String selectEvens(int[] intArray) {
        String result = "";
        if (intArray.length > 0) {
            result = "[";
            for (int i = 0; i < intArray.length; i += 2) {
                result += intArray[i] + ", ";
            }
            result = result.substring(0, result.length() - 2);
            result += "]";
        }
        return result;
    }

    /*
     public String selectEvens(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i = i +2 ) {
            sum += numbers[i];
        }
        String s=String.valueOf(sum);
        s = "[" + s + "]";
        return s;
    }


     */

}
