package concurrency.thread;

import concurrency.jmm.T;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Thread());
        executorService.submit(() -> {});
    }
}
