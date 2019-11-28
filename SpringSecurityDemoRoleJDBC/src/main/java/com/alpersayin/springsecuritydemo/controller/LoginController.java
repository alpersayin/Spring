package com.alpersayin.springsecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@GetMapping("/showCustomLoginPage")
	public String showCustomLoginPage () {
		
		return "login";
	}
	
	@GetMapping("/showAnotherPage")
	public String showAnotherPage () {
		
		return "other";
	}
	
	@PostMapping("/gizliSayfa")
	public String gizliSayfa () {
		
		return "gizli";
	}

//	
}
