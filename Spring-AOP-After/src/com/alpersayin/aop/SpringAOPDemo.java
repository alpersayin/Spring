package com.alpersayin.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alpersayin.aop.dao.PersonelDAO;

public class SpringAOPDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context
		= new AnnotationConfigApplicationContext(SpringAOPDemoConfig.class);
		
		PersonelDAO personelDAO = context.getBean("personelDAO",PersonelDAO.class);
		
		personelDAO.addPersonel();
		
		System.out.println("\n");
		personelDAO.addZimmet(5, "telefon");
		
		try {
			System.out.println("\n");
			Integer remZimmet = personelDAO.removeZimmet();
			System.out.println("removeZimmet Result: " + remZimmet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		
		context.close();

	}
	
//
}
