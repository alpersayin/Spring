package com.alpersayin.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		String[] strArray = {"araba","yemek kartý"};
		personel.setSideBenefits(strArray);
		
		model.addAttribute("sahis", personel);
		
		return "personel-form";
	}
	
	@RequestMapping("/save")
	public String savePersonel(@ModelAttribute("kisi") Personel personel) {
		System.out.println("Personel : " + personel.getFirstName() + " " + personel.getLastName() + " " + personel.getSalary());
		
		return "personel-kayit";
	}
}
