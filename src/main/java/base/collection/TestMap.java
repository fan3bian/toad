package base.collection;

import com.google.common.collect.Maps;
import domain.Student;
import org.junit.Test;
import util.JsonUtil;

import java.math.BigDecimal;
import java.util.*;

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
    @Test
    public void test1(){
        System.out.println(Byte.valueOf("1").equals(1));
        System.out.println(Byte.valueOf("1") == 1);
        System.out.println(map.containsKey(Byte.valueOf("1")));
    }

    @Test
    public void test2(){
        BigDecimal b = new BigDecimal("209.0000");
        BigDecimal bigDecimal = b.stripTrailingZeros();
        System.out.println(bigDecimal);
       ;
        System.out.println( JsonUtil.toJson(bigDecimal));

    }
    @Test
    public void test3(){
        Map<String,String> map = new HashMap<>();
        System.out.println(map.put("1","2"));
        System.out.println(map.put("1","1"));
        Set<String> set =new HashSet<>();
        set.add(null);
        System.out.println(set);
//        System.out.println(map.put(null,"2"));
//        System.out.println(map.put(null,null));
    }
}