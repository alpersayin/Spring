package com.alpersayin.springBootCrud.service;

import java.util.List;

import com.alpersayin.springBootCrud.entity.Employee;

public interface EmployeeService {

	public Employee getEmployee(Integer empId);
	
	public List<Employee> listAll();
	
	public Employee save(Employee employee);
	
	public void delete(Integer empId);
	
//	
}
