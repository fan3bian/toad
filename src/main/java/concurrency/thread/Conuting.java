package concurrency.thread;

public class Conuting {

    public static void main(String[] args) throws InterruptedException {
        class Counter{
            int count = 0;
            void increment(){
                count++;
            }
            int getCount(){
                return  count;
            }
        }
        final Counter counter = new Counter();
        class CountingThread extends Thread{
            @Override
            public void run() {
                for (int i = 0; i <10000000; i++) {
                    counter.increment();
                }
            }
        }
        CountingThread countingThread1 = new CountingThread();
        CountingThread countingThread2 = new CountingThread();
        countingThread1.start();
        countingThread2.start();
        countingThread1.join();
        countingThread2.join();
        System.out.println(counter.getCount());
        System.out.println("ending");
    }
}
