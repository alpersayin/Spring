package com.hr.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "LOCATIONS")
public class Location {
	
	@Id
	@SequenceGenerator(name = "location-numarator", sequenceName = "LOCATIONS_SEQ", allocationSize = 100)
	@GeneratedValue(generator = "location-numarator", strategy = GenerationType.SEQUENCE)
	@Column(name = "LOCATION_ID")
	private Integer locationId;
	
	@Column(name = "CITY")
	private String city;
	
	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
	@JsonBackReference
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
