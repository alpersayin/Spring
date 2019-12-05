package com.sude.thymeleafdemo.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sude.thymeleafdemo.entity.Employee;
import com.sude.thymeleafdemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeThymeleafController {
	
	private EmployeeService employeeService;
	
	public EmployeeThymeleafController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/list")
	public String showList(Model model) {
		List<Employee> emps = employeeService.listAll();
		model.addAttribute("empList", emps);
		return "employees/employees";
	}
	
	@GetMapping("/add")
	public String showFormEmpty(Model model) {
		Employee emp = new Employee();
		//emp.setFirstName("Metin");
		//emp.setLastName("Öztunç");
		//emp.setEmail("metin@gmail.com");
		model.addAttribute("employee", emp);
		
		return "employees/emp-form";
	}
	
	@PostMapping("/save")
	public String saveForm(@ModelAttribute("employee") Employee emp) {
		employeeService.save(emp);
		return "redirect:/employees/list";
	}
	
	@GetMapping("/update")
	public String showFormUpdate(@RequestParam("employeeId") int employeeId, Model model) {
		Employee emp = employeeService.getEmployee(employeeId);
		model.addAttribute("employee", emp);
		return "employees/emp-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int employeeId) {
		employeeService.delete(employeeId);
		return "redirect:/employees/list";
	}

}
