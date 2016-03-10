package cn.com.tintin.test;

public class ThreadTest{
	
	
	public static void main(String[] args) throws InterruptedException {
		RunableTest test1=new RunableTest();
		test1.setA("234556");
		test1.run();
		
		/*System.out.println("进入该方法");
		final Integer i=10;
		 Thread thread =new Thread(new Runnable() {
	            @Override
	            public void run() {
	            	System.out.println("输出参数为i+1"+(i+1));
	            }
	        });//起一个线程
	    thread.sleep(1000);
	    thread.start();
	    System.out.println("输出参数i"+i);*/
	    
	}
}
