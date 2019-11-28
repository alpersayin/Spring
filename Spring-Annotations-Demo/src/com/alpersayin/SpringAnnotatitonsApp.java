package com.alpersayin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotatitonsApp {

	public static void main(String[] args) {
		
		// 1. Enable component scan
		// 2. Bean olarak containerde oluþturulacak sýnýflar @Component ile iþaretlenir.
		// OK
		
		// 3. Create container (during opening)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		System.out.println("App context read..");
		
		// 4. Get beans from container
		Ogretmen matci = context.getBean("matci", Ogretmen.class);
		//Ogretmen filozof = context.getBean("felsefeci", Ogretmen.class);
		Ogretmen filozof1 = context.getBean("felsefeOgretmeni", Ogretmen.class); 
	
		// 5. Call bean methods
		System.out.println(filozof1.dersAl());
		System.out.println(filozof1.akilAl());
	
		// 6. Close container (during closing)
		context.close();
		
	}

}
