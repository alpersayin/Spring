package com.alpersayin.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	
	@Id
	@SequenceGenerator(name = "mySeqAddress", sequenceName = "SEQ_ADDRESS", allocationSize = 1)
	@GeneratedValue(generator = "mySeqAddress", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "STREET")
	private String street;
	
	@Column(name = "DISTRICT")
	private String district;
	
	@Column(name = "CITY")
	private String city;
	
	@OneToOne(mappedBy = "address", 
			cascade = {	CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST, 
			CascadeType.REFRESH })
	private Person person;
	
	public Address() {
		super();
	}
	
	public Address(String street, String district, String city) {
		super();
		this.street = street;
		this.district = district;
		this.city = city;
	}
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return street.substring(0, 1).toUpperCase() + street.substring(1) + " Mah., " 
				+ district.toUpperCase() + ", " 
				+ city.toUpperCase();
	}
	

//
}
