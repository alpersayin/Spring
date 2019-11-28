package com.alpersayin.hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
	
	@Id
	@SequenceGenerator(name = "mySeqPerson", sequenceName = "SEQ_PERSON", allocationSize = 1)
	@GeneratedValue(generator = "mySeqPerson", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "TELEPHONE")
	private String telNo;
	
	@Column(name = "EMAIL")
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "person", cascade = CascadeType.ALL)
	private List<Demirbas> demirbaslar;
	
	public void addDemirbas(Demirbas demirbas) {
		if (demirbaslar == null) {
			demirbaslar= new ArrayList<Demirbas>();
		}
		demirbaslar.add(demirbas);
		demirbas.setPerson(this);
	}
	
	public Person() {
		super();
		System.out.println("Constructor, Person, No Args");
	}
	
	public Person(String firstName, String lastName, String telNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.telNo = telNo;
		this.email = email;
	}
	
	public List<Demirbas> getDemirbaslar() {
		return demirbaslar;
	}

	public void setDemirbaslar(List<Demirbas> demirbaslar) {
		this.demirbaslar = demirbaslar;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", telNo=" + telNo
				+ ", email=" + email + ", address=" + address + "]";
	}
	
	
//
}
