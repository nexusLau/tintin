package cn.com.tintin.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import cn.com.tintin.entry.UserLoginInfoEntry;

public class FutureTaskTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask task=new FutureTask(new MyCallable("id"));//没有无参构造函数 第一种传参 一个实现callable的对象
		new Thread(task).start();
		Object a = task.get();
		System.out.println(a.toString());
		RunableTest testRunableTest=new RunableTest();
		UserLoginInfoEntry entry=new UserLoginInfoEntry();
		testRunableTest.setA("刘茂扬");
		testRunableTest.setEntry(entry);
		FutureTask task1=new FutureTask<UserLoginInfoEntry>(testRunableTest,entry);
		task1.run();
		UserLoginInfoEntry entry1 = (UserLoginInfoEntry)task1.get();
		System.out.println(entry1.getUserName());
	}
}
