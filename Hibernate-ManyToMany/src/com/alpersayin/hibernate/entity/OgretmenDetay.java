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
@Table(name = "OGRETMEN_DETAY")
public class OgretmenDetay {
	
	@Id
	@SequenceGenerator(name = "mySeqOgretmenDetay", sequenceName = "SEQ_OGRETMEN_DETAY", allocationSize = 1)
	@GeneratedValue(generator = "mySeqOgretmenDetay", strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Integer id;
	
	@OneToOne(mappedBy = "ogretmenDetay", 
			cascade = {	CascadeType.DETACH,
						CascadeType.MERGE,
						CascadeType.PERSIST, 
						CascadeType.REFRESH })
	private Ogretmen ogretmen;
	
	@Column(name = "uzmanlik")
	private String uzmanlik;
	
	@Column(name = "hobileri")
	private String hobileri;
	
	@Column(name = "web_sitesi")
	private String webSitesi;
	
	@Column(name = "fb_sayfasi")
	private String fbSayfasi;
	
	public OgretmenDetay() {
		super();
	}

	public OgretmenDetay(String uzmanlik, String hobileri, String webSitesi, String fbSayfasi) {
		super();
		this.uzmanlik = uzmanlik;
		this.hobileri = hobileri;
		this.webSitesi = webSitesi;
		this.fbSayfasi = fbSayfasi;
	}
	
	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUzmanlik() {
		return uzmanlik;
	}

	public void setUzmanlik(String uzmanlik) {
		this.uzmanlik = uzmanlik;
	}

	public String getHobileri() {
		return hobileri;
	}

	public void setHobileri(String hobileri) {
		this.hobileri = hobileri;
	}

	public String getWebSitesi() {
		return webSitesi;
	}

	public void setWebSitesi(String webSitesi) {
		this.webSitesi = webSitesi;
	}

	public String getFbSayfasi() {
		return fbSayfasi;
	}

	public void setFbSayfasi(String fbSayfasi) {
		this.fbSayfasi = fbSayfasi;
	}

	@Override
	public String toString() {
		return "OgretmenDetay [id=" + id + ", uzmanlik=" + uzmanlik + ", hobileri=" + hobileri + ", webSitesi="
				+ webSitesi + ", fbSayfasi=" + fbSayfasi + "]";
	}	
	
//	
}
