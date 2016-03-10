package cn.com.tintin.test;

import cn.com.tintin.entry.UserLoginInfoEntry;

public class RunableTest implements Runnable{

	private String a;
	
	private  UserLoginInfoEntry entry; 
	
	@Override
	public void run() {
		entry.setUserId(1L);
		entry.setUserName(a);
		System.out.println("调用一个Runnable的方法"+this.getA());
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public UserLoginInfoEntry getEntry() {
		return entry;
	}

	public void setEntry(UserLoginInfoEntry entry) {
		this.entry = entry;
	}
	
}
