package com.springdemo;

public class FirstApp {

	public static void main(String[] args) {
		
		Ogretmen turkceci = new TurkceOgretmeni();
		System.out.println(turkceci.dersAl());
		
		Ogretmen matci = new MatematikOgretmeni();
		System.out.println(matci.dersAl());
		
	//
	}
//
}
