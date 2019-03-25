package concurrency.thread;

import org.junit.Test;

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
    public void maxThreads(){
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            Thread.sleep(20* 100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5000; i++) {
            new Thread(new Runnable(){
                @Override
                public void run() {

                }
            }).start();
            System.out.println("i="+i);
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}