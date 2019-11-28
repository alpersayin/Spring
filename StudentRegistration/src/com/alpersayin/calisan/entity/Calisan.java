package com.alpersayin.calisan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CALISANLAR")
public class Calisan {
	
	@Id
	@SequenceGenerator(name = "calisan-numarator", sequenceName = "SEQ_CALISAN", allocationSize = 1)
	@GeneratedValue(generator = "calisan-numarator", strategy = GenerationType.SEQUENCE)
	@Column(name = "CALISAN_ID")
	private int id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "CITY")
	private String city;
	
	public Calisan() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Calisan [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	
//	
}
