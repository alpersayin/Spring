package com.alpersayin.springBootCrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	
	@Id
	@GeneratedValue(generator = "emp_numarator", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "emp_numarator", sequenceName = "EMPLOYEES_SEQ", allocationSize = 1)
	@Column(name = "EMPLOYEE_ID")
	private Integer id;
	
	@Column(name = "LAST_NAME")
	private String firstName;
	
	@Column(name = "FIRST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
//
}
