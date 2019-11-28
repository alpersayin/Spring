package com.alpersayin.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "calisanlar")
public class Calisan {
	
	@Id
	@SequenceGenerator(name = "mySeq", sequenceName = "seq_calisan", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mySeq")
	@Column(name = "calisan_id")
	private int calisanID;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String city;
	
	public Calisan() {
		System.out.println("Constructor, no-args");
	}

	public Calisan(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCalisanID() {
		return calisanID;
	}
	public void setCalisanID(int calisanID) {
		this.calisanID = calisanID;
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
		System.out.println("Setter, lastName");
	}

	@Override
	public String toString() {
		return "Calisan [calisanID=" + calisanID + ", firstName=" + firstName + ", lastName=" + lastName + ", city="
				+ city + "]";
	}
	
	
//	
}
