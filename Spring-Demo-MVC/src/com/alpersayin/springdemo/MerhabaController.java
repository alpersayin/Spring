package com.alpersayin.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerhabaController {
	
	@RequestMapping("/merhabaform")
	public String showForm() {
		return "merhaba-form";
	}
	
	@RequestMapping("/hosgeldin")
	public String welcomePage() {
		return "welcome-page";
	}
	
	@RequestMapping("/buyrun")
	public String buyursunlar(HttpServletRequest request, Model model) {
		String name = request.getParameter("userName");
		String message = "HOSGELDIN ... " + name.toUpperCase();
		model.addAttribute("mesaj", message);
		return "buyrun-page";
	}
	
}
