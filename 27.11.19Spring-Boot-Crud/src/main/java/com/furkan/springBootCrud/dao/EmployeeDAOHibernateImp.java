package com.furkan.springBootCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//1.Yöntem.Şu an bu örnekte "NativeHibernateApı" çağrısı yaparak yapcaz.
import com.furkan.springBootCrud.entity.Employee;


@Repository // Daoyu repository olarak belirtiyorum.
public class EmployeeDAOHibernateImp implements EmployeeDAO {

	private EntityManager entityManager;	
	
	// Constructor injection oluşturuyoruz.Autowired demeden de çalışır gerekli değil
	@Autowired 
	public EmployeeDAOHibernateImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Employee getEmployee(Integer empId) {
		
		Session session = entityManager.unwrap(Session.class); // entity manageri bir anlamda sessiona dönüştürüyorum.
		
		Employee employee = session.get(Employee.class, empId);
		
		return employee;
	
	}

	@Override
	public List<Employee> getEmployees() {
		
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("from Employee",Employee.class);
		
		return query.getResultList();
	}

	@Override
	public Employee save(Employee employee) {
		
		Session session = entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(employee);
		
		return employee;
		
	}

	@Override
	public void delete(int empId) {
		
		Session session = entityManager.unwrap(Session.class);
		
		//Employee employee = session.get(Employee.class, empId);
		
		Employee employee = getEmployee(empId);
		
		session.delete(employee);
		
		// 2. Yöntem (Veya)
		/*
		Query query = session.createQuery(
				"delete from Employee where id=:employee_id");
		
		query.setParameter("employee_id",empId);
		query.executeUpdate();*/
		
	}

}
