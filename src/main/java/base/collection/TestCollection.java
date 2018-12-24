package base.collection;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

}
