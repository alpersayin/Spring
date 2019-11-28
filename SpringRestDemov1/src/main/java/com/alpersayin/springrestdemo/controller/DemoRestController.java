package com.alpersayin.springrestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoRestController {

	@GetMapping("/hi")
	public String sayHi() {
		return "say hi to Justin";
	}
	
//
}
