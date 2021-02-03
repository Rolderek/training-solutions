package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {

    public static void main(String[] args) {
        IntegerOperations io = new IntegerOperations();
        System.out.println(io.createList(4, 5, 6));


    }

    public List<Integer> createList(int... numbers) {
        List<Integer> i = new ArrayList<>();

        for (int j = 0; j < numbers.length; j++) {
            i.add(numbers[j]);
        }
        return i;

    }
//ez nem jó! kijaívtani!
    public int sumIntegerList(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum = sum + integerList.get(i).intValue();
        }
        return sum;
    }
//szintén nem jó!
    public int sumIntegerObjects(Integer... integers) {
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
