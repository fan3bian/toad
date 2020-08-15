package base.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestList{
    @Test
    public void test(){
        new ArrayList<String>();
    }
    @Test
    public void test2(){
        Collection<String> collection =  new ArrayList<String>();
        collection.add("a");
//        collection.add(null);
        System.out.println(collection.contains(null));
    }

    @Test
    public void test3(){
        String a[] = new String[]{"1","2","3"};
        String b[] = new String[]{"1"};
        Collection<String> collection =  new ArrayList<String>();
        collection.add("a");
        collection.add("b");
        String[] stringsa = collection.toArray(a);
        String[] stringsb = collection.toArray(b);
        System.out.println(Arrays.toString(stringsa));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(stringsb));
        System.out.println(Arrays.toString(b));
//        collection.add(null);
    }
    @Test
    public void t4(){
//        String a[] = new String[]{};
        List<String> strings = Arrays.asList("1", "2", "3");
        m(strings);
        System.out.println(strings);
    }
    private void m(List<String> list){
        list = new ArrayList<>();
    }
}
