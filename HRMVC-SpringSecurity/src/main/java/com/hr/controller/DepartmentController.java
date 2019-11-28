package com.hr.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hr.entity.Department;
import com.hr.entity.Employee;
import com.hr.entity.Location;
import com.hr.service.DepartmentService;

@Controller
@RequestMapping("/department")
@Validated
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/list")
	public String listDepartments(Model model) {
		
		Department department = new Department();
		model.addAttribute("department", department);
		
		List<Department> myDepartments = departmentService.getDepartments();
		model.addAttribute("departments", myDepartments);
		
		HashMap<Integer, String> myEmployees = departmentService.getEmployees();
		model.addAttribute("employees", myEmployees);
		
		HashMap<Integer, String> myLocations = departmentService.getLocations();
		model.addAttribute("locations", myLocations);
		
		return "list-departments";
	}
	
	@GetMapping("/showDepartmentForm")
	public String showDepartmentForm(Model model) {
		
		Department dep = new Department();

		HashMap<Integer, String> myEmployees = departmentService.getEmployees();
		HashMap<Integer, String> myLocations = departmentService.getLocations();
		
		model.addAttribute("department", dep);
		model.addAttribute("employees", myEmployees);
		model.addAttribute("locations", myLocations);
		
		return "department-form";
	}
	
	@GetMapping("/saveDepartment")
	public String saveDepartment(@RequestParam("depName") String depName,
			@RequestParam("employeeId") String employeeId,
			@RequestParam("locationId") String locationId,
			@RequestParam("depId") Integer depId) {
		
		if (depId == null) {
			Department department = new Department();
			Employee employee = departmentService.getEmployees(Integer.valueOf(employeeId));
			Location location = departmentService.getLocations(Integer.valueOf(locationId));
			
			department.setDepName(depName);
			department.setManager(employee);
			department.setLocation(location);
			
			departmentService.saveDepartment(department);
		} else if (depId != null) {
			Department department = departmentService.getDepartments(depId);
			Employee employee = departmentService.getEmployees(Integer.valueOf(employeeId));
			Location location = departmentService.getLocations(Integer.valueOf(locationId));
			
			department.setDepId(depId);
			department.setDepName(depName);
			department.setManager(employee);
			department.setLocation(location);
			
			departmentService.updateDepartment(department);
		}
		
		return "redirect:/department/list";
	}
	
	@GetMapping("/updateDepartment")
	public String updateDepartment(@RequestParam("radioName") Integer departmentId, Model model) {
		
		Department department = departmentService.getDepartments(departmentId);
		model.addAttribute("depId", department.getDepId());
		
		HashMap<Integer, String> myEmployees = departmentService.getEmployees();
		HashMap<Integer, String> myLocations = departmentService.getLocations();
		
		if (department.getManager() != null) {
			Integer empId = department.getManager().getEmpId();
			model.addAttribute("empId", empId);
		} 
		
		if (department.getLocation() != null) {
			Integer locId = department.getLocation().getLocationId();
			model.addAttribute("locId", locId);
		} 
		
		model.addAttribute("depName", department.getDepName());
		model.addAttribute("employees", myEmployees);
		model.addAttribute("locations", myLocations);
		
		return "department-form";
	}
	
	@GetMapping("/deleteDepartment")
	public String deleteDepartment(@RequestParam("departmentId") Integer departmentId) {
		
		departmentService.deleteDepartment(departmentId);
		
		return "redirect:/department/list";
	}
	
	@GetMapping("/searchDepartment")
	public String searchDepartment(@RequestParam("searchName") String searchName,
			@RequestParam("employeeId") String employeeId,
			@RequestParam("locationId") String locationId, Model model) {
		
		List<Department> departments = departmentService.searchDepartment(searchName, Integer.valueOf(employeeId), 
				Integer.valueOf(locationId));
		model.addAttribute("departments", departments);
		
		HashMap<Integer, String> myEmployees = departmentService.getEmployees();
		model.addAttribute("employees", myEmployees);
		
		HashMap<Integer, String> myLocations = departmentService.getLocations();
		model.addAttribute("locations", myLocations);
		
		return "search-results";
	}
	
//	
}
