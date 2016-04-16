package cn.com.tintin.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.tintin.constant.PersonalConstant;
import cn.com.tintin.service.user.IUserLoginInfoService;
import cn.com.tintin.util.ApplicationContextUtil;


@Controller
public class LoginController extends BaseController{

	private  Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private IUserLoginInfoService userLoginInfoService;
	
	@Resource
	private PersonalConstant personalConstant;
	
	@Autowired
	private ApplicationContextUtil applicationContextUtil;
	
	@RequestMapping("/longIn")
	public ModelAndView longIn(String id){
		String name=userLoginInfoService.getUserNameById(id);
		System.out.println(name);
		System.out.println(personalConstant.getUserName());
		log.info("进入登录方式.12345678");
		return null;
	}
}
