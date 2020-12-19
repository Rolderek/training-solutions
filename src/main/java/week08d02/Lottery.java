package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

public static final int NUMBER_OF_NUMBERS = 5;
public static final int NUMBER_INTERNAL = 90;

public List<Integer> getNumber(int internal, int numbers) {
    List<Integer> result = new ArrayList<>(numbers);
     for (int i = 0; i < numbers; i++) {
         result.add(generateNumberNotInList(result, internal));
     }
     return result;
}

private Integer generateNumberNotInList( List<Integer> myList, int internal) {
    Random random = new Random(5);
    int number = random.nextInt(internal)+1;
    while(myList.contains(number)) {
        number = random.nextInt(internal)+1;
    }
    return number;
}

    public static void main(String[] args) {
       Lottery lottery = new Lottery();
        System.out.println(lottery.getNumber(90, 5));
    }
}
