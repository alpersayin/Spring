package com.alpersayin.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String showFirstPage(@ModelAttribute("anket") Anket anket) {
		return "anket-form-1";
	}
}
