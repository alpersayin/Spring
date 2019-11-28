package com.hr.entity;

import java.util.List;

public class Location {

	private Integer locationId;
	
	private String city;
	
	private List<Department> departments;
	
	public Location() {
		super();
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return city;
	}

//	
}
