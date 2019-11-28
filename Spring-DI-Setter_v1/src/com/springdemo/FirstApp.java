package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstApp {

	public static void main(String[] args) {
		
		//config dosyasýný yükleyerek App Context i baþlat
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		//Spring container'dan bean al
		Ogretmen javalog = context.getBean("javaci", Ogretmen.class);

		/*
		JavaOgretmeni javalog = new JavaOgretmeni();
		DanismanHizmeti dh = new DanismanHizmeti();
		javalog.setDanismanHizmeti(dh);
		*/
		
		//Bean'deki metodu kullan
		System.out.println(javalog.dersAl());
		System.out.println(javalog.ogutAl());
		
		//Context'i kapat
		context.close();
		
	//
	}
//
}
