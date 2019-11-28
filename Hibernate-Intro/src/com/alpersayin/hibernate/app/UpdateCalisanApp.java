package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Calisan;

public class UpdateCalisanApp {

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
		
		calisan.setCity("antalya");
		
		session.getTransaction().commit();
		
		// custom update
		session = factory.getCurrentSession();
		System.out.println("Custom Update");
		session.beginTransaction();
		
		System.out.println("Basliyor");
		session.createQuery("UPDATE Calisan SET city='adana' "
				+ "WHERE firstName like 's%'").executeUpdate();
		
		System.out.println("Geliyor");
		session.getTransaction().commit();
		
	//
	}
//
}
