package ext.apache.lucene;

import com.carrotsearch.sizeof.RamUsageEstimator;
import org.junit.Test;

public class TestObjectSize {
    public static void main(String[] args) throws InterruptedException {
        Abandon a = new Abandon();
        Thread.sleep(1000* 60 * 10);
    }
    @Test
    public void test1(){
        int a = 1;
        Abandon abandon1 = new Abandon();
        ObjectA objectA =new ObjectA();
//        System.out.println(RamUsageEstimator.sizeOf(abandon1));
//        System.out.println(RamUsageEstimator.shallowSizeOf(a));
        System.out.println(RamUsageEstimator.humanSizeOf(objectA));
//        Integer b = new Integer(a);
//        System.out.println(RamUsageEstimator.sizeOf(b));
//        System.out.println(RamUsageEstimator.shallowSizeOf(b));
//        System.out.println(RamUsageEstimator.humanSizeOf(b));
//        long c = 0;
//        System.out.println(RamUsageEstimator.sizeOf(c));
//        System.out.println(RamUsageEstimator.shallowSizeOf(c));
//        System.out.println(RamUsageEstimator.humanSizeOf(c));
//        Long d = new Long(c);
//        System.out.println(RamUsageEstimator.sizeOf(d));
//        System.out.println(RamUsageEstimator.shallowSizeOf(d));
//        System.out.println(RamUsageEstimator.humanSizeOf(d));
    }
    private static class ObjectA {
        String str;   // 4
        int i1;       // 4
        byte b1;      // 1
        byte b2;      // 1
        int i2;       // 4
        ObjectB obj;  //4
        byte b3;      // 1
    }

    private static class ObjectB {

    }
}
