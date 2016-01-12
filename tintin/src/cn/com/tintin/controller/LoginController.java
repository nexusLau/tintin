package cn.com.tintin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	
	@RequestMapping("longIn")
	public ModelAndView longIn(){
		System.out.println("进入用户登录方法");
		return null;
	}
}
