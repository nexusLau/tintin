package cn.com.tintin.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.tintin.constant.PersonalConstant;
import cn.com.tintin.entry.UserLoginInfoEntry;
import cn.com.tintin.service.user.IUserLoginInfoService;
import cn.com.tintin.util.ApplicationContextUtil;
import cn.com.tintin.vo.UserLoginInfoVo;


@Controller
@RequestMapping("/user")
public class LoginController extends BaseController{

	private  Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private IUserLoginInfoService userLoginInfoService;
	
	@Resource
	private PersonalConstant personalConstant;
	
	@Autowired
	private ApplicationContextUtil applicationContextUtil;
	
	/**
	 * 简单的跳转方法
	 * @param id
	 * @return
	 */
	@RequestMapping("/longIn")
	public ModelAndView longIn(String id){
		String name=userLoginInfoService.getUserNameById(id);
		System.out.println(name);
		System.out.println(personalConstant.getUserName());
		//log.info("进入登录方式.12345678");
		ModelAndView mav=new ModelAndView();
		mav.addObject("name",name);
		mav.addObject("id",id);
		mav.setViewName("jsp/user/login");
		return mav; 
	}
	
   @RequestMapping("/getUserList")
   public @ResponseBody UserLoginInfoVo getUserList(HttpServletRequest request,HttpServletResponse response){
	return null;
	   
   }
	@RequestMapping("/forwardUserList")
   public String  forwardUserList(HttpServletRequest request,HttpServletResponse response){
	   return "jsp/user/userList";
   }
	@RequestMapping("loginOut")
   public ModelAndView loginOut(HttpServletRequest request,HttpServletResponse response,String name){
	  try {
		System.out.println(new String(name.getBytes("iso8859-1"),"utf-8"));
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	} 
	   return null;
   }
	
	  @RequestMapping("/getUserInfoPage")
	public void getUserInfoPage(HttpServletRequest request,HttpServletResponse response){
		  List<UserLoginInfoEntry> list = userLoginInfoService.getUserInfoPage();
		  System.out.println(list.size());
	}
}
