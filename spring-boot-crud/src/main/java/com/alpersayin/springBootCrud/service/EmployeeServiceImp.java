package com.alpersayin.springBootCrud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alpersayin.springBootCrud.dao.EmployeeDAO;
import com.alpersayin.springBootCrud.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImp(@Qualifier("employeeDAOJPAImp") EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	@Transactional
	public Employee getEmployee(Integer empId) {
		return employeeDAO.getEmployee(empId);
	}

	@Override
	@Transactional
	public List<Employee> listAll() {
		return employeeDAO.listAll();
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		return employeeDAO.save(employee);
	}

	@Override
	@Transactional
	public void delete(Integer empId) {
		employeeDAO.delete(empId);
	}
	
//
}
