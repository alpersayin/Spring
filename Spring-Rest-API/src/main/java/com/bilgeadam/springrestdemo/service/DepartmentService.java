package com.bilgeadam.springrestdemo.service;

import java.util.List;

import com.bilgeadam.springrestdemo.entity.Department;

public interface DepartmentService {
	
	public List<Department> getDepartments();

	public void saveDepartment(Department department);

	public Department getDepartment(int departmentId);

	public List<Department> searchDepartments(String searchName);

	public void deleteDepartment(int departmentId);

}
