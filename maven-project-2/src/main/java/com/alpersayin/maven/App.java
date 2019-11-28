package com.alpersayin.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").addAnnotatedClass(Department.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Department dep = new Department();
		dep.setDepName("Deneme");
		dep.setLocationId(1700);
		
		session.save(dep);
		session.getTransaction().commit();
		
		System.out.println("inserted " + dep.getDepId());
 
    }
}
