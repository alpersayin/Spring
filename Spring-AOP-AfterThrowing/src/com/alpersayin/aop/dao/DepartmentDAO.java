package com.alpersayin.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {
	
	int departmanId;
	String departmanName;
	

	public int getDepartmanId() {
		return departmanId;
	}

	public void setDepartmanId(int departmanId) {
		this.departmanId = departmanId;
	}

	public String getDepartmanName() {
		return departmanName;
	}

	public void setDepartmanName(String departmanName) {
		this.departmanName = departmanName;
	}

	public void addPersonel(int personelId) {
		
		System.out.println("DepartmanDAO, add personel");

	}
	
	public void addPersonelDAO(PersonelDAO personelDAO) {
		
		System.out.println("DepartmanDAO, add personel ama daolu");

	}

	
}