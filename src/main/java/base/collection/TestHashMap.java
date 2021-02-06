package base.collection;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("", "");
        map.put(null, "");

        Integer a = 8;
        int h;

        System.out.println((h = a.hashCode()) ^ h);
    }
}
