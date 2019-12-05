package com.furkan.springBootCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furkan.springBootCrud.entity.Employee;

// EmployeeRepository adında bir interface oluşturuyorum.JpaRepositroyden

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { // Entitymizin tipi Employee,Id mizin tipi(primary key) Integer.

}
