package com.sude.thymeleafdemo.service;

import java.util.List;

import com.sude.thymeleafdemo.entity.Employee;

public interface EmployeeService {
	
	public Employee getEmployee(Integer empId);

	public List<Employee> listAll();
	
	public Employee save(Employee employee);
	
	public void delete(int empId);

}
