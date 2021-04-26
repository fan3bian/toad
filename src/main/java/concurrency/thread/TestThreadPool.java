package concurrency.thread;

import java.util.concurrent.*;

public class TestThreadPool {
    public static void main(String[] args) {
        Executor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingDeque<>());
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Thread());
        executorService.submit(() -> {});


    }

}
