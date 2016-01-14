package cn.com.tintin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	private  Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping("longIn")
	public ModelAndView longIn(){
		log.info("进入登录方式.");
		return null;
	}
}
