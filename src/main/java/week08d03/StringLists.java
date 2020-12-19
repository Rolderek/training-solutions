package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> result = new ArrayList<>();
        result.addAll(first);
        for (String element : second) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;

    }
}
