package com.alpersayin.springbootdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@Value("${app.programmer}")
	private String yourName;
	
	@RequestMapping("/mrb")
	public String merhaba() {
		return "Merhaba Javacı ghg " + yourName;
	}
	
//		
}
