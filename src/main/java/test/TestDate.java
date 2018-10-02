package test;

import org.junit.Test;
import util.DateUtil;

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
    }
}
