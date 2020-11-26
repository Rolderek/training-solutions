package week05d03;

import enumtype.Coin;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    private static int Counter(List<String> theList) {
        int i = 0;
        String fString = "";

        for (String toFind: theList) {
            fString = toFind.substring(0, 1).toUpperCase();
            if ( "A".equals(fString)) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        List<String> toFind = new ArrayList<>();
        toFind.add("akármi");
        toFind.add("valami");
        toFind.add("kakadu");

        System.out.println(Counter(toFind));
    }
}
