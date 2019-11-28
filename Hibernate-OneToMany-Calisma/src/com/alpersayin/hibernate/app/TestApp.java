package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Address;
import com.alpersayin.hibernate.entity.Demirbas;
import com.alpersayin.hibernate.entity.Person;

public class TestApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml") 
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Demirbas.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		/*
		Person person = session.get(Person.class, 1);
		
		System.out.println("Person: " + person);
		System.out.println("Demirbas : " + person.getDemirbaslar());
		*/
		
		Demirbas demirbas = session.get(Demirbas.class, 1);
		
		System.out.println("Demirbas: " + demirbas);
		System.out.println("Person: " + demirbas.getPerson());
		
		session.getTransaction().commit();
		
		
		
	}

}
