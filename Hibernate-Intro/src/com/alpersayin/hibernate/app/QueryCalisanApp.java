package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Calisan;

public class QueryCalisanApp {

	public static void main(String[] args) {
		// Her uygulamada bir adet olmalý
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml") // default
				.addAnnotatedClass(Calisan.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Calisan calisan = session.get(Calisan.class, 5);
		System.out.println(calisan);
		
		session.getTransaction().commit();
		
	//
	}
//
}
