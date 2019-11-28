package com.alpersayin.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnketController {
	
	@RequestMapping("/page1")
	public String showPage1(@ModelAttribute("anket") Anket anket) {
		
		return "anket-form-1";
	}
	
	@RequestMapping("/page2")
	public String showPage2(@ModelAttribute("anket") Anket anket) {
		
		return "anket-form-2";
	}
	
	@RequestMapping("/page3")
	public String showPage3(@ModelAttribute("anket") Anket anket) {
		
		return "anket-form-3";
	}
	
	@RequestMapping("/result")
	public String savePersonel(@ModelAttribute("anket") Anket anket) {
		
		return "results";
	}

}
