package week13d05;

import java.util.ArrayList;
import java.util.List;

public class CharSumAtWord {

    private int max;
    private int min;

    public CharSumAtWord(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int letterCounter(String word) {

        List<Character> numberOfCharacter = new ArrayList<>();
        String wordLC = word.toLowerCase();
        // vagy a for helyett lehet:
        //String s = "asdasfafefa";
        // for (char c: s.toCharAttay()) {}
        for (int i = 0; i < wordLC.length(); i++) {
            int number = wordLC.charAt(i);
            if (min <= number && max >= number) {
                if ( !(numberOfCharacter.contains(wordLC.charAt(i)))) {
                    numberOfCharacter.add(wordLC.charAt(i));
                }
            }
        }
        return numberOfCharacter.size();
    }


}
