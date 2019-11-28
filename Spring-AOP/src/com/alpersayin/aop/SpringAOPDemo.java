package com.alpersayin.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.alpersayin.aop.dao.DepartmentDAO;
import com.alpersayin.aop.dao.PersonelDAO;

public class SpringAOPDemo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context 
				= new AnnotationConfigApplicationContext(SpringAOPDemoConfig.class);
		
		PersonelDAO personelDAO = context.getBean("personelDAO", PersonelDAO.class);
		DepartmentDAO departmentDAO = context.getBean("departmentDAO", DepartmentDAO.class);
		
		personelDAO.addPersonel();
		personelDAO.addZimmet();
		
		departmentDAO.addPersonel();
		
		context.close();

	}
	
//
}
