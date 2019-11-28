package com.alpersayin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOCApp {

	public static void main(String[] args) {
		
		// 1. Bean configuration
		
		// 2. Create container (during opening)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		// 3. Get beans from container
		Ogretmen matOgretmen = context.getBean("matci", Ogretmen.class);
		Ogretmen felsefeOgretmen = context.getBean("felsefeci", Ogretmen.class);
		
		// 4. Call bean methods
		System.out.println(matOgretmen.dersAl());
		System.out.println(felsefeOgretmen.dersAl());
		
		// 5. Close container (during closing)
		context.close();
		
	}

}
