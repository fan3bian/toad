package advanced.jvm;

import org.apache.lucene.util.RamUsageEstimator;

public class TestJvmOption {
    public static void main(String[] args) {
        //-Xms100m -Xmx100m -Xmn50m -XX:SurvivorRatio=6 -XX:+PrintFlagsFinal
        //-Xms10m -Xmx10m -Xmn5m -XX:SurvivorRatio=6 -XX:+PrintFlagsFinal -XX:+UseG1GC
        try {
            int[] bytes = new int[1024];
            System.out.println(RamUsageEstimator.shallowSizeOf(bytes));//
            System.out.println(RamUsageEstimator.humanSizeOf(bytes));//

            Thread.sleep(1000 * 60 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
