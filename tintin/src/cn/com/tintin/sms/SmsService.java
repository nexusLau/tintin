package cn.com.tintin.sms;

import com.sun.org.apache.xpath.internal.SourceTree;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class SmsService {
	
	private static String SOURCEID="SourceID";
	
	private static String USERNAME="UserName";

	private static String PASSWORD="Password";

	private static String SERVICEID="ServiceID";

	private static String SERNDERID="SenderID";

	private static String LEVEL="Level";

	private static String MESSAGE="Message";

	private static String USERS="Users";


	public String  smsLoginXml(String steamId,String loginId,  String name,String key){
		Document document = DocumentHelper.createDocument();
		Element rootElement = document.addElement("root");
		Element steamElement = rootElement.addElement("steam");
		steamElement.addAttribute("id",steamId);
		Element loginElement = rootElement.addElement("login");
		loginElement.addAttribute("id",loginId);
		loginElement.addAttribute("name",name);
		loginElement.addAttribute("key",key);
		String xml=document.asXML();
		System.out.println(xml);
		return xml;
	}


	/**
	 * 拼接xml的方式
	 */
	public String smsXML(String serviceID,String messange,String users,String level,String senderId){
		   //DocumentHelper提供了创建Document对象的方法  
        Document document = DocumentHelper.createDocument();  
        Element  rootElement=document.addElement("SUBMIT");
		Element serviceIDElement = rootElement.addElement("ServiceID");
		serviceIDElement.addText(serviceID);
		Element messageElement = rootElement.addElement("Message");
		messageElement.addText(messange);
		Element usersElement = rootElement.addElement("Users");
		usersElement.addText(users);
		Element levelElement = rootElement.addElement("Level");
		levelElement.addText(level);
		Element senderElement = rootElement.addElement("SenderID");
		senderElement.addText(senderId);
		String xml=document.asXML();
		System.out.println(xml);
		return xml;
	}
	/**
	 * 拼装发送参数
	 * @param sourceId
	 * @param userName
	 * @param password
	 * @param serviceId
	 * @param senderId
	 * @param level
	 * @param message
	 * @param users
	 * @return
	 */
	public NameValuePair[] getSmsPair(String sourceId,String userName,String password,String serviceId,String senderId,String level,String message,String users){
		NameValuePair[] params=new NameValuePair[8];
		params[0]=new BasicNameValuePair(SmsService.SOURCEID, sourceId);
		params[1]=new BasicNameValuePair(SmsService.USERNAME, userName);
		params[2]=new BasicNameValuePair(SmsService.PASSWORD, password);
		params[3]=new BasicNameValuePair(SmsService.SERVICEID, serviceId);
		params[4]=new BasicNameValuePair(SmsService.SERNDERID, senderId);
		params[5]=new BasicNameValuePair(SmsService.LEVEL, level);
		params[6]=new BasicNameValuePair(SmsService.MESSAGE, message);
		params[7]=new BasicNameValuePair(SmsService.USERS, users);
		return params;
	}
	
	public void parseLoginXml(String xmlStr) throws DocumentException{
	    Document document = DocumentHelper.parseText(xmlStr);
	    Element rootElement = document.getRootElement();
	    Element steamElement = rootElement.element("steam");
	    System.out.println(steamElement.attributeValue("id"));
	    Element loginElement = rootElement.element("login");
	    System.out.println(loginElement.attributeValue("id"));
	    System.out.println(loginElement.attributeValue("name"));
	    System.out.println(loginElement.attributeValue("key"));
	}
	public void parseSumbitXml(String xmlStr) throws DocumentException{
		   Document document = DocumentHelper.parseText(xmlStr);
		   Element rootElement = document.getRootElement();
		   Element serviceElement = rootElement.element("ServiceID");
		   Element messageElement = rootElement.element("Message");
		   Element usersElement = rootElement.element("Users");
		   Element levelElement = rootElement.element("Level");
		   Element senderElement = rootElement.element("SenderID");
		   System.out.println(serviceElement.getText());
		   System.out.println(messageElement.getText());
		   System.out.println(usersElement.getText());
		   System.out.println(levelElement.getText());
		   System.out.println(senderElement.getText());
		   
	}


	/**
	 * 替换xml中的特殊符号
	 * @param xml
	 */
	public  void repalceSing(String xml){
		xml.replace("&"," &amp;");
		xml.replace("<"," &lt;");
		xml.replace(">"," &gt;");
		System.out.println(xml);
	}

	public static void main(String[] args) throws DocumentException {
		SmsService sms=new SmsService();
		String xmlStr=sms.smsXML("OAKSM", "测试短信", "18600147366", "1", "incloudos");
		sms.parseSumbitXml(xmlStr);
	}
}
