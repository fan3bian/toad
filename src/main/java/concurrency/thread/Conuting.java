package concurrency.thread;

public class Conuting {

    public static void main(String[] args) throws InterruptedException {
        class Counter{
            int count = 0;
            //synchronized
            void increment(){
                count++;
            }//synchronized 位于void之前
            int getCount(){
                return  count;
            }
        }
        final Counter counter = new Counter();
        class CountingThread extends Thread{
            @Override
            public void run() {
                for (int i = 0; i <1000000000; i++) {
                    counter.increment();
                }
            }
        }
        long start = System.currentTimeMillis();
        CountingThread countingThread1 = new CountingThread();
        CountingThread countingThread2 = new CountingThread();
        countingThread1.start();
        countingThread2.start();
        countingThread1.join();
        countingThread2.join();
        System.out.println(counter.getCount());
        long end = System.currentTimeMillis();

        System.out.println("time : "+(end-start));
    }
}
