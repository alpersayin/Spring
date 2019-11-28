package com.alpersayin.hibernate.entity;

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
@Table(name = "DEMIRBAS")
public class Demirbas {
	
	@Id
	@SequenceGenerator(name = "mySeqDemirbas", sequenceName = "SEQ_DEMIRBAS", allocationSize = 1)
	@GeneratedValue(generator = "mySeqDemirbas", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "ADI")
	private String adi;
	
	@Column(name = "TURU")
	private String turu;
	
	@ManyToOne
	@JoinColumn(name = "PERSON_ID")
	private Person person;
	
	public Demirbas() {
		super();
	}
	
	public Demirbas(String adi, String turu) {
		super();
		this.adi = adi;
		this.turu = turu;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getTuru() {
		return turu;
	}

	public void setTuru(String turu) {
		this.turu = turu;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "ADI=" + adi + ", TIPI=" + turu;
	}
	
	
//
}
