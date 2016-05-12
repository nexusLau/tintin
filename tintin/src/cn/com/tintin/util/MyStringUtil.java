package cn.com.tintin.util;

public class MyStringUtil {
	
	/**
	 * 判断是否包含某一字符,包含返回true,否返回false;
	 * @param str
	 * @param c
	 * @return
	 */
	public boolean contains(String str,char c){
		Object ob=new Object();
		char[] strChar = str.toCharArray();
		for(int i=0;i<strChar.length;i++){
			if(c==strChar[i]){
				return true;
			}
		}
		return false;
		
	}
	
	/**
	 * 判断是否包含某一字符串
	 * @param str1
	 * @param str2
	 * @return
	 */
	public boolean contains(String str1,String str2){
		return false;
	}
	
	
	public boolean hasText(String str){
		return false;
	}
	

}
