package com.alpersayin.springrestdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpersayin.springrestdemo.entity.Department;

@RestController
@RequestMapping("/deptservis")
public class DeptController {
	
	@GetMapping("/department")
	public Department getDepartment() {
		return new Department(10,"Accounting","Alper Ersayin");
	}
	
	@GetMapping("/departments")
	public List<Department> getDepartments() {
		
		List<Department> deptList = new ArrayList<Department>();
		
		deptList.add(new Department(10,"Accounting","Alper Ersayin"));
		deptList.add(new Department(20,"Human Resource","Caner Özkan"));
		deptList.add(new Department(30,"Production","İlyas Ağlar"));
		deptList.add(new Department(40,"Sales","Bengisu Özmelleş"));
		
		return deptList;
	}
	
//	
}
