package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Ogretmen;
import com.alpersayin.hibernate.entity.OgretmenDetay;

public class CreateOgretmenDetayApp {

	public static void main(String[] args) {
		// Her uygulamada bir adet olmalý
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		/*
		session.beginTransaction();
		
		Ogretmen ogretmen = new Ogretmen("Omer", "Karakas", "omer@mail");
		OgretmenDetay ogretmenDetay = new OgretmenDetay("SQL", "yazilim", "omer.com", "fb/omer");
		
		ogretmen.setOgretmenDetay(ogretmenDetay);
		ogretmenDetay.setOgretmen(ogretmen);
		
		session.save(ogretmen);
		
		session.getTransaction().commit();
		*/
		session.beginTransaction();

		OgretmenDetay ogretmenDetay = session.get(OgretmenDetay.class, 7);
		
		ogretmenDetay.getOgretmen().setOgretmenDetay(null);
		session.delete(ogretmenDetay);		
		
		session.getTransaction().commit();
		
	//
	}
//
}
