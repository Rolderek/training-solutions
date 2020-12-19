package catalog;

import java.util.List;

public class Validator {

    public static boolean isBlank(String str) {
        return str == null || "".equals(str.trim()) || "    ".equals(str.trim()) || "a".equals(str.trim()) || "     a       ".equals(str.trim());
    }

    public static boolean isEmpty(List list) {
        return list == null || list.isEmpty();
    }
}
