package com.alpersayin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FelsefeOgretmeni implements Ogretmen {
	
	DanismanlikHizmeti danismanlikhizmeti;
	
	@Value("${filozof.email}")
	String email;
	@Value("${filozof.telefon}")
	String telefon;
	
	public FelsefeOgretmeni() {
		System.out.println("Constructor, Felsefe Ogretmeni...");
	}
	
	public FelsefeOgretmeni(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Constructur, Felsefe Öðretmeni, Danismanlýk");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}
	
	public DanismanlikHizmeti getDanismanlikhizmeti() {
		return danismanlikhizmeti;
	}

	public void setDanismanlikhizmeti(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Setter, Felsefe Öðretmeni, Danismanlik");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}
	
	public void startup() {
		System.out.println("Init..Baþlýyor...");
	}
	
	public void shutdown() {
		System.out.println("Destroy..Bye.....");
	}
	
	@Override
	public String dersAl() {
		return "Felsefem yok";
	}

	@Override
	public String akilAl() {
		// TODO Auto-generated method stub
		return "Akýl fikir..." + email + " " + telefon;
	}

	@Override
	public String koclukAl() {
		// TODO Auto-generated method stub
		return danismanlikhizmeti.koclukAl();
	}

}
