package com.alpersayin.springdemo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personel")
public class PersonelController {
	
	@RequestMapping("/show")
	public String showPersonel(Model model) {
		Personel personel = new Personel();
		personel.setFirstName("ALPER");
		personel.setLastName("ERSAYIN");
		personel.setSalary(7000);
		personel.setPostBox("PK150");
		personel.setRestDay("Sunday");
		
		model.addAttribute("sahis", personel);
		
		return "personel-form";
	}
	
	@RequestMapping("/save")
	public String savePersonel(@Valid @ModelAttribute("sahis") Personel personel, BindingResult bindingResult) {
		System.out.println("Personel : " + personel.getFirstName() + " " + personel.getLastName() + " " + personel.getSalary());
		System.out.println(bindingResult);
		if (bindingResult.hasErrors()) {
			return "personel-form";
		} else {
			return "personel-kayit";
		}
	}
	
//	
}
