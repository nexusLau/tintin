package cn.com.tintin.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cn.com.tintin.entry.UserLoginInfoEntry;
import cn.com.tintin.mapper.CommonMapper;

public class AnnotationTest {
	
	public static void main(String[] args) {
		 CommonMapper<UserLoginInfoEntry> mapper = new CommonMapper<UserLoginInfoEntry>();
		 UserLoginInfoEntry entry=new UserLoginInfoEntry();
		 mapper.insert(entry);
		 List<UserLoginInfoEntry> list=new ArrayList<UserLoginInfoEntry>();
		 for(int i=0;i<list.size();i++){
		 }
		 for(UserLoginInfoEntry vo:list){
			 //list.remove(vo); 不可取
		 }
		 Iterator<UserLoginInfoEntry> it = list.iterator();
		 while(it.hasNext()){
			 it.remove();
		 }
		 for(int i=list.size()-1;i>=0;i--){
			 list.remove(i);
		 }
		 
		 
	}
}
