package com.hr.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.hr.entity.Department;
import com.hr.entity.Employee;
import com.hr.entity.Location;

@Repository
public class DepartmentDAOImp implements DepartmentDAO {
	
	static final String departmentsURI = "http://localhost:8081/HR-MVC-Spring-Rest-API/api/departments";
	static final String employeesURI = "http://localhost:8081/HR-MVC-Spring-Rest-API/api/employees";
	static final String locationsURI = "http://localhost:8081/HR-MVC-Spring-Rest-API/api/locations";
	static RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Department getDepartments(Integer departmentId) {	
		return restTemplate.getForObject(departmentsURI + "/" + departmentId, Department.class);
	}
	
	@Override
	public List<Department> getDepartments() {	
		ResponseEntity<List<Department>> responseEntity = restTemplate.exchange(
				departmentsURI, HttpMethod.GET, null, new ParameterizedTypeReference<List<Department>>() {} );
		List<Department> departments = responseEntity.getBody();	
		return departments;
	}

	@Override
	public void saveDepartment(Department department) {	
		restTemplate.postForEntity(departmentsURI, department, Department.class);	
	}
	
	@Override
	public void updateDepartment(Department department) {		
		restTemplate.put(departmentsURI, department);
	}
	
	@Override
	public void deleteDepartment(Integer departmentId) {
		restTemplate.delete(departmentsURI + "/" + departmentId);
		System.out.println(departmentId + " silindi..");
	}

	@Override
	public Employee getEmployees(Integer employeeId) {
		return restTemplate.getForObject(employeesURI + "/" + employeeId, Employee.class);
	}
	
	@Override
	public LinkedHashMap<Integer, String> getEmployees() {
		ResponseEntity<LinkedHashMap<Integer, String>> responseEntity = restTemplate.exchange(
				employeesURI, HttpMethod.GET, null, new ParameterizedTypeReference<LinkedHashMap<Integer, String>>() {} );
		LinkedHashMap<Integer, String> employees = responseEntity.getBody();
		return employees;
	}

	@Override
	public Location getLocations(Integer locationId) {
		return restTemplate.getForObject(locationsURI + "/" + locationId, Location.class);
	}
	
	@Override
	public HashMap<Integer, String> getLocations() {	
		ResponseEntity<HashMap<Integer, String>> responseEntity = restTemplate.exchange(
				locationsURI, HttpMethod.GET, null, new ParameterizedTypeReference<HashMap<Integer, String>>() {} );
		HashMap<Integer, String> locations = responseEntity.getBody();
		return locations;
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

		
//
}
