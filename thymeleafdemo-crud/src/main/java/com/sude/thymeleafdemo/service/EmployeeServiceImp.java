package com.sude.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sude.thymeleafdemo.dao.EmployeeRepository;
import com.sude.thymeleafdemo.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImp(EmployeeRepository employeeDAO) {
		this.employeeRepository = employeeDAO;
	}

	@Override
	public Employee getEmployee(Integer empId) {
		Optional<Employee> result = employeeRepository.findById(empId);
		Employee emp = null;
		if(result.isPresent()) {
			emp = result.get();
		}
		else
			throw new RuntimeException("No such id: "+empId);
		return emp;
	}


	@Override
	public List<Employee> listAll() {
		return employeeRepository.findAll();
	}


	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public void delete(int empId) {
		employeeRepository.deleteById(empId);
	}

}
