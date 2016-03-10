package cn.com.tintin.mapper;

import java.lang.reflect.Field;

import cn.com.tintin.annotation.Column;
import cn.com.tintin.annotation.History;
import cn.com.tintin.annotation.Table;
import cn.com.tintin.entry.BaseEntry;

public class CommonMapper<T extends BaseEntry> {
	
	public  Long insert(T t){
	 Class<? extends BaseEntry> tClass = t.getClass();
	 String tableName="";
	 String histoyName="";
	 tableName=tClass.getSimpleName();
	 System.out.println(tableName);
	 Table tableAnnotation = tClass.getAnnotation(Table.class);
	 if(tableAnnotation!=null){//如果不为空
		 tableName=tableAnnotation.name();
		 System.out.println(tableName);
	 }
	 History historyAnnotation = tClass.getAnnotation(History.class);
	 if(historyAnnotation!=null){
		histoyName= historyAnnotation.name();
		System.out.println(histoyName);
	 }
	 //获取字段名以及对应的属性
	  Field[] fields = tClass.getDeclaredFields();
	  for(Field field:fields){
		  //判断属性类型
		  
		 Column coilmnAnnotaition= field.getAnnotation(Column.class);
		
	  }
	 
	
		return null;
	}
	
}
