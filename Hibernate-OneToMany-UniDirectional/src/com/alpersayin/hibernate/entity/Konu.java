package com.alpersayin.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "KONU")
public class Konu {
	
	@Id
	@SequenceGenerator(name = "mySeqKonu", sequenceName = "SEQ_KONU", allocationSize = 1)
	@GeneratedValue(generator = "mySeqKonu", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "KONU_BASLIGI")
	private String konuBasligi;
	
	@Column(name = "KONU_DETAYI")
	private String konuDetayi;

	public Konu() {
		super();
		System.out.println("Constructor, Konu, No Args");
	}

	public Konu(String konuBasligi, String konuDetayi) {
		super();
		this.konuBasligi = konuBasligi;
		this.konuDetayi = konuDetayi;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKonuBasligi() {
		return konuBasligi;
	}

	public void setKonuBasligi(String konuBasligi) {
		this.konuBasligi = konuBasligi;
	}

	public String getKonuDetayi() {
		return konuDetayi;
	}

	public void setKonuDetayi(String konuDetayi) {
		this.konuDetayi = konuDetayi;
	}
	
	@Override
	public String toString() {
		return "Konu [id=" + id + ", konuBasligi=" + konuBasligi + ", konuDetayi=" + konuDetayi + "]";
	}
	
	
//	
}
