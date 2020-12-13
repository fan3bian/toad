package concurrency.jmm;

import java.util.concurrent.TimeUnit;

public class T {
    volatile boolean running = true;
    void m(){
        System.out.println("m start");
        while (running) {

        }
        System.out.println("m end");

    }

    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        new Thread(t::m,"t1").start();
        TimeUnit.SECONDS.sleep(1);
        t.running = false;//终止正在执行的一个线程
    }
}
