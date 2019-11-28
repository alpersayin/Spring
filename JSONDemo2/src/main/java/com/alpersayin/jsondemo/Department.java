package com.alpersayin.jsondemo;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Department {
	
	private int id;
	private String departmentName;
	private String managerName;
	private boolean active;
	private ContactAddress contactAddress;
	private String[] locations;

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
	public ContactAddress getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(ContactAddress contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String[] getLocations() {
		return locations;
	}
	public void setLocations(String[] locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + ", managerName=" + managerName
				+ ", active=" + active + ", contactAddress=" + contactAddress + ", locations="
				+ Arrays.toString(locations) + "]";
	}
	
//	
}
