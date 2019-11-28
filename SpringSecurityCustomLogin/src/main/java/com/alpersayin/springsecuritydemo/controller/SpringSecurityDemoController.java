package com.alpersayin.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityDemoController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
//	
}
