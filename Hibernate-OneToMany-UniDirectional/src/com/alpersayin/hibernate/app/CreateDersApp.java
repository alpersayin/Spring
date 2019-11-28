package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Ders;
import com.alpersayin.hibernate.entity.Konu;
import com.alpersayin.hibernate.entity.Ogretmen;
import com.alpersayin.hibernate.entity.OgretmenDetay;

public class CreateDersApp {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ders.class)
				.addAnnotatedClass(Konu.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Ogretmen ogretmen = new Ogretmen("Caner", "Ozkan", "caner@mail");
		
		Ders ders1 = new Ders("java");
		//Ders ders2 = new Ders("c++");
		//Ders ders3 = new Ders("css");
		
		session.save(ders1);
	
		ogretmen.addDers(ders1);
		//ogretmen.addDers(ders2);
		//ogretmen.addDers(ders3);
		
		session.save(ogretmen);
		
		ders1.addKonu(new Konu("Variables","Statik, dinamik, fizik variables"));
		ders1.addKonu(new Konu("Flow control",null));
		ders1.addKonu(new Konu("OOP","OOP"));
		
		session.save(ders1);
		
		session.getTransaction().commit();	
		
	//
	}
//
}
;