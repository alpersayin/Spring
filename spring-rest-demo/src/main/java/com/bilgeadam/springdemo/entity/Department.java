package com.bilgeadam.springdemo.entity;

public class Department {

	private int id;
	private String departmentName;
	private String managerName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Department(int id, String departmentName, String managerName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.managerName = managerName;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", managerName=" + managerName + "]";
	}
	
	
}
