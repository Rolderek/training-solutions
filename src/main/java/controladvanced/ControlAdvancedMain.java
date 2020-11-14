package controladvanced;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;

public class ControlAdvancedMain {

    public String wordWithPrefix(List<String> words, String prefix) {
        String found = null;
        for (String word : words) {
            if (word.startsWith(prefix)) {
                found = word;
                break;
            }
        }
        return found;
    }

    public int numberOfPs(String s) {
        int numPs = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'p') {
                continue;
            }
            numPs++;
        }
        return numPs;
    }


    public static void main(String[] args) {
 //       new ControlAdvancedMain().wordWithPrefix(Arrays.asList("one", "two", "three", "OneHundred",), "two");
        new ControlAdvancedMain().numberOfPs("peter piper picked a ...");
    }
}



