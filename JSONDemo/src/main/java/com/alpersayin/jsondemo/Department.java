package com.alpersayin.jsondemo;

public class Department {
	
	private int id;
	private String departmentName;
	private String managerName;
	private boolean active;

	public Department() {
		super();
	}
	
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", managerName=" + managerName
				+ ", active=" + active + "]";
	}
		
//	
}
