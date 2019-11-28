package com.alpersayin;

public class FelsefeOgretmeni implements Ogretmen {
	
	public FelsefeOgretmeni() {
		System.out.println("Constructor, Felsefe Ogretmeni...");
	}
	
	@Override
	public String dersAl() {
		return "Felsefem yok";
	}



}
