package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Ders;
import com.alpersayin.hibernate.entity.Ogrenci;
import com.alpersayin.hibernate.entity.Ogretmen;
import com.alpersayin.hibernate.entity.OgretmenDetay;

public class CreateDersApp {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ders.class)
				.addAnnotatedClass(Ogrenci.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Ders ders1 = new Ders("How to become a great java developer in 24 minutes");
		session.save(ders1);
		
		Ogrenci ogrenci1 = new Ogrenci("Furkan", "Karagoz", 111, "Adres Gizli", "furkan@mail", 0544123l, 10101010l);
		Ogrenci ogrenci2 = new Ogrenci("Serkut", "Akgul", 112, "Adres Gizli", "serkut@mail", 0544111l, 10101111l);
		Ogrenci ogrenci3 = new Ogrenci("Ozan", "koc", 113, "Adres Gizli", "ozan@mail", 0533112l, 11111111l);
		
		ders1.addOgrenci(ogrenci1);
		ders1.addOgrenci(ogrenci2);
		ders1.addOgrenci(ogrenci3);
		
		session.save(ogrenci1);
		session.save(ogrenci2);
		session.save(ogrenci3);
		
		session.save(ders1);
		
		session.getTransaction().commit();	
		
	//
	}
//
}
;