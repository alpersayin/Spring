package com.alpersayin.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alpersayin.aop.dao.DepartmentDAO;
import com.alpersayin.aop.dao.PersonelDAO;

public class SpringAOPDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context
		= new AnnotationConfigApplicationContext(SpringAOPDemoConfig.class);
		
		PersonelDAO personelDAO = context.getBean("personelDAO",PersonelDAO.class);
		
		personelDAO.addPersonel();
		
		
		System.out.println("\n");
		personelDAO.addZimmet();

		System.out.println("\n");
		personelDAO.removeZimmet();
		
		
		System.out.println("\n");
		DepartmentDAO deptDAO = context.getBean("departmanDAO",DepartmentDAO.class);
		
		System.out.println("\n");
		deptDAO.addPersonel(1);
		
		deptDAO.setDepartmanId(10);
		deptDAO.setDepartmanName("Java101");
		System.out.println(deptDAO.getDepartmanName());
		
		
		System.out.println("\n");
		deptDAO.addPersonelDAO(personelDAO);
		
		context.close();

	}
	
//
}
