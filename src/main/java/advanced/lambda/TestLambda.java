package advanced.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntSupplier;

import static java.lang.System.out;

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
}
