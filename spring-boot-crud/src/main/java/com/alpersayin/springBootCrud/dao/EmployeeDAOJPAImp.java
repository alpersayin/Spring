package com.alpersayin.springBootCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alpersayin.springBootCrud.entity.Employee;

@Repository
public class EmployeeDAOJPAImp implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJPAImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Employee getEmployee(Integer empId) {
		Employee employee = entityManager.find(Employee.class, empId);
		return employee;
	}

	@Override
	public List<Employee> listAll() {
		Query query = entityManager.createQuery("from Employee order by id");
		return query.getResultList();
	}

	@Override
	public Employee save(Employee employee) {
		return entityManager.merge(employee);
	}

	@Override
	public void delete(Integer empId) {
		Employee employee = getEmployee(empId);
		entityManager.remove(employee);
	}
	
//	
}
