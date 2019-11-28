package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Ders;
import com.alpersayin.hibernate.entity.Ogrenci;
import com.alpersayin.hibernate.entity.Ogretmen;
import com.alpersayin.hibernate.entity.OgretmenDetay;

public class QueryDersApp {

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
		
		Ders ders1 = session.get(Ders.class, 14);
		
		System.out.println(ders1);
		
		ders1.getOgrenciler().remove(0);
		session.save(ders1);
		
		System.out.println(ders1);
		
		session.getTransaction().commit();	
		
	//
	}
//
}
;