package base.time;

import util.JsonUtil;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(JsonUtil.toJson(instance.getTime()));
        instance.add(Calendar.MINUTE,30);
        System.out.println(JsonUtil.toJson(instance.getTime()));


    }
}
