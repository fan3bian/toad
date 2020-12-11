package concurrency.thread;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import org.apache.commons.collections.CollectionUtils;
import util.FileUtil;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class TestTask {

    private static final int THREAD_POOL_SIZE = 10;

    ExecutorService executorService = Executors.newFixedThreadPool(10);


    private void addBackToSourceTask(List<String> orderNos, String b/*回传编号*/) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        List<String> results = new ArrayList<>();
        if (!CollectionUtils.isEmpty(orderNos)) {
            for (String orderNo : orderNos) {
                Future<String> submit = executorService.submit(new CalculateIndexTask(orderNo));
                results.add(submit.get());
            }
        }
        System.out.println(results.size());
        long end = System.currentTimeMillis();
        System.out.println((end-start) / 100);
    }

    class CalculateIndexTask implements Callable<String> {
        private String orderNo;

        public CalculateIndexTask(String orderNo) {
            this.orderNo = orderNo;
        }

        public String call() throws InterruptedException {
            int sleepTime = new Random().nextInt(10);
            Thread.sleep(sleepTime);
            return orderNo+"线程"+Thread.currentThread().getName()+"睡了"+sleepTime+"豪秒";
        }
    }

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        TestTask testTask = new TestTask();
        String orders = FileUtil.getMsgBody("orders");
        List<String> soNos = Splitter.on(',').trimResults().omitEmptyStrings().splitToList(orders);
        testTask.addBackToSourceTask(soNos,"10");
    }
}
