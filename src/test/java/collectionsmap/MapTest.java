package collectionsmap;



import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


class MapTest {

    @Test
    public  void testMap() {
        Map<String, String> codes = new LinkedHashMap<>();
        codes.put("200", "ok");
        codes.put("404", "Not found");

        Map<String, String> expected = new HashMap<>();
        expected.put("200", "OK");
        expected.put("404", "Not found");



        String s = codes.get("404");
        assertEquals(s, "Not found");

        codes.put("304", "Not modified");
        codes.remove("304");
        System.out.println(codes);

        assertEquals(codes.containsKey("304"), false);
        assertEquals(codes.containsValue("ok"), true);

        //.clear mindent töröl
        System.out.println(codes.keySet());
        System.out.println(codes.values());
        System.out.println(codes.entrySet());

        for (Map.Entry entries: codes.entrySet()) {
            System.out.println(entries.getKey());
            System.out.println(entries.getValue());
        }

    }

}