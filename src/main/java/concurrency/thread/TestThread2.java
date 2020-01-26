package concurrency.thread;

public class TestThread2 {
    public static boolean running = true;
    public static Thread thread;

    public static void main(String[] args) throws InterruptedException {
        trandition();
        Thread.sleep(200);
        running =false;
    }

    public static void trandition() {
        thread = new Thread(){
            @Override
            public void run() {
                while (running){
                //如果是空方法，不会受到信号
                    System.out.println("aaaaaaa");
                }
            }
        };
        thread.start();
    }
}
