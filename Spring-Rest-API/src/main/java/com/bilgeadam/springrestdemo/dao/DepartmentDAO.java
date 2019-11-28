package com.bilgeadam.springrestdemo.dao;

import java.util.List;

import com.bilgeadam.springrestdemo.entity.Department;

public interface DepartmentDAO { 
	
	public List<Department> getDepartments();

	public void saveDepartment(Department department);

	public Department getDepartment(int departmentId);

	public void deleteDepartment(int departmentId);

	public List<Department> searchDepartments(String searchName);

}
