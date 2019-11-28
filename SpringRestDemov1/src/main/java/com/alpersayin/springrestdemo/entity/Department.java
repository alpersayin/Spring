package com.alpersayin.springrestdemo.entity;

public class Department {
	
	private int id;
	private String depName;
	private String managerName;
	
	public Department(int id, String depName, String managerName) {
		super();
		this.id = id;
		this.depName = depName;
		this.managerName = managerName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", depName=" + depName + ", managerName=" + managerName + "]";
	}

//	
}
