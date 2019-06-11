package ext.guava;

import com.google.common.base.Function;
import com.google.common.collect.*;
import org.junit.Test;
import util.JsonUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestGuava {
    @Test
    public void testMaps(){
        ArrayList<String> strings = Lists.newArrayList("zhangshuyi", "wangqiongqiong", "wangpingping", "xuande", "quao", "ahangshuyi");

//        ImmutableMap<Integer, String> objectStringImmutableMap = Maps.uniqueIndex(strings, new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        });
        final ImmutableListMultimap<Integer, String> index = Multimaps.index(strings, new Function<String, Integer>() {
            public Integer apply(String s) {
                return s.length();
            }
        });
//        ImmutableList<String> list = index.get(10);
        List<String > list = new ArrayList<>(index.get(10));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
    }
    @Test
    public void testBigDecimal(){
        BigDecimal origin = new BigDecimal(23);
        BigDecimal subtract = origin.subtract(new BigDecimal(2));
        System.out.println("oriing:"+ origin);
        System.out.println("subtract:"+ subtract);

    }

}
