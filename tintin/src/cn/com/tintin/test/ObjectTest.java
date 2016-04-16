package cn.com.tintin.test;

import java.util.ArrayList;
import java.util.List;

import cn.com.tintin.entry.BaseEntry;

public class ObjectTest {
	
	private  static final String abc="def";
	
	public  void getString(){
		String abc="456";
		System.out.println("方法里的abc"+abc);
	}
	
	public static void main(String[] args) {
		System.out.println(abc);
		ObjectTest test=new ObjectTest();
		test.getString();
		System.out.println(abc);
	}
	
}
