package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Departmanlar;

public class CreateDepartmentApp {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Departmanlar.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		Departmanlar dep = new Departmanlar();
		dep.setDepartment_id(999);
		dep.setDepartment_name("YAZILIM");
		dep.setLocation_id(1700);
		
		session.beginTransaction();
		session.save(dep);
		session.getTransaction().commit();
		
		System.out.println("inserted " + dep.getDepartment_id());
		
	}
//
}