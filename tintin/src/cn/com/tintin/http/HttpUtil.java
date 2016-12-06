package cn.com.tintin.http;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.util.EntityUtils;

public class HttpUtil {

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
}
