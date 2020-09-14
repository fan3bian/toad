package concurrency.juc;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    @Test
    public void testThreadPool(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
    }
}
