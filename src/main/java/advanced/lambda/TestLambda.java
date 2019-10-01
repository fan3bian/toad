package advanced.lambda;

import com.google.common.collect.Lists;
import interfaces.S;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.lang.System.setOut;

//static import

/**
 * Created by zhangshuyi1 on 2018/10/4.
 */
public class TestLambda {
    @Test
    public void test(){
        IntSupplier supplier = () -> 5;
        out.println(supplier.getAsInt());

        List<String> legends = Arrays.asList("Ashe","Garen","Ryze");
        legends.forEach(l -> out.println(l));//节省了变量
        legends.forEach(out::println);//double colon operator

        String[] legendArr = legends.toArray(new String[legends.size()]);
        Arrays.sort(legendArr,(String s1,String s2) -> (s1.compareTo(s2)));


    }
    @Test
    public void test2(){
        ArrayList<String> strings = Lists.newArrayList("Ashe", "Garen", "Ryze");
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s, String s2) {
                return Integer.compare(s.length(), s2.length());
            }
        });

        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        Collections.sort(strings, Comparator.comparingInt(String::length));

    }
    @Test
    public void testFuntionalInterface(){
        System.out.println(((Inter) () -> "quao").getName());
    }
    @Test
    public void testMethodReference(){
        Function function;
        Map<String, String> stringStringHashMap = new HashMap<>();
        System.out.println(Integer.parseInt("5"));
    }
    @Test
    public void testStream(){
        List lists = Lists.newArrayList("ha","he","he","ha");
        lists.forEach(x -> System.out.println(x));

    }
}
