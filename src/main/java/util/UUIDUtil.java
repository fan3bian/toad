package util;

import java.util.UUID;

/**
 * Created by zhangshuyi1 on 2018/8/1.
 */
public class UUIDUtil {
    static String gen(){
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        ;
        System.out.println(UUIDUtil.gen());
    }
}
