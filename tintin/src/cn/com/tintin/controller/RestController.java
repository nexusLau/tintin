package cn.com.tintin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
	
	@RequestMapping("/{id}")
	public void getId(@PathVariable String id ){
		System.out.println(id);
	}
	
	
	@RequestMapping("/sms/receiveSms")
	public void  receiveSmsMessage(HttpServletRequest request,HttpServletResponse response){
		String sourceId=request.getParameter("sourceId");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String serviceId=request.getParameter("serviceId");
		String senderId=request.getParameter("senderId");
		String level=request.getParameter("level");
		String message=request.getParameter("message");
		String users=request.getParameter("users");
		System.out.println(sourceId);
		System.out.println(userName);
		System.out.println(password);
		System.out.println(serviceId);
		System.out.println(senderId);
		System.out.println(level);
		System.out.println(message);
		System.out.println(users);
	}
	
}
