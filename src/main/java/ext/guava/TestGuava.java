package ext.guava;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimaps;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class TestGuava {
    @Test
    public void testMaps() {
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
        List<String> list = new ArrayList<>(index.get(10));
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
    }

    @Test
    public void testBigDecimal() {
        BigDecimal origin = new BigDecimal(23);
        BigDecimal subtract = origin.subtract(new BigDecimal(2));
        System.out.println("oriing:" + origin);
        System.out.println("subtract:" + subtract);

    }

    @Test
    public void streams() {
        ArrayList<String> strings = Lists.newArrayList("zhangshuyi", "wangqiongqiong", "wangpingping", "xuande", "quao", "ahangshuyi");
//        Collection<String> filter = Collections2.filter(strings, new Predicate<String>() {
//            @Override
//            public boolean apply(String s) {
//                return s.contains("zshuyi");
//            }
//        });
//        System.out.println(filter.getClass());
//        System.out.println(JsonUtil.toJson(filter));
        strings.forEach(s -> System.out.println(s.contains("shuyi")));
//        strings.removeIf(s -> s.contains("shuyi"));
        System.out.println(strings);
        List<String> shuyi = strings.stream().filter(s -> s.contains("shuyi")).collect(Collectors.toList());
        System.out.println(shuyi);

    }

    @Test
    public void testCollections2() {
        ArrayList<String> strings = Lists.newArrayList("zhangshuyi", "wangqiongqiong", "wangpingping", "xuande", "quao", "ahangshuyi");
        Collection<String> filter = Collections2.filter(strings, new Predicate<String>() {
            @Override
            public boolean apply(String s) {
                return !s.contains("shuyi");
            }
        });
        System.out.println(filter.getClass());
        ArrayList<String> strs = new ArrayList<>(filter);
        System.out.println(strs);

    }

}
