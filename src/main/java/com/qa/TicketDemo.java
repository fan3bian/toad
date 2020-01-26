package com.qa;

/**
 * 银行柜台叫号
 */
public class TicketDemo extends Thread{
    static int TOTAL = 5090;
    static int current = 1;//如果current是成员变量，则表示任意当一个柜台完成50次叫号，停止。成员变量在多个对象对象之间是私有的；
    // 如果current是类变量，则存放在方法区常量池中，多个对象之间共享。java多线程之间的通信通过共享内存来实现。多线程若无序访问共享变量，会出现跳号、重号的现象。与线程读写变量的方式有关

    @Override
    public void run() {
        synchronized (TicketDemo.class) {
            while (current <= TOTAL) {
                System.out.println(Thread.currentThread().getName() + "叫到的号码是：" + (current++));
            }
        }
    }

    public static void main(String[] args) {
        TicketDemo ticketDemo1 = new TicketDemo();
        TicketDemo ticketDemo2 = new TicketDemo();
        TicketDemo ticketDemo3 = new TicketDemo();
        TicketDemo ticketDemo4 = new TicketDemo();
        ticketDemo1.start();
        ticketDemo2.start();
        ticketDemo3.start();
        ticketDemo4.start();
    }
}
