package com.alpersayin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MatematikOgretmeni implements Ogretmen {
	
	@Autowired
	DanismanlikHizmeti danismanlikhizmeti;
	
	@Value("${matci.email}")
	String email;
	@Value("${matci.telefon}")
	String telefon;
	String name;
	
	public MatematikOgretmeni() {
		System.out.println("Constructor, Matematik Ogretmeni...");
	}
	
	//@Autowired
	public MatematikOgretmeni(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Constructur, Matematik Öðretmeni, Danismanlik");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	/*
	public DanismanlikHizmeti getDanismanlikhizmeti() {
		return danismanlikhizmeti;
	}
	
	@Autowired
	public void setDanismanlikhizmeti(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Setter, Matematik Öðretmeni, Danismanlik");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}
	*/
	@Override
	public String dersAl() {
		return "Sað baþtan say.. " + email + " " + telefon;
	}

	@Override
	public String akilAl() {
		// TODO Auto-generated method stub
		return danismanlikhizmeti.ogutAl();
	}

	@Override
	public String koclukAl() {
		// TODO Auto-generated method stub
		return null;
	}


	
//
}
