package concurrency.thread;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import org.junit.Test;

import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++)
                System.out.println("new Thread");
        });
        thread.start();
        Thread.yield();
        System.out.println("main Thread");
        thread.join();
        System.out.println("ending");
    }
    @Test
    public void maxThreads() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Thread.sleep(20 * 100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }).start();
            System.out.println("i=" + i);
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void test44(){

        List<String> orderNos = Splitter.on(',').trimResults().omitEmptyStrings().splitToList("CSL8816530318238,CSL8816490460617,CSL8816490458641,CSL8816530315214,CSL8816490457277");

        int slice = IntMath.divide(orderNos.size(), 20, RoundingMode.CEILING);

        List<List<String>> partition = Lists.partition(orderNos, 20);
        for (int i = 0; i < slice; i++) {
            System.out.println(partition.get(i));
        }
    }
}