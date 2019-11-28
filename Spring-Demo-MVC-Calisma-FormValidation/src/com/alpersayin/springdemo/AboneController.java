package com.alpersayin.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboneController {

	@RequestMapping("/save")
	public String savePersonel(@ModelAttribute("abone") Abone abone) {

			return "abone-kayit";
			

	}
//
}
