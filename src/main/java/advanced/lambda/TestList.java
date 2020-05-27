package advanced.lambda;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import domain.Student;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class TestList {

    @Test
    public void test() {
        BiConsumer<List, Consumer<Student>> forEach = List<Student>::forEach;
        Runnable aNew = Student::new;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String,Object> map =new HashMap<>();
        map.put("key",1000001);
        IntStream chars = "key".chars();


        Map<String, Object> mapA = Maps.newHashMap();
        map.put("key",10000);
        List<Map<String, Object>> maps = Lists.newArrayList(mapA);
        String s = JSON.toJSONString(maps);
        List<Map<String,Object>> list = JSON.parseObject(s, new TypeReference<List<Map<String,Object>>>(){});
    }
    @Test
    public void test2(){
        BigDecimal b = new BigDecimal(2);
        BigDecimal multiply = b.add(BigDecimal.TEN).multiply(BigDecimal.TEN);
        System.out.println(multiply);
    }
}
