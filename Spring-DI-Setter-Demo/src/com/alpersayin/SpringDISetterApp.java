package com.alpersayin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDISetterApp {

	public static void main(String[] args) {
		
		// 1. Bean configuration
		
		// 2. Create container (during opening)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		// 3. Get beans from container
		Ogretmen ogretmen = context.getBean("matci", Ogretmen.class);
		Ogretmen filozof = context.getBean("felsefeci", Ogretmen.class);
		
		System.out.println();
		
		// 4. Call bean methods
		
		System.out.println(ogretmen.dersAl());
		System.out.println(ogretmen.akilAl());
		System.out.println();
		

		System.out.println(filozof.dersAl());
		System.out.println(filozof.akilAl());
		
		// 5. Close container (during closing)
		context.close();
		
	}

}
