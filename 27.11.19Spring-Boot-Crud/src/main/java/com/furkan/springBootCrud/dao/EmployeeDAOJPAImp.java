package com.furkan.springBootCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//1.Yöntem.Şu an bu örnekte "NativeHibernateApı" çağrısı yaparak yapcaz.
import com.furkan.springBootCrud.entity.Employee;

// 2.Yöntem burda session değil,entityManager üzerinden çalışıcam
@Repository 
public class EmployeeDAOJPAImp implements EmployeeDAO {


	private EntityManager entityManager;
	
	
	// Constructor injection oluşturuyoruz.Autowired demeden de çalışır gerekli değil
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
	public List<Employee> getEmployees() {
			
		Query query = entityManager.createQuery("from Employee",Employee.class); // query'i bu sefer hibarnateden değil persistencedan alıcaz.
		
		return query.getResultList();
	}

	@Override
	public Employee save(Employee employee) {

		entityManager.merge(employee); // saveOrUpdate gibi çalışıyor merge.
	
		return employee;
		
	}

	@Override
	public void delete(int empId) {
			
		Employee employee = getEmployee(empId);
		
		entityManager.remove(employee);
		
		// veya Query ile.
		
	}

}
