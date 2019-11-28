package com.alpersayin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OgretmenConfig.class);
		
		Ogretmen javaci = context.getBean("javaHocasi", Ogretmen.class);
		System.out.println(javaci.dersAl());
		System.out.println(javaci.akilAl());
		
		context.close();
		
	}
//
}
