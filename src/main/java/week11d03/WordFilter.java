package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    private List<String> word;


    public List<String> wordWithChar(List<String> words, char c) {
        List<String> filter = new ArrayList<>();
        String s = String.valueOf(c);
        for (String item : words) {
            if (item.contains(s)) {
                filter.add(item);
            }
        }
        return filter;
    }
}
