package com.hr.controller;

import java.util.HashMap;
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

import com.hr.entity.Department;
import com.hr.entity.Employee;
import com.hr.entity.Location;
import com.hr.rest.EntityNotFoundException;
import com.hr.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentRestController {

	@Autowired
	private DepartmentService departmentService;
	
	List<Department> departments;

	/*
	@PostConstruct
	private void loadList() {
		departments = departmentService.getDepartments();
	}
	*/
	@GetMapping("/departments")
	public List<Department> getDepartments() {
		/*
		 * employee ve locationsa ları önden set et...
		 */
		
		return departmentService.getDepartments();
	}
	
	@GetMapping("/departments/{deptId}")
	public Department getDepartmentById(@PathVariable int deptId) {
		Department department = departmentService.getDepartments(deptId);
		if (department == null)
			throw new EntityNotFoundException("Böyle bir departman yoktur.");
		return department;
	}
	
	@PostMapping("/departments")
	public Department addDepartment(@RequestBody Department department) {
		department.setDepId(0);
		departmentService.saveDepartment(department);
		return department;
	}
	
	@PutMapping("/departments")
	public Department updateDepartment(@RequestBody Department department) {
		if (department.getDepId() != 0) {
			departmentService.updateDepartment(department);
		}
		return department;
	}
	
	@DeleteMapping("/departments/{depId}")
	public String deleteDepartment(@PathVariable Integer depId) {
		Department department = departmentService.getDepartments(depId);
		if (department == null)
			throw new EntityNotFoundException("Böyle bir departman yoktur.");
		departmentService.deleteDepartment(depId);
		return null;
	}
	
	@GetMapping("/employees")
	public HashMap<Integer, String> getEmployees() {
		return departmentService.getEmployees();
	}
	
	@GetMapping("/employees/{empId}")
	public Employee getEmployeeById(@PathVariable Integer empId) {
		Employee employee = departmentService.getEmployees(empId);
		if (employee == null)
			throw new EntityNotFoundException("Böyle bir employee yoktur.");
		return employee;
	}
	
	@GetMapping("/locations")
	public HashMap<Integer, String> getLocations() {
		return departmentService.getLocations();
	}
	
	@GetMapping("/locations/{locId}")
	public Location getLocationById(@PathVariable Integer locId) {
		Location location = departmentService.getLocations(locId);
		if (location == null) 
			throw new EntityNotFoundException("Böyle bir location yoktur.");
		return location;
	}
	
//	
}
