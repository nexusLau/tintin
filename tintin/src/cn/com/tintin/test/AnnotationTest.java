package cn.com.tintin.test;

import cn.com.tintin.entry.UserLoginInfoEntry;
import cn.com.tintin.mapper.CommonMapper;

public class AnnotationTest {
	
	public static void main(String[] args) {
		 CommonMapper<UserLoginInfoEntry> mapper = new CommonMapper<UserLoginInfoEntry>();
		 UserLoginInfoEntry entry=new UserLoginInfoEntry();
		 mapper.insert(entry);
	}
}
