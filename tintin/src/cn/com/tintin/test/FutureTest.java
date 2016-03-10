package cn.com.tintin.test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 Callable<Integer> callable = new Callable<Integer>() {
	         public Integer call() throws Exception {
	             return new Random().nextInt(100);
	         }
	     };
	     FutureTask<Integer> future = new FutureTask<Integer>(callable);
	     new Thread(future).start();
	     System.out.println(future.get());
	}
	
 

}
