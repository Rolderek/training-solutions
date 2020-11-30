package week06d01;

import java.util.List;

public class ListSelector {

    public StringBuilder evenSelector(List<String> list) {
        StringBuilder sb = new StringBuilder("");
        endAppend(list, sb, '[');
        concat(list, sb);
        endAppend(list, sb, ']');
        if (list == null) {
            throw new IllegalArgumentException("Üres a lista!");
        }
        return sb;
    }

    public void concat(List<String> list, StringBuilder sb) {
        for (int i = 0; i < list.size(); i = i + 2) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(list.get(i));
        }
    }

    public void endAppend(List<String> list, StringBuilder sb, char c) {
        if (list.size() != 0) {
            sb.append(c);
        }
    }

}
