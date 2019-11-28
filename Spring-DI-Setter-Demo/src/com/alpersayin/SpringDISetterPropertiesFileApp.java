package com.alpersayin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDISetterPropertiesFileApp {

	public static void main(String[] args) {
		
		// 1. Bean configuration
		
		// 2. Create container (during opening)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		// 3. Get beans from container
		Ogretmen matci1 = context.getBean("matciAlper", Ogretmen.class);
		Ogretmen matci2 = context.getBean("matciOmer", Ogretmen.class);
		
		System.out.println();
		
		// 4. Call bean methods
		
		System.out.println(matci1.dersAl());
		System.out.println(matci1.akilAl());
		System.out.println();
		System.out.println(matci2.dersAl());
		System.out.println(matci2.akilAl());
		
		// 5. Close container (during closing)
		context.close();
		
	}

}
