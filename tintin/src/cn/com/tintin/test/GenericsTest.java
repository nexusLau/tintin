package cn.com.tintin.test;

import java.util.ArrayList;
import java.util.List;

import cn.com.tintin.entry.BaseEntry;
import cn.com.tintin.entry.UserLoginInfoEntry;

public class GenericsTest {
	
	public <T extends BaseEntry> void getGenericsTest(T t){
		System.out.println(t.getVersion());
	} 
	
	
	public static void main(String[] args) {
		GenericsTest test=new GenericsTest();
		UserLoginInfoEntry entry=new UserLoginInfoEntry();
		entry.setVersion(1);
		test.getGenericsTest(entry);
		List<UserLoginInfoEntry> list=new ArrayList<UserLoginInfoEntry>();
		
	}

}
