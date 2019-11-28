package com.alpersayin.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringSecurityDemoController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/managers")
	public String adminsArea() {
		return "managers";
	}
	
	@GetMapping("/hr")
	public String hrsArea() {
		return "hr";
	}
	
	@GetMapping("/erisim-engellendi")
	public String accessDenied() {
		return "erisim";
	}
	
//	
}
