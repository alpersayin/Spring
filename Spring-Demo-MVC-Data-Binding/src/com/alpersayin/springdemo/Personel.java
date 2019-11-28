package com.alpersayin.springdemo;

import java.util.LinkedHashMap;

public class Personel {
	
	private String firstName;
	private String lastName;
	private Integer salary;
	private String department;
	private String socialSecurityType;
	LinkedHashMap<String,String> departments;
	
	private String[] sideBenefits;	

	public String[] getSideBenefits() {
		return sideBenefits;
	}

	public void setSideBenefits(String[] sideBenefits) {
		this.sideBenefits = sideBenefits;
	}

	public String getSocialSecurityType() {
		return socialSecurityType;
	}
	
	public void setSocialSecurityType(String socialSecurityType) {
		this.socialSecurityType = socialSecurityType;
	}

	public LinkedHashMap<String, String> getDepartments() {
		return departments;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
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
	
	public Integer getSalary() {
		return salary;
	}
	
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public Personel() {
		departments = new LinkedHashMap<String, String>();
		departments.put("HR", "Human Resources");
		departments.put("AC", "Accounting");
		departments.put("SA", "Sales");
		departments.put("SW", "Software");
	}
	
	
}
