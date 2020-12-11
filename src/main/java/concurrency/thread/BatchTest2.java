package concurrency.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
import com.google.common.collect.Lists;
 
public class BatchTest2 {
	public static void main(String[] args) throws InterruptedException {
		//线程池10个线程
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		//第一批十个任务
		List<StartAgent> agentsStart = Lists.newArrayList(new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent());
		//第二批十个任务
		List<StartAgent> agentsStart2 = Lists.newArrayList(new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent(),new StartAgent());
		List<List<StartAgent>> task = new ArrayList<>();
		task.add(agentsStart);
		task.add(agentsStart2);
		//记录任务执行时间
		long t1 = System.currentTimeMillis();
		CountDownLatch c ;
		//循环任务组
		for(List<StartAgent> startList : task){
			//定义线程阻塞为10
			c = new CountDownLatch(10);
			for(StartAgent agent : startList){
				agent.setCountDownLatch(c);
				executorService.submit(agent);
			}
			//阻塞，等待十个任务都执行后，才继续下一批10任务
			c.await();
		}
		long t2 = System.currentTimeMillis();
		System.out.println("执行时间："+  (t2 - t1)/1000);
		executorService.shutdown();
	}
}