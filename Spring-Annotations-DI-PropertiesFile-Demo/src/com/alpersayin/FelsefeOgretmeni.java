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
		System.out.println("Constructur, Felsefe ��retmeni, Danismanl�k");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}
	
	public DanismanlikHizmeti getDanismanlikhizmeti() {
		return danismanlikhizmeti;
	}

	public void setDanismanlikhizmeti(DanismanlikHizmeti danismanlikhizmeti) {
		System.out.println("Setter, Felsefe ��retmeni, Danismanlik");
		this.danismanlikhizmeti = danismanlikhizmeti;
	}
	
	public void startup() {
		System.out.println("Init..Ba�l�yor...");
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
		return "Ak�l fikir..." + email + " " + telefon;
	}

	@Override
	public String koclukAl() {
		// TODO Auto-generated method stub
		return danismanlikhizmeti.koclukAl();
	}

}
