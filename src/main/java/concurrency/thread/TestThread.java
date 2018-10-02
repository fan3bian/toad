package concurrency.thread;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    System.out.println("new Thread");
            }
        };
        thread.start();
        Thread.yield();
        System.out.println("main Thread");
        thread.join();
        System.out.println("ending");
    }

}