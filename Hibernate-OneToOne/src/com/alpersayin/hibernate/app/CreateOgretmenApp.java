package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Ogretmen;
import com.alpersayin.hibernate.entity.OgretmenDetay;

public class CreateOgretmenApp {

	public static void main(String[] args) {
		// Her uygulamada bir adet olmalý
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		session.beginTransaction();
		
		Ogretmen ogretmen = new Ogretmen("Caner", "Ozkan", "caner@mail");
		
		OgretmenDetay ogretmenDetay = new OgretmenDetay("C#", "spor", "ozkan.com", "fb/caner");
		
		//session.save(ogretmenDetay);
		
		ogretmen.setOgretmenDetay(ogretmenDetay);
		
		session.save(ogretmen);
		
		session.getTransaction().commit();
		
	//
	}
//
}
