package base.collection;

import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
    private static Map<Integer, String> map = Maps.newHashMap();


    static {
        map.put(1, "one");
        map.put(2, "two");
    }

    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = Collections.unmodifiableMap(map);
        integerStringMap =new HashMap<>();
        integerStringMap.put(1, "three");
        System.out.println(integerStringMap.get(1));

    }
}