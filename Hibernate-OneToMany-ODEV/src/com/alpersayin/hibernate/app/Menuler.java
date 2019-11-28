package com.alpersayin.hibernate.app;

public class Menuler {
	
	public void mainMenu() {
		
		System.out.println("\nANA MENU");
		System.out.println("(1) Personel Islemleri");
		System.out.println("(2) Zimmet Islemleri");
		System.out.println("(3) Isten Ayrilma Islemleri");
		System.out.println("(4) Personel Kimlik Karti Yaz");
		System.out.println("(-1) Cikis");
		System.out.print("Seciminiz: ");

	}
	
	public void personMenu() {
		
		System.out.println("\nPersonel Islemleri");
		System.out.println("(1) Personel Ekleme"); // +
		System.out.println("(2) Personel Silme"); // +
		System.out.println("(3) Personel Listeleme");
		System.out.println("(4) Ana Menu"); // +
		System.out.print("Seciminiz: ");
		
	}
	
	public void zimmetMenu() {
		
		System.out.println("\nZimmet Islemleri");
		System.out.println("(1) Zimmet Ekleme"); 
		System.out.println("(2) Zimmet Silme");
		System.out.println("(3) Personele Zimmetle");
		System.out.println("(4) Tum Zimmetleri Iade et");
		System.out.println("(5) Zimmet Listeleme");
		System.out.println("(6) Ana Menu");
		System.out.print("Seciminiz: ");
		
	}
	
//	
}
