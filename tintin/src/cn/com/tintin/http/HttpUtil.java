package cn.com.tintin.http;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.JSONUtils;
import net.sf.json.util.PropertyFilter;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.util.EntityUtils;

import cn.com.tintin.sms.SmsService;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

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
	public String doGet(String url,NameValuePair[] params)  throws  Exception{
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
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	/**
	 * 发送post请求
	 * @param url
	 * @param totken
	 * @param body
	 */
	public String  doPost(String url,String totken,Object body,NameValuePair[] params) throws  Exception {
		HttpPost httpPost=new HttpPost(url);
		/*for(NameValuePair param:params){
			httpPost.getParams().setParameter(param.getName(),param.getValue());
		}*/
		//httpPost.setHeader("auth-token",token);
		httpPost.setHeader("Content-Type","application/json");
		this.setRequestBody(httpPost,body);
		httpClient=getHttpClinet();
		HttpResponse httpResponse=null;
		try {
			httpResponse = httpClient.execute(httpPost);
			String result=EntityUtils.toString(httpResponse.getEntity());
			System.out.println(result);
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			throw  e;
		}

	}
	private void setRequestBody(HttpEntityEnclosingRequestBase http,Object params){
		String jsonStr="";
		if(params != null){
			JsonConfig jsonConfig=new JsonConfig();
			jsonConfig.setJsonPropertyFilter(new PropertyFilter() {
				@Override
				public boolean apply(Object source, String name, Object value) {
					if(value==null){
						return  true;
					}
					return  false;
				}
			});
			if (JSONUtils.isArray(params)){
				jsonStr= JSONArray.fromObject(params,jsonConfig).toString();
			}else {
				jsonStr= JSONObject.fromObject(params,jsonConfig).toString();
			}
			StringEntity entity=null;
			try {
				entity=new StringEntity(jsonStr.toString(),"utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			http.setEntity(entity);
		}

	}

	public static void main(String[] args) throws  Exception{
		HttpUtil httpUtil=new HttpUtil();
		String url="http://localhost:8080/tintin/sms/receiveSms.ding";
		SmsService service=new SmsService();
		NameValuePair[] params = service.getSmsPair("netgain", "incloudos", "123456a?", "FRSMS", "ibase", "1", "testSms", "18600147366");
		httpUtil.doGet(url, params);
		
	}
}
