package com.alpersayin.hibernate.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Departmanlar;

public class QueryDepartmentApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Departmanlar.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		List<Departmanlar> list = session.createQuery("FROM Departmanlar "
				+ "WHERE location_id = 1700").getResultList();
		
		for (Departmanlar dep : list) {
			System.out.println(dep);
		}
		
		session.getTransaction().commit();
	//	
	}

}
