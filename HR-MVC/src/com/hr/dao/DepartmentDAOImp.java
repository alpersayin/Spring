package com.hr.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hr.entity.Department;
import com.hr.entity.Employee;
import com.hr.entity.Location;

@Repository
public class DepartmentDAOImp implements DepartmentDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Department> getDepartments() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Department> query = session.createQuery("from Department", Department.class);
		
		List<Department> departments = query.getResultList();
		
		return departments;
	}
	
	@Override
	public Department getDepartments(Integer departmentId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Department.class, departmentId);
	}

	@Override
	public void saveDepartment(Department department) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(department);
	}

	@Override
	public LinkedHashMap<Integer, String> getEmployees() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		
		List<Employee> employeeList = query.getResultList();
		
		LinkedHashMap<Integer, String> employees = new LinkedHashMap<Integer, String>();
		
		for (Employee employee : employeeList) {
			String fullName = employee.getFirstName() + " " + employee.getLastName();
			
			employees.put(employee.getEmpId(), fullName);
			
		}
		
		return employees;
	}
	
	@Override
	public Employee getEmployees(Integer employeeId) {

		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Employee.class, employeeId);
	}

	@Override
	public HashMap<Integer, String> getLocations() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Location> query = session.createQuery("from Location", Location.class);
		
		List<Location> locationList = query.getResultList();
		
		HashMap<Integer, String> locations = new HashMap<Integer, String>();
		
		for (Location location : locationList) {
			
			locations.put(location.getLocationId(), location.getCity());
			
		}
		return locations;

	}

	@Override
	public Location getLocations(Integer locationId) {

		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Location.class, locationId);
	}

	@Override
	public void deleteDepartment(Integer departmentId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Department where depId = :param_id");
		
		query.setParameter("param_id", departmentId);
		
		int rowsDeleted = query.executeUpdate();
		System.out.println(rowsDeleted + " rows deleted.");
		
	}

	@Override
	public void updateDepartment(Department department) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.update(department);

	}

	@Override
	public List<Department> searchDepartment(String searchName, Integer employeeId, Integer locationId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Department> query;
		
		String searchCriteria = "1=1";
		
		if (searchName != null && searchName.trim().length() > 0) {
			searchCriteria += " and lower(depName) like " + "'%" + searchName.toLowerCase() + "%'";
		}
		
		if (employeeId != 0) {
			searchCriteria += " and manager=" + employeeId;
		}
		
		if (locationId != 0) {
			searchCriteria += " and location=" + locationId;
		}
		
		query = session.createQuery("from Department where " + searchCriteria, Department.class);
		
		List<Department> departments = query.getResultList();
		
		return departments;
	}


	@Override
	public void updateNewDepartment(Integer depId, String depName, Integer empId, Integer locationId) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query q = session.createQuery("update Department set depName = :param_name, "
				+ "manager = :param_employee, "
				+ "location = :param_location "
				+ "where depId = :param_id");
		
		q.setParameter("param_id", depId);
		q.setParameter("param_name", depName);
		q.setParameter("param_employee", empId);
		q.setParameter("param_location", locationId);
		
		int rowsUpdated = q.executeUpdate();
		System.out.println(rowsUpdated + " updated");
		
	}

	@Override
	public Department getActiveDepartment(String value) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Department department;

		try {
			department = session.createQuery("from Department d where d.depName = :depname", Department.class)
					.setParameter("depname", value)
					.getSingleResult();
		} catch (NoResultException e) {
			department = null;
		}
		
		return department;
		
	}
	
	
//
}
