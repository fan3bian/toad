package concurrency.thread;

import java.util.concurrent.CountDownLatch;
 
public class StartAgent implements Runnable {
 
	private CountDownLatch countDownLatch;
 
	@Override
	public void run() {
		try {
			System.out.println("开始启动节点：" + Thread.currentThread().getName());
			//模拟每个任务执行3秒钟
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + "执行完毕");
			// 模拟执行任务异常
			// if(Thread.currentThread().getName().equals("pool-1-thread-4")){
			// System.out.println();
			// throw new InterruptedException("pool-1-thread-4启动失败");
			// }
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			//注意一定要在finally调用countDown，否则产生异常导致没调用到countDown造成程序死锁
			countDownLatch.countDown();
		}
	}
 
	public void setCountDownLatch(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
 
}