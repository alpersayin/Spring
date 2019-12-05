package com.furkan.springBootCrud.service;

import java.util.List;
import java.util.Optional;



import org.springframework.stereotype.Service;
import com.furkan.springBootCrud.dao.EmployeeRepository;
import com.furkan.springBootCrud.entity.Employee;


@Service
public class EmployeeServiceImp implements EmployeeService {


	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee getEmployee(Integer empId) {
		
		Optional<Employee> result =  employeeRepository.findById(empId); // Optional olarak donduruyor.Null olması ihtimaline karşı optional yapıyor.
		
		Employee emp = null;
		
		if(result.isPresent()) { // sonuç geldi mi her türlü referans yapabiliyorsun.Sonuç dönmüş mü ispresent olayı.
			emp = result.get();
		}
		
		else {
			
			throw new RuntimeException("No such id:" + empId);
		}
		
		return emp;
	}

	@Override
	public List<Employee> listAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		
	}

	@Override
	public void delete(int empId) {
		
		employeeRepository.deleteById(empId);
			
		
	}

}
