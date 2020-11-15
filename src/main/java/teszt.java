import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class teszt {

    public String findPerfectMatch(int number) {
        List<String> words = List.of("ninetyeight", "five", "eight", "ten", "thirteen");
        String perfect = null;

        for(String word: words) {
            if(Math.abs(word.length() - number) > number) {
                continue;
            }
            if(word.length() == number) {
                perfect = word;
                break;
            }
            int newLength = word.length() > number ? number : word.length();
            perfect = word.substring(0, newLength);
        }

        return perfect;
    }
    


}
