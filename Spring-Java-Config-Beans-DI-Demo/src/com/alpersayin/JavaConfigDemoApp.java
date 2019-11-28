package com.alpersayin;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OgretmenConfig.class);
		
		Ogretmen javaci = context.getBean("javaHocasi", Ogretmen.class);
		
		System.out.println(javaci.dersAl());
		System.out.println(javaci.akilAl());
		
		System.out.println("---------");
		
		Ogretmen jimnastikci = context.getBean("jimnastikHocasi", Ogretmen.class);
		System.out.println(jimnastikci.dersAl());
		System.out.println(jimnastikci.akilAl());
		
		context.close();
		
	}
//
}
