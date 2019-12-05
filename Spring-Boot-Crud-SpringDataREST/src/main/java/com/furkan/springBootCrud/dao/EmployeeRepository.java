package com.furkan.springBootCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.furkan.springBootCrud.entity.Employee;

// EmployeeRepository adında bir interface oluşturuyorum.JpaRepositroyden

@RepositoryRestResource(path="calisanlar")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { // Entitymizin tipi Employee,Id mizin tipi(primary key) Integer.

}
