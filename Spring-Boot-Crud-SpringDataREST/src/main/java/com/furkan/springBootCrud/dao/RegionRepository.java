package com.furkan.springBootCrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.furkan.springBootCrud.entity.Region;

// EmployeeRepository adında bir interface oluşturuyorum.JpaRepositroyden

public interface RegionRepository extends JpaRepository<Region, Integer> { 

}
