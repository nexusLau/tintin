package cn.com.tintin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.tintin.sms.SmsService;
import cn.com.tintin.vo.ResultVo;

@Controller
public class RestController {
	
	@Autowired
	private SmsService smsService;
	
	@RequestMapping("/{id}")
	public void getId(@PathVariable String id ){
		System.out.println(id);
	}
	
	@RequestMapping("/sms/receiveXmlSms")
	public  @ResponseBody ResultVo receiveSmsXmlMessage(HttpServletRequest request,HttpServletResponse response,String xmlMessage){
		ResultVo resultVo=new ResultVo();
		try {
			smsService.parseSumbitXml(xmlMessage);
		} catch (DocumentException e) {
			resultVo.setFlag(false);
			e.printStackTrace();
		}
		return resultVo;
	}
	
	@RequestMapping("/sms/receiveSms")
	public @ResponseBody ResultVo  receiveSmsMessage(HttpServletRequest request,HttpServletResponse response){
		String sourceId=request.getParameter("SourceID");
		String userName=request.getParameter("UserName");
		String password=request.getParameter("Password");
		String serviceId=request.getParameter("ServiceID");
		String senderId=request.getParameter("SenderID");
		String level=request.getParameter("Level");
		String message=request.getParameter("Message");
		String users=request.getParameter("Users");
		System.out.println(sourceId);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(serviceId);
		System.out.println(senderId);
		System.out.println(level);
		System.out.println(message);
		System.out.println(users);
		ResultVo vo =new ResultVo();
		vo.setFlag(true);
		vo.setResCode("sms Success");
		vo.setResData("test ok");
		return vo;
	}
	
}
