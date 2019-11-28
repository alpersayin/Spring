package com.alpersayin.hibernate.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Calisan;

public class CustomQueryApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Her uygulamada bir adet olmalý
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml") // default
				.addAnnotatedClass(Calisan.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		List<Calisan> calisanList 
		= session.createQuery("from Calisan where firstName like 's%' "
				+ "or lastName = 'ozkan'").getResultList();
		
		for (Calisan calisan : calisanList) {
			System.out.println(calisan);
		}
		
		/*
		Calisan calisan = session.get(Calisan.class, 3);
		System.out.println(calisan);
		*/
		session.getTransaction().commit();
		
	//
	}
//
}
