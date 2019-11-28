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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OGRENCI")
public class Ogrenci {
	
	@Id
	@SequenceGenerator(name = "mySeqOgrenci", sequenceName = "SEQ_OGRENCI", allocationSize = 1)
	@GeneratedValue(generator = "mySeqOgrenci", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "ADI")
	private String adi;
	
	@Column(name = "SOYADI")
	private String soyadi;
	
	@Column(name = "OGRENCI_NO")
	private Integer ogrenciNo;
	
	@Column(name = "ADRES")
	private String adres;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "TELEFON")
	private Long telefonNo;
	
	@Column(name = "TCKIMLIKNO")
	private Long tcKimlikNo;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinTable(	name = "DERS_OGRENCI",
				joinColumns = @JoinColumn(name = "OGRENCI_ID"), 
				inverseJoinColumns = @JoinColumn(name = "DERS_ID"))
	private List<Ders> dersler;
	
	public void addDers(Ders ders) {
		if (dersler == null) {
			dersler = new ArrayList<Ders>();
		}
		dersler.add(ders);
	}

	public Ogrenci() {
		super();
	}

	public Ogrenci(String adi, String soyadi, Integer ogrenciNo, String adres, String email, Long telefonNo,
			Long tcKimlikNo) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.ogrenciNo = ogrenciNo;
		this.adres = adres;
		this.email = email;
		this.telefonNo = telefonNo;
		this.tcKimlikNo = tcKimlikNo;
	}
	
	public List<Ders> getDersler() {
		return dersler;
	}

	public void setDersler(List<Ders> dersler) {
		this.dersler = dersler;
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

	public Integer getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(Integer ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(Long telefonNo) {
		this.telefonNo = telefonNo;
	}

	public Long getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(Long tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", ogrenciNo=" + ogrenciNo + ", adres="
				+ adres + ", email=" + email + ", telefonNo=" + telefonNo + ", tcKimlikNo=" + tcKimlikNo + "]";
	}
	
//
}
