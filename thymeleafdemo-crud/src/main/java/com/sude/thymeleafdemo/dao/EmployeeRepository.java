package com.sude.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sude.thymeleafdemo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {	
	

}
