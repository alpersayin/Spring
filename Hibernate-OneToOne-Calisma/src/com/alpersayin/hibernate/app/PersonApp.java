package com.alpersayin.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.alpersayin.hibernate.entity.Address;
import com.alpersayin.hibernate.entity.Person;

public class PersonApp {
	public static void main(String[] args) {
		// Her uygulamada bir adet olmalý
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Person.class)
						.addAnnotatedClass(Address.class)
						.buildSessionFactory();
				
				Session session = factory.getCurrentSession();

				session.beginTransaction();
				
				Person person = new Person("Caner", "Ozkan", "0544123", "caner@mail");
				
				Address address = new Address("Karanfil", "Kizilay", "Ankara");
				
				//session.save(ogretmenDetay);
				
				person.setAddress(address);
				
				session.save(person);
				
				session.getTransaction().commit();
	}
}
