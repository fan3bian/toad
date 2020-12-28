package ext.apache.lucene;

import com.carrotsearch.sizeof.RamUsageEstimator;
import org.junit.Test;

public class TestObjectSize {

    @Test
    public void test1(){
        int a = 1;
        System.out.println(RamUsageEstimator.sizeOf(a));
        System.out.println(RamUsageEstimator.shallowSizeOf(a));
        System.out.println(RamUsageEstimator.humanSizeOf(a));
        Integer b = new Integer(a);
        System.out.println(RamUsageEstimator.sizeOf(b));
        System.out.println(RamUsageEstimator.shallowSizeOf(b));
        System.out.println(RamUsageEstimator.humanSizeOf(b));
        long c = 0;
        System.out.println(RamUsageEstimator.sizeOf(c));
        System.out.println(RamUsageEstimator.shallowSizeOf(c));
        System.out.println(RamUsageEstimator.humanSizeOf(c));
        Long d = new Long(c);
        System.out.println(RamUsageEstimator.sizeOf(d));
        System.out.println(RamUsageEstimator.shallowSizeOf(d));
        System.out.println(RamUsageEstimator.humanSizeOf(d));
    }
}
