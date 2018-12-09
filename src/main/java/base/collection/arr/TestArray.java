package base.collection.arr;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc");

        // class java.util.Arrays$ArrayList
        System.out.println(list.getClass());

        // class [Ljava.lang.String;
        Object[] objArray = list.toArray();
        System.out.println(objArray.getClass());

        objArray[0] = new Object();
    }
    @Test
    public void test(){
        System.out.println(Object.class);
        System.out.println(Object[].class);
    }
}

