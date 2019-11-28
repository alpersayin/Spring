package com.alpersayin.springBootCrud.dao;

import java.util.List;

import com.alpersayin.springBootCrud.entity.Employee;

public interface EmployeeDAO {

	public Employee getEmployee(Integer empId);

	public List<Employee> listAll();

	public Employee save(Employee employee);

	public void delete(Integer empId);
	
//	
}
