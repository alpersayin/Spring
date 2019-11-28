package com.hr.service;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.Department;
import com.hr.entity.Employee;
import com.hr.entity.Location;

public interface DepartmentService {
	
	public List<Department> getDepartments();

	public void saveDepartment(Department department);

	public HashMap<Integer, String> getEmployees();

	public HashMap<Integer, String> getLocations();

	public Employee getEmployees(Integer employeeId);

	public Location getLocations(Integer locationId);

	public Department getDepartments(Integer departmentId);

	public void deleteDepartment(Integer departmentId);

	public void updateDepartment(Department department);

	public List<Department> searchDepartment(String searchName, Integer employeeId, Integer locationId);

	public void updateNewDepartment(Integer depId, String depName, Integer empId, Integer locationId);

	public boolean isDepNameAlreadyInUse(String value);
	
}
