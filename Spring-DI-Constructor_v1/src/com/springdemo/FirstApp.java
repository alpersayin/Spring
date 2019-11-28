package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstApp {

	public static void main(String[] args) {
		
		//config dosyasýný yükleyerek App Context i baþlat
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		//Spring container'dan bean al
		
		Ogretmen turkceHocasi = context.getBean("turkceci", TurkceOgretmeni.class);
		
		//DanismanHizmeti dh = new DanismanHizmeti();
		//Ogretmen turkceHocasi = new TurkceOgretmeni(dh);
		
		//Bean'deki metodu kullan
		System.out.println(turkceHocasi.dersAl());
		System.out.println(turkceHocasi.ogutAl());
		
		//Context'i kapat
		context.close();
		
	//
	}
//
}
