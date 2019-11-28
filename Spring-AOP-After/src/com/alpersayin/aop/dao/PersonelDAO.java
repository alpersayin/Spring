package com.alpersayin.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PersonelDAO {
	
	public void addPersonel() {
		
		//  System.out.println("Personel ekleme i�lemi ba�l�yor");
		
		// business....
		System.out.println("PersonelDAO, Adding a personel....");
		
	}

	
	public void addZimmet(int i, String string) {
		
		// business....
		System.out.println("Adding a zimmet to personel.... " + i + " adet " + string + " zimmetlendi.");
		
	}

	public int removeZimmet() {
		
		// business....
		System.out.println("PersonelDAO, removeZimemt, Hata geliyor..");
		throw new RuntimeException("hatas�z kul olmaz");

	}
	
//	
}
