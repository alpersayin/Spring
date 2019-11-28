package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Ders;
import com.alpersayin.hibernate.entity.Ogretmen;
import com.alpersayin.hibernate.entity.OgretmenDetay;

public class CreateDersApp {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ders.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Ogretmen ogretmen = session.get(Ogretmen.class, 3);
		
		Ders ders1 = new Ders("Muzik");
		Ders ders2 = new Ders("Sinema");
		Ders ders3 = new Ders("Tiyatro");
		
		Ders ders = session.get(Ders.class, 1);
		ders.setOgretmen(ogretmen);
		ogretmen.addDers(ders);
		session.save(ders);
		/*
		ogretmen.addDers(ders1);
		ogretmen.addDers(ders2);
		ogretmen.addDers(ders3);
		*/
		session.save(ogretmen);
		
		session.getTransaction().commit();	
		
	//
	}
//
}
;