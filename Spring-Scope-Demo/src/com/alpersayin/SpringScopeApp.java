package com.alpersayin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringScopeApp {

	public static void main(String[] args) {
		
		// 1. Bean configuration
		
		// 2. Create container (during opening)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		System.out.println("App context read..");
		// 3. Get beans from container
		Ogretmen filozof1 = context.getBean("felsefeci", Ogretmen.class);
		/*
		Ogretmen filozof2 = context.getBean("felsefeci", Ogretmen.class);
		
		System.out.println();
		
		// 4. Call bean methods
		
		boolean control = (filozof1 == filozof2);
		
		if (control) {
			System.out.println("beanlar ayný");
		} else System.out.println("beanler farklý");
		
		System.out.println(filozof1);
		System.out.println();
		System.out.println(filozof1.dersAl());
		System.out.println(filozof1.akilAl());
		*/
		// 5. Close container (during closing)
		((FelsefeOgretmeni)filozof1).shutdown();
		context.close();
		
	}

}
