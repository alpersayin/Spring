package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Calisan;

public class CreateCalisanApp {

	public static void main(String[] args) {
		// Her uygulamada bir adet olmalý
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Calisan.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		Calisan calisan = new Calisan("sevgi", "bayrakli");
		calisan.setCity("ankara");
		
		session.beginTransaction();
		session.save(calisan);
		session.getTransaction().commit();
		
		System.out.println("id of inserted record " + calisan.getCalisanID());
	//
	}
//
}
