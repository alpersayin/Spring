package com.alpersayin.maven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {
	
	@Id
	@SequenceGenerator(name = "department-numarator", sequenceName = "DEPARTMENTS_SEQ", allocationSize = 10)
	@GeneratedValue(generator = "department-numarator", strategy = GenerationType.SEQUENCE)
	@Column(name = "DEPARTMENT_ID")
	private Integer depId;
	
	@Column(name = "DEPARTMENT_NAME")
	private String depName;
	
	@Column(name = "LOCATION_ID")
	private Integer locationId;
	
	public Department() {
		super();
	}
	
	public Integer getDepId() {
		return depId;
	}
	
	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + "]";
	}	
	
//	
}
