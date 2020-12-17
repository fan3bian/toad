package test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import util.DateUtil;
import util.JsonUtil;

import java.util.Date;

/**
 * Created by zhangshuyi1 on 2018/8/31.
 */
public class TestDate {
    @Test
    public void test(){
        String now = DateUtil.getSystem_Date();
        System.out.println(now);
        String after = DateUtil.turnDate(now,DateUtil.DATETIME_FORMAT,365);
        System.out.println(after);
        byte a = 3;
        System.out.println(a==3);
        System.out.println(JSON.toJSONString(new Date()));
    }
}
