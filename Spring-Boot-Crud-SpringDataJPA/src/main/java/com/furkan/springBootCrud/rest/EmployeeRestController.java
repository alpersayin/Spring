package com.furkan.springBootCrud.rest;

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

import com.furkan.springBootCrud.entity.Employee;
import com.furkan.springBootCrud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	@Autowired // constructorda koyabilirsin aynı şekilde employeeService halinde bu alan için.
	private EmployeeService employeeService;
	
	@GetMapping("/test")
	public String test() {
		return "hodo hodo testi";
		
	}
	
	
	@GetMapping("/employees/{empId}") // Tek bir employee sorgusu yapmaya yarıyor.
	public Employee getEmployee(@PathVariable Integer empId) {
		
		Employee result = employeeService.getEmployee(empId);
		
		if(result==null) {
			throw new RuntimeException("No such emp id :" + empId);
		}
		return result;
		
	}

	
	@GetMapping("/employees")
	public List<Employee> listAll() {

		return employeeService.listAll();
		
	}
	
	@PostMapping("/employees") // insert 
	public Employee addEmployee(@RequestBody Employee employee) { // request ile gelen employee'yi service e yolluyorum
		
		
		employee.setId(0); // her ihtimale karşı insert gibi çalışmasını sağlıyorum 0'a çekerek.
		
		employeeService.saveEmployee(employee);
		
		return employee;
	
	}
	
	@PutMapping("/employees") // insert 
	public Employee updateEmployee(@RequestBody Employee employee) { // request ile gelen employee'yi service e yolluyorum
		
		employeeService.saveEmployee(employee);
		return employee;
	
	}
	
	@DeleteMapping("/employees/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		
		Employee emp = employeeService.getEmployee(empId);
		
		if(emp==null)
			throw new RuntimeException("No such emp id over here !!!");
		
		employeeService.delete(empId);
		return "Deleted emp with id:" + empId;

	}
	
	
	
	
}
