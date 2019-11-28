package com.alpersayin.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PersonelDAO {
	
	public void addPersonel() {
		
		//  System.out.println("Personel ekleme iþlemi baþlýyor");
		
		// business....
		System.out.println("PersonelDAO, Adding a personel....");

		
	}

	
	public void addZimmet() {
		
		// business....
		System.out.println("Adding a zimmet to personel....");
		
	}

	public int removeZimmet() {
		
		// business....
		System.out.println("Removing zimmet from personel....");
		return 1;
	}
	
//	
}
