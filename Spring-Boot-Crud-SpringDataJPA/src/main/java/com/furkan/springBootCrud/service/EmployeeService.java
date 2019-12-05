package com.furkan.springBootCrud.service;

import java.util.List;

import com.furkan.springBootCrud.entity.Employee;

public interface EmployeeService {
	
	
	public Employee getEmployee(Integer empId);
	
	public List<Employee> listAll();
	
	public Employee saveEmployee(Employee employee);
	
	public void delete(int empId);

}
