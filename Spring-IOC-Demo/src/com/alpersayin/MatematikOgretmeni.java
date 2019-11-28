package com.alpersayin;

public class MatematikOgretmeni implements Ogretmen {
	
	public MatematikOgretmeni() {
		System.out.println("Constructor, Matematik Ogretmeni...");
	}
	
	@Override
	public String dersAl() {
		return "Sað baþtan say";
	}
	
//
}
