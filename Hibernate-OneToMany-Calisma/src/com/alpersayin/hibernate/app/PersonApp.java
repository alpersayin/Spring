package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Address;
import com.alpersayin.hibernate.entity.Demirbas;
import com.alpersayin.hibernate.entity.Person;

public class PersonApp {
	public static void main(String[] args) {
		// Her uygulamada bir adet olmalý
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Person.class)
						.addAnnotatedClass(Address.class)
						.addAnnotatedClass(Demirbas.class)
						.buildSessionFactory();
				
				Session session = factory.getCurrentSession();

				session.beginTransaction();
				
				Person person = new Person("Omer", "Karakas", "05551111", "omer@mail");
				Address address = new Address("Ulus", "Cankaya", "Ankara");
				
				//session.save(ogretmenDetay);
				
				Demirbas demirbas = new Demirbas("Masa", "Mobilya");
				
				person.setAddress(address);
				
				session.save(person);
				
				session.getTransaction().commit();
	}
}
