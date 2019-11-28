package com.hr.entity;

public class Department {

	private int depId;
	
	private String depName;

	private Employee manager;
	
	private Location location;
	
	public Department() {
		super();
	}
	
	public int getDepId() {
		return depId;
	}
	
	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + "]";
	}	
	
//	
}
