package com.lu;

import java.util.concurrent.TimeUnit;

public class SynDemo {
    public synchronized static void access(){
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + "is runting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void access2(){
        synchronized (this) {
//            try {
//                TimeUnit.MINUTES.sleep(1);
//                System.out.println(Thread.currentThread().getName() + "is runting");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("hhh");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            new Thread(SynDemo::access).start();
        }
    }
}
