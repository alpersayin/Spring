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
@Table(name = "DERS")
public class Ders {
	
	@Id
	@SequenceGenerator(name = "mySeqDers", sequenceName = "SEQ_DERS", allocationSize = 1)
	@GeneratedValue(generator = "mySeqDers", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "ADI")
	private String adi;
	
	@ManyToOne
	@JoinColumn(name = "OGRETMEN_ID")
	private Ogretmen ogretmen;
	
	public Ders() {
		super();
	}
	public Ders(String adi) {
		super();
		this.adi = adi;
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
	public Ogretmen getOgretmen() {
		return ogretmen;
	}
	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}
	@Override
	public String toString() {
		return "Ders [id=" + id + ", adi=" + adi + "]";
	} 
	
//
}
