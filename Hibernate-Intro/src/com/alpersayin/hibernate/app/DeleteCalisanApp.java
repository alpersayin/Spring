package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Calisan;

public class DeleteCalisanApp {

	public static void main(String[] args) {
		// Her uygulamada bir adet olmalý
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml") // default
				.addAnnotatedClass(Calisan.class)
				.buildSessionFactory();
		/*
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Calisan calisan = session.get(Calisan.class, 6);
		System.out.println(calisan);
		
		//calisan.setCity("antalya");
		session.delete(calisan);
		
		session.getTransaction().commit();
		*/
		
		// custom delete
		Session session = factory.getCurrentSession();
		System.out.println("Custom Delete");
		session.beginTransaction();
		
		System.out.println("Basliyor");
		session.createQuery("DELETE Calisan "
				+ "WHERE city = null").executeUpdate();
		
		System.out.println("Geliyor");
		session.getTransaction().commit();
		
	//
	}
//
}
