package com.alpersayin;

public class MatematikOgretmeni implements Ogretmen {
	
	DanismanlikHizmeti danismanlikhizmeti;
	
	String email;
	String name;
	String telefon;
	
	public MatematikOgretmeni() {
		System.out.println("Constructor, Matematik Ogretmeni...");
	}
	
	public MatematikOgretmeni(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Constructur, Matematik ��retmeni, Danismanlik");
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

	public DanismanlikHizmeti getDanismanlikhizmeti() {
		return danismanlikhizmeti;
	}

	public void setDanismanlikhizmeti(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Setter, Matematik ��retmeni, Danismanlik");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}

	@Override
	public String dersAl() {
		return "Sa� ba�tan say.. " + email + " " + telefon;
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
