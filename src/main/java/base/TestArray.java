package base;

import org.junit.Test;

import java.util.*;

public class TestArray {
    public static void main(String[] args) {
        int a1[]={1,3};
        int a2[]=a1.clone();
        System.out.println(a1 == a2);
    }
    public void test1(){
        String s[] = new String[]{null};
        List<String> a = Arrays.asList("a");
        boolean a1 = Collections.addAll(a, "a");
        Deque deque =new ArrayDeque();
    }
    @Test
    public void test2(){
        List<Object> objects = Arrays.asList(null);
        System.out.println(objects);
    }
}
