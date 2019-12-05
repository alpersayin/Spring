package com.sude.thymeleafdemo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloThymeleafController {
	
	@GetMapping("/merhaba")
	public String merhaba(Model model) {
		model.addAttribute("tarih", new Date());
		model.addAttribute("user", "sude mercan");
		return "hello";
	}

}
