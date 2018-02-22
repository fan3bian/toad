package base;

/**
 * Created by zhangshuyi1 on 2018/2/15.
 */
public class TestHashCode {
    public static void main(String[] args) {
        int a = 0;
        Integer b = a;
        System.out.println(b.hashCode());
        new Object().equals(0);
    }
}
