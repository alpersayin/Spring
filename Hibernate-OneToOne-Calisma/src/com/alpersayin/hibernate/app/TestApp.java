package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Address;
import com.alpersayin.hibernate.entity.Person;

public class TestApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml") 
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Address.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		/*
		session.beginTransaction();
		
		Person person = session.get(Person.class, 3);
		
		if (person == null) {
			System.out.println("farkli id girin");
		} else session.delete(person);
		
		session.getTransaction().commit();
		*/
		
		session.beginTransaction();

		Address address = session.get(Address.class, 5);
		
		System.out.println("Address	: " + address);
		System.out.println("Person 	: " + address.getPerson());		
		
		session.getTransaction().commit();
		
	}

}
