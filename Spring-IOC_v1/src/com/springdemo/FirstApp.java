package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstApp {

	public static void main(String[] args) {
		
		//config dosyasýný yükleyerek App Context i baþlat
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		//Spring container'dan bean al
		Ogretmen turkceHocasi = context.getBean("turkceci", Ogretmen.class);
		Ogretmen fenHocasi = context.getBean("fenci", Ogretmen.class);
		
		//Bean'deki metodu kullan
		System.out.println(turkceHocasi.dersAl());
		System.out.println(fenHocasi.dersAl());
		
		//Context'i kapat
		context.close();
		
	//
	}
//
}
