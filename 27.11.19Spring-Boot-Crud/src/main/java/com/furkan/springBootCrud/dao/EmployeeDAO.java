package com.furkan.springBootCrud.dao;

import java.util.List;

import com.furkan.springBootCrud.entity.Employee;

public interface EmployeeDAO {
	
	public Employee getEmployee(Integer empId);

	public List<Employee> getEmployees();

	public Employee save(Employee employee);

	public void delete(int empId);

}
