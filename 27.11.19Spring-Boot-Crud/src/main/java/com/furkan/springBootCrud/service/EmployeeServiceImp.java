package com.furkan.springBootCrud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.furkan.springBootCrud.dao.EmployeeDAO;
import com.furkan.springBootCrud.entity.Employee;


@Service
public class EmployeeServiceImp implements EmployeeService {

	//@Autowired i aşağıdaki constructor sağlıyor.
	private EmployeeDAO employeeDAO;
	
	// Otomatik olarak autowired etcek burda constructordan
	public EmployeeServiceImp(@Qualifier("employeeDAOJPAImp")EmployeeDAO employeeDAO) { // burdan çalış diyorum Qualifier ile.
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
		
		return employeeDAO.getEmployees();
	}

	@Override
	@Transactional
	public Employee saveEmployee(Employee employee) {
		
		return employeeDAO.save(employee);
		
	}

	@Override
	@Transactional
	public void delete(int empId) {
		
		employeeDAO.delete(empId);
			
		
	}

}
