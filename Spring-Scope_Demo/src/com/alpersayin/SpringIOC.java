package com.alpersayin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOC {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		/*
		Employee e1 = context.getBean("empConstruct", Employee.class);
		System.out.println(e1);
		
		Employee e2 = context.getBean("empSetter", Employee.class);
		System.out.println(e2);
		
		Department dep1 = context.getBean("d1", Department.class);
		System.out.println(dep1);
		
		Department dep2 = context.getBean("d2", Department.class);
		System.out.println(dep2);
		*/

		Employee emp1 = context.getBean("emp1", Employee.class);
		System.out.println(emp1);
		

		Employee emp2 = context.getBean("emp2", Employee.class);
		System.out.println(emp2);
		
	}
}
