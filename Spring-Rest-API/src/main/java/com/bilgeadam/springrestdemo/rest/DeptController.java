package com.bilgeadam.springrestdemo.rest;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bilgeadam.springrestdemo.entity.Department;
import com.bilgeadam.springrestdemo.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DeptController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostConstruct // Controller ayağa kalkar kalmaz ayağa kalkan bir method annotationı
	private void loadList() {
		//deptList =  departmentService.getDepartments();		
	}
	
	@GetMapping("/departments")
	public List<Department> getDepartments() {
		return departmentService.getDepartments();
	}
	
	@GetMapping("/departments/{deptNo}")
	public Department getDeptById(@PathVariable int deptNo) {
		Department dep = departmentService.getDepartment(deptNo);
		if (dep == null) {
			throw new EntityNotFoundException("Böyle bir departman yoktur.");
		}
		return dep;
	}
	
	@PostMapping("/departments") // insert, create
	public Department addDepartment(@RequestBody Department department) {
		department.setId(0);
		departmentService.saveDepartment(department);
		return department;
	}
	
	@PutMapping("/departments") // update, create
	public Department updateDepartment(@RequestBody Department department) {
		if (department.getId() > 0)
			departmentService.saveDepartment(department);
		return department;
	}
	
	@DeleteMapping("/departments/{deptNo}") // update, create
	public String deleteDepartment(@PathVariable int deptNo) {
		Department department = departmentService.getDepartment(deptNo);
		if (department == null) 
			throw new EntityNotFoundException("Böyle bir departman yok.");
		departmentService.deleteDepartment(deptNo);
		return "Departman silindi, id: " + deptNo;
	}
	
//
}
