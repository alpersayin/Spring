package com.bilgeadam.springrestdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // springden ald�k.

import com.bilgeadam.springrestdemo.dao.DepartmentDAO;
import com.bilgeadam.springrestdemo.entity.Department;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;

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
	public Department getDepartment(int departmentId) {		
		return departmentDAO.getDepartment(departmentId);
	}

	@Override
	@Transactional
	public List<Department> searchDepartments(String searchName) {
		return departmentDAO.searchDepartments(searchName);
	}

	@Override
	@Transactional
	public void deleteDepartment(int departmentId) {
		departmentDAO.deleteDepartment(departmentId);		
	}

}
