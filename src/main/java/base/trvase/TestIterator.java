package base.trvase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("a","b","c");
//        for(Iterator<String> iterator = list.iterator();iterator.hasNext();){
//            String next = iterator.next();
//            System.out.println(next);
//            if("a".equals(next)){
//                iterator.remove();
//            }
//        }

        List<Integer> list = new ArrayList<Integer>();
        for(int i =1;i<10;i++){
            list.add(i);
        }
        for(Iterator<Integer> it = list.iterator();it.hasNext();){
            final Integer next = it.next();
            System.out.println(next);
                it.remove();
        }


    }
}
