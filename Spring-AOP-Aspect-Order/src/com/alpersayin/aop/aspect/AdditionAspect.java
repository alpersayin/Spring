package com.alpersayin.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class AdditionAspect {
	
	@Pointcut("execution(* org.omer.aop.dao.*.add*())")
	private void allDAOClassesAllAddMethods() {}
	
	@Before("allDAOClassesAllAddMethods()")
	public void beforeAddPersonel() {
		System.out.println("ASPECT, bir metod �a�r�s�...");
	}

	@Before("allDAOClassesAllAddMethods()")
	public void beforeAddAll() {
		System.out.println("ASPECT, bir�ey ekleniyor. All");
	}
	
	@Before("allDAOClassesAllAddMethods()")
	public void beforeAddAny() {
		System.out.println("ASPECT, bir�ey ekleniyor. Any");
	}
	
/*
* 	@Before("execution(* add*())")

	public void beforeAddAll() {
		System.out.println("ASPECT, bir�ey ekleniyor...");
	}
*/
}
