package cn.com.tintin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
	
	@RequestMapping("/{id}")
	public void getId(@PathVariable String id ){
		System.out.println(id);
	}
}
