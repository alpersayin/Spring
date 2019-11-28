package com.alpersayin.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OGRENCI")
public class Student {
	
	@Id
	@SequenceGenerator(name = "student-numarator", sequenceName = "SEQ_OGRENCI", allocationSize = 1)
	@GeneratedValue(generator = "student-numarator", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "ADI")
	private String firstName;
	
	@Column(name = "SOYADI")
	private String lastName;
	
	@Column(name = "OGRENCI_NO")
	private Long studentNo;
	
	@Column(name = "ADRES")
	private String address;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "TELEFON")
	private String phone;
	
	@Column(name = "TCKIMLIKNO")
	private Long tcIdentityNo;

	public Student() {
		
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

	public Long getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getTcIdentityNo() {
		return tcIdentityNo;
	}

	public void setTcIdentityNo(Long tcIdentityNo) {
		this.tcIdentityNo = tcIdentityNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", studentNo=" + studentNo
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + ", tcIdentityNo=" + tcIdentityNo
				+ "]";
	}
	
//
}
