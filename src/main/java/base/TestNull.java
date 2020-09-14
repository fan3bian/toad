package base;

import java.sql.SQLOutput;

public class TestNull {

    public static void main(String[] args) {
        String a = null;
        System.out.println(a instanceof String);
        Object b = new Object();
        System.out.println((String) b);
    }
}
