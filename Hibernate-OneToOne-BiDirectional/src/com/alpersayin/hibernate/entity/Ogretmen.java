package com.alpersayin.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OGRETMEN")
public class Ogretmen {
	
	@Id
	@SequenceGenerator(name = "mySeqOgretmen", sequenceName = "SEQ_OGRETMEN", allocationSize = 1)
	@GeneratedValue(generator = "mySeqOgretmen", strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "adi")
	private String adi;
	
	@Column(name = "soyadi")
	private String soyadi;
	
	@Column(name = "eposta")
	private String eposta;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ogretmen_detay_id")
	private OgretmenDetay ogretmenDetay;
	
	public Ogretmen() {
		super();
	}
	
	public Ogretmen(String adi, String soyadi, String eposta) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.eposta = eposta;
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

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public OgretmenDetay getOgretmenDetay() {
		return ogretmenDetay;
	}

	public void setOgretmenDetay(OgretmenDetay ogretmenDetay) {
		this.ogretmenDetay = ogretmenDetay;
	}

	@Override
	public String toString() {
		return "Ogretmen [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", eposta=" + eposta + ", ogretmenDetayId="
				+ ogretmenDetay + "]";
	}

	
//
}
