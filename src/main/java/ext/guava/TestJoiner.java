package ext.guava;

import com.google.common.base.Joiner;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestJoiner {
    @Test
    public void test1() {
        List<String> strings = Arrays.asList("a=b", "c=d");
        String join = Joiner.on(";").join(strings);
        System.out.println(join);

    }
}
