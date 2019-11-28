package com.alpersayin.calisan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alpersayin.calisan.entity.Calisan;
import com.alpersayin.calisan.service.CalisanService;

@Controller
@RequestMapping("/calisan")
public class CalisanController {
	
	@Autowired
	private CalisanService calisanService;
	
	@GetMapping("/list")
	public String listCalisanlar(Model model) {
		
		List<Calisan> myCalisanlar = calisanService.getCalisanlar();
		
		model.addAttribute("calisanlar", myCalisanlar);
		
		return "list-calisanlar";
	}
	
	@GetMapping("/addCalisanForm")
	public String addCalisanForm(Model model) {
		
		Calisan c = new Calisan();
		c.setFirstName("ALPER");
		model.addAttribute("calisan", c);
		
		return "calisan-form";
	}
	
	@PostMapping("/saveCalisan")
	public String saveCalisan(@ModelAttribute("calisan") Calisan calisan) {
		
		calisanService.saveCalisan(calisan);
		
		return "redirect:/calisan/list";	
	}
	
	@GetMapping("updateCalisanForm")
	public String updateCalisanForm(@RequestParam("calisanId") int calisanId, Model model) {
		
		Calisan calisan = calisanService.getCalisanlar(calisanId);
		model.addAttribute(calisan);
	
		return "calisan-form";
	}
	
	@GetMapping("deleteCalisan")
	public String deleteCalisan(@RequestParam("calisanId") int calisanId) {
		
		calisanService.deleteCalisan(calisanId);
		
		return "redirect:/calisan/list";
	}

	@GetMapping("searchCalisan")
	public String searchCalisan(@RequestParam("calisanAra") String calisanAra, Model model) {
		
		List<Calisan> calisanlar = calisanService.searchCalisan(calisanAra);
		model.addAttribute("calisanlar", calisanlar);
		
		return "list-calisanlar";
	}
	
//	
}
