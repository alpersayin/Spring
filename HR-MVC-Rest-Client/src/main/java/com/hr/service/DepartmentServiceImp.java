package com.hr.service;

import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.dao.DepartmentDAO;
import com.hr.entity.Department;
import com.hr.entity.Employee;
import com.hr.entity.Location;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	DepartmentDAO departmentDAO;
	
	@Override
	@Transactional
	public List<Department> getDepartments() {
		return departmentDAO.getDepartments();
	}

	@Override
	@Transactional
	public void saveDepartment(Department department) {
		departmentDAO.saveDepartment(department);
	}

	@Override
	@Transactional
	public HashMap<Integer, String> getEmployees() {
		return departmentDAO.getEmployees();
	}

	@Override
	@Transactional
	public HashMap<Integer, String> getLocations() {
		return departmentDAO.getLocations();
	}

	@Override
	@Transactional
	public Employee getEmployees(Integer employeeId) {
		return departmentDAO.getEmployees(employeeId);
	}

	@Override
	@Transactional
	public Location getLocations(Integer locationId) {
		return departmentDAO.getLocations(locationId);
	}

	@Override
	@Transactional
	public Department getDepartments(Integer departmentId) {
		return departmentDAO.getDepartments(departmentId);
	}

	@Override
	@Transactional
	public void deleteDepartment(Integer departmentId) {
		departmentDAO.deleteDepartment(departmentId);
	}

	@Override
	@Transactional
	public void updateDepartment(Department department) {
		departmentDAO.updateDepartment(department);
	}
	
	@Override
	@Transactional
	public List<Department> searchDepartment(String searchName, Integer employeeId, Integer locationId) {
		return departmentDAO.searchDepartment(searchName, employeeId, locationId);
	}

//
}
