package base.collection;

import org.junit.Test;

import java.util.*;

/**
 * Created by zhangshuyi1 on 2018/11/18.
 */
public class TestCollection {
    @Test
    public void test(){
        Collection c ;
        Map<String, Object> map = new HashMap<>();
        map.put("a","a");
        Map<String,Object> tmpMap =new HashMap<>(map);
        System.out.println(map.equals(tmpMap));
        System.out.println(map==tmpMap);
    }
    @Test
    public void test2(){
        Set<String> set = new HashSet<>();
        boolean b = Collections.addAll(set, "a", "a");
        // a\=b a=a\b
        boolean a = set.add("a");
        System.out.println(a);
        System.out.println(b);

        System.out.println(a|=b);
    }
    @Test
    public void test3(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","a","c");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
