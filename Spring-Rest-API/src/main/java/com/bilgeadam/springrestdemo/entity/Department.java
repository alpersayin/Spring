package com.bilgeadam.springrestdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Departments")
public class Department {
	
	@Id
	@Column(name="department_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="deparment-numarator")
	@SequenceGenerator(name="deparment-numarator",sequenceName="DEPARTMENTS_SEQ",allocationSize=10)
	private int id;
	
	@Column(name="department_name")
	private String departmentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return departmentName;
	}

	public void setDeptName(String deptName) {
		this.departmentName = deptName;
	}

	public Department(int id, String deptName) {
		super();
		this.id = id;
		this.departmentName = deptName;
	}
	
	public Department() {
	}
	
	
	
	

}
