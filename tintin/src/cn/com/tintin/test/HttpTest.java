package cn.com.tintin.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.sun.xml.internal.stream.Entity;

public class HttpTest {
	
	private static HttpClient httpClient;
	
	public static final int MAX_ROUTE_CONNECTIONS=8000;
	
	public static final int  MAX_TOTAL_CONNECTIONS=8000;
	
	public static final int CATHCE=10*1023;
	
	public static HttpClient getHttpClinet(){
		if(null==httpClient){
			ThreadSafeClientConnManager connectionManager=new ThreadSafeClientConnManager();
			connectionManager.setMaxTotal(MAX_TOTAL_CONNECTIONS);
			connectionManager.setDefaultMaxPerRoute(MAX_ROUTE_CONNECTIONS);
			httpClient =new DefaultHttpClient(connectionManager);
			return httpClient;
		}else{
			return httpClient;
		}
		
	}
	
	/**
	 * 发送doGet请求
	 * @param url
	 * @param params
	 */
	public void doGet(String url,NameValuePair[] params){
		if(null!=params){
			url=url.concat("?");
			for(NameValuePair param :params){
				url=url.concat(param.getName().concat("="))
						.concat(param.getValue().concat("&"));
			}
		}
		HttpGet get=new HttpGet(url);
		httpClient=getHttpClinet();
		HttpResponse res=null;
		try {
			res=httpClient.execute(get);
			String result=EntityUtils.toString(res.getEntity());
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 发送post请求
	 * @param url
	 * @param totken
	 * @param body
	 */
	public void doPost(String url,String totken,Object body,NameValuePair[] params){
		
	}
	
	
	/**
	 * 拼装发送参数
	 * @param sourceId
	 * @param userName
	 * @param password
	 * @param serviceId
	 * @param sernderId
	 * @param level
	 * @param message
	 * @param users
	 * @return
	 */
	public NameValuePair[] getSmsPair(String sourceId,String userName,String password,String serviceId,String senderId,String level,String message,String users){
		NameValuePair[] params=new NameValuePair[8];
		params[0]=new BasicNameValuePair(sourceId, sourceId);
		params[1]=new BasicNameValuePair(userName, userName);
		params[2]=new BasicNameValuePair(password, password);
		params[3]=new BasicNameValuePair(serviceId, serviceId);
		params[4]=new BasicNameValuePair(senderId, senderId);
		params[5]=new BasicNameValuePair(level, level);
		params[6]=new BasicNameValuePair(message, message);
		params[7]=new BasicNameValuePair(users, users);
		return params;
	}

}
