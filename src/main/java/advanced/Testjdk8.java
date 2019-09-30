package advanced;

import org.junit.Test;

import java.util.Arrays;

public class Testjdk8 {
    @Test
    public void test(){
        String str = "abc";
        String[] chars = str.split("");
        System.out.println(Arrays.toString(chars));
    }
}
