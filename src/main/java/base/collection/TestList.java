package base.collection;

import org.junit.Test;

import java.util.*;

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
        List<String> strings = Arrays.asList("1", "2", "3");
        int i = 0;
        for (String s : strings) {
            System.out.println(s);
            System.out.println(strings.get(i++));
        }
        m(strings);
        System.out.println(strings);
    }
    private void m(List<String> list){
        list = new ArrayList<>();


    }
    @Test
    public void t5(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        boolean remove = nums.remove(Integer.valueOf(1));
        System.out.println(nums);
        nums = new LinkedList<>();
        Object o = new Object();
        System.out.println(o.hashCode());
    }

}
