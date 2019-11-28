package com.alpersayin.hibernate.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.alpersayin.hibernate.entity.Ders;
import com.alpersayin.hibernate.entity.Ogretmen;
import com.alpersayin.hibernate.entity.OgretmenDetay;

public class QueryOgretmenApp {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ders.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Query<Ogretmen> query = session.createQuery(""
				+ "SELECT o FROM Ogretmen o "
				+ "JOIN FETCH o.dersler "
				+ "WHERE o.id=:id", Ogretmen.class);
		query.setParameter("id", 3);
		
		Ogretmen ogretmen = query.getSingleResult();
		
		System.out.println("Ogretmen: " + ogretmen);
		System.out.println("Dersler : " + ogretmen.getDersler());
		
		session.getTransaction().commit();
		
		
	//	
	}
//
}
