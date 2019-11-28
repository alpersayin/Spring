package com.alpersayin;

import org.springframework.beans.factory.annotation.Value;

public class JimnastikOgretmeni implements Ogretmen {
	
	DanismanlikHizmeti danismanlikhizmeti;
	
	@Value("${jimnastikci.email}")
	String email;
	@Value("${jimnastikci.telefon}")
	String telefon;
	
	public JimnastikOgretmeni(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Constructor, Jimnastik Ogretmeni, Danismanlik");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}

	@Override
	public String dersAl() {
		return "Biraz esneyelim " + email + " " + telefon;
	}

	@Override
	public String akilAl() {
		return danismanlikhizmeti.ogutAl();
	}

}
