package com.alpersayin.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("employee") Employees e) {
		return "home-page";
	}
	
//
}
