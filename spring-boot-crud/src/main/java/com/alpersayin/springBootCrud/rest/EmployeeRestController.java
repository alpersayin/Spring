package com.alpersayin.springBootCrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpersayin.springBootCrud.entity.Employee;
import com.alpersayin.springBootCrud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/test")
	public String test() {
		return "test123";
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployee(@PathVariable Integer empId) {
		Employee result = employeeService.getEmployee(empId);
		if (result == null) {
			throw new RuntimeException("No such employee id with " + empId);
		}
		return result;
	}
	
	@GetMapping("/employees")
	public List<Employee> listAll() {
		return employeeService.listAll();
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		employee.setId(0);
		employeeService.save(employee);
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}
	
	@DeleteMapping("/employees/{empId}")
	public void deleteEmployee(@PathVariable Integer empId) {
		Employee emp = employeeService.getEmployee(empId);
		if (emp == null) {
			throw new RuntimeException("No such emp id with: " + empId);
		}
		employeeService.delete(empId);
	}
	
//	
}
