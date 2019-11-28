package com.alpersayin.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		System.out.println("App context read..");
		
		Araba mercedes = context.getBean("mercedes", Araba.class);
		System.out.println(mercedes.start());
		System.out.println(mercedes.stop());
		System.out.println(mercedes.hizlan());
		System.out.println(mercedes.yavasla());
		System.out.println("-------");
		Araba ford = context.getBean("fordcu", Araba.class);
		System.out.println(ford.start());
		System.out.println(ford.stop());
		System.out.println(ford.hizlan());
		System.out.println(ford.yavasla());
		
		context.close();
		
	}

}
