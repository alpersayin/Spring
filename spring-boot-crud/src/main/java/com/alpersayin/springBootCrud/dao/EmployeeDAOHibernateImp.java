package com.alpersayin.springBootCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alpersayin.springBootCrud.entity.Employee;

@Repository
public class EmployeeDAOHibernateImp implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Employee getEmployee(Integer empId) {
		Session session = entityManager.unwrap(Session.class);
		Employee employee = session.get(Employee.class, empId);
		return employee;
	}

	@Override
	public List<Employee> listAll() {
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query =	session.createQuery("from Employee order by id", Employee.class);
		return query.getResultList();
	}

	@Override
	public Employee save(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		return employee;
	}

	@Override
	public void delete(Integer empId) {
		Session session = entityManager.unwrap(Session.class);
		//Employee employee = session.get(Employee.class, empId);
		Employee employee = getEmployee(empId);
		session.delete(employee);
		/*
		Query query = session.createQuery("delete from Employee where id:=employee_id");
		query.setParameter("employee_id", empId);
		query.executeUpdate();
		*/
	}
	
//	
}
