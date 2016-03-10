package cn.com.tintin.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 带有返回值的多线程相关调用
 * @author LiuMaoyang
 *
 */
public class ExecutorTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Date date1 = new Date();  
		int taskSize = 5; 
		// 创建一个线程池  
		ExecutorService pool = Executors.newFixedThreadPool(taskSize);
		// 创建多个有返回值的任务  
		List<Future> list = new ArrayList<Future>();
		 for (int i = 0; i < taskSize; i++) {  
			    Callable c = new MyCallable(i + " ");  
			    // 执行任务并获取Future对象  
			    Future f = pool.submit(c);  
			    // System.out.println(">>>" + f.get().toString());  
			    list.add(f);  
		 }
		 pool.shutdown();
		 for (Future f : list) {  
			 // 从Future对象上获取任务的返回值，并输出到控制台  
			 System.out.println(">>>" + f.get().toString());  
		 }  
		Date date2 = new Date();  
	    System.out.println("----程序结束运行----，程序运行时间【"+ (date2.getTime() - date1.getTime()) + "毫秒】");  
 	}
}
