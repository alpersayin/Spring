package com.hr.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MANAGER_ID")
	private Employee manager;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "LOCATION_ID")
	private Location location;
	
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
