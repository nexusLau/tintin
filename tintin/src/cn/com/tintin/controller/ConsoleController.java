package cn.com.tintin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/console")
public class ConsoleController   extends BaseController{

	
	private  Logger log = LoggerFactory.getLogger(ConsoleController.class);
	
	
	/**
	 * 跳转到后台的管理页面
	 * @return
	 */
	@RequestMapping("/index")
	public String loginIndex(){
		return "jsp/console/consoleIndex";
	}
	
	
	
}
