package ext.guava;

import com.google.common.collect.Lists;
import domain.Order;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class TestList {
    @Test
    public void testList(){
        List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
        Lists.newArrayList("Hello", "World!", "How", "Are", "You");
        Lists.partition(messages,2);
        int size = 100*100*100+1;
        List<Order> list =new ArrayList<>(size);
        for (int i = 0; i <size ; i++) {
            Order order = new Order();
            order.setOrderNo(String.format("%08d",i));
            list.add(order);
        }
;       int slice = 10;
        int subSize = size/slice;
        List<List<Order>> partitions = Lists.partition(list, subSize);

        long start =System.currentTimeMillis();
        encypet(list);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
//        list.forEach(order -> System.out.println(JsonUtil.toJson(order)));
    }
    private void encypet(List<Order> orders){
        orders.forEach(t ->{
//            System.out.println(t.getOrderNo());
            t.setBizNo(UUID.randomUUID().toString());
        } );
    }
    //15998ms 5298ms 5160

}
