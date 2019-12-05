package com.furkan.springBootCrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="region_id_gen")
	@SequenceGenerator(name="region_id_gen",sequenceName="REGIONS_SEQ",allocationSize = 1)
	@Column(name="region_id")
	private Integer regionId;
	
	
	@Column(name="region_name")
	private String regionName;


	public Integer getRegionId() {
		return regionId;
	}


	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}


	public String getRegionName() {
		return regionName;
	}


	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


	public Region() {
		
	}
	
	public Region(Integer regionId, String regionName) {
		this.regionId = regionId;
		this.regionName = regionName;
	}


	@Override
	public String toString() {
		return "Region [regionId=" + regionId + ", regionName=" + regionName + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
